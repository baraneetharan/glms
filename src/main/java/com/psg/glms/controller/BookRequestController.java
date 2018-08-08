package com.psg.glms.controller;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.Stream.*;

@RestController
@RequestMapping("api/Bookrequest")
public class BookRequestController {

            @Autowired
        private BookCategoryRepository bookCategoryRepository;
        @Autowired
        private BookRequestRepository bookRequestRepository;

        @Autowired
        private BookreviewRepository bookreviewRepository;
        @Autowired
        private LikereviewRepository likereviewRepository;

        @Autowired
        private Properties Libraryprop1;

        @RequestMapping(value = "/userwise/{userId}", method = RequestMethod.GET)
        public void userwise(@PathVariable Long userId) {
                List<BookRequest> lstBookRequest2 = bookRequestRepository.findAll();
                List<BookRequest> lstBookRequest1 = bookRequestRepository.findByUserid(userId);
                List<Bookreview> reviewlist = bookreviewRepository.findAll();
                List<Likereview> likelist = likereviewRepository.findAll();

                lstBookRequest1.stream().forEach(System.out::println);
                System.out.println("*********************");

                long books = lstBookRequest1.stream().count();
                System.out.println("No. of  books:" + books);

                Map<String, Long> strmap = lstBookRequest1.stream()
                                .collect(Collectors.groupingBy(BookRequest::getCategory, Collectors.counting()));
                System.out.println("Category wise count:" + strmap);

                Map<Object, Object> collect = strmap.entrySet().stream().filter(map -> map.getValue() > 1)
                                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
                System.out.println("More than one book taken from Category:" + collect);

                Map<String, Long> distinctcat = strmap.entrySet().stream().filter(map -> map.getValue() == 1)
                                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
                System.out.println("Distinct Category:" + distinctcat);

                System.out.println("**********POINT********");
                Long list = strmap.entrySet().stream().filter(map -> map.getValue() >= 2).map(x -> x.getKey())
                                .collect(Collectors.counting());
                Long list1 = strmap.entrySet().stream().collect(Collectors.counting());

                System.out.println("the points for books is :" + books * Libraryprop1.getpointsperbook());
                System.out.println("the point for each catergory :" + list1 * Libraryprop1.getpointspercategory());
                System.out.println("catergory points for more than 2 books in single cat "
                                + list * Libraryprop1.getmorethan5());

                List<Long> reviewbook = reviewlist.stream().filter(x -> x.getUserid() == userId)
                                .map(x -> x.getBookrevid()).collect(Collectors.toList());

                List<Long> likebook = likelist.stream().map(x -> x.getBookrewid()).filter(reviewbook::contains)
                                .distinct().collect(Collectors.toList());

                Long reviewpoint = reviewbook.stream().collect(Collectors.counting());
                System.out.println("the reviewpoint:" + reviewpoint * Libraryprop1.getReviewpints());

                Long likepoint = likebook.stream().collect(Collectors.counting());
                System.out.println("the liked point :" + likepoint * Libraryprop1.getLikedpoints());

                Long likedbookstaken = lstBookRequest2.stream().map(x -> x.getBookreqid()).filter(reviewbook::contains)
                                .collect(Collectors.counting());
                System.out.println("the points for liked book took by other users: "
                                + likedbookstaken * Libraryprop1.getTakenlikedbooks());

        }

        @RequestMapping(value = "/", method = RequestMethod.GET)
        List<BookCategory> bookcategory() {
                return bookCategoryRepository.findAll();
        }
        @RequestMapping(value = "/bookRequest", method = RequestMethod.GET)
  ResponseEntity<List<BookRequest>> bookRequest() {
                return new ResponseEntity<List<BookRequest>> ( bookRequestRepository.findAll(), HttpStatus.OK);
             
        }

        @RequestMapping(value = "/bookReview", method = RequestMethod.GET)
        List<Bookreview> bookReview() {
                return bookreviewRepository.findAll();
        }

        @RequestMapping(value = "/likeReview", method = RequestMethod.GET)
        List<Likereview> likeReview() {
                return likereviewRepository.findAll();
        }

}
