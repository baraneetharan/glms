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
    private BookRequestRepository bookRequestRepository;

    @RequestMapping("/userwise/{userId}")
    public void userwise(@PathVariable Long userId) {
        List<BookRequest> lstBookRequest = bookRequestRepository.findAll();
        lstBookRequest.stream().filter(x -> userId == (x.getUserid())).forEach(System.out::println);
        
        long l = lstBookRequest.stream().filter(x -> userId == (x.getUserid())).distinct().count();
        System.out.println("No. of distinct books:" + l);
        List<String> categories = lstBookRequest.stream().filter(x -> userId == (x.getUserid()))
                .filter(distinctByKey(BookRequest::getCategory)).map(x -> x.getCategory()).collect(Collectors.toList());
        System.out.println("Distinct category:" + categories);

        Map<String, Long> strmap = lstBookRequest.stream().filter(x -> userId == (x.getUserid()))
                .collect(Collectors.groupingBy(BookRequest::getCategory, Collectors.counting()));
        System.out.println("Category wise count:"+strmap);

        Map<Object, Object> collect = strmap.entrySet().stream().filter(map -> map.getValue() > 1)
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
        System.out.println("More than one book taken from Category:"+collect);       

    }

    @RequestMapping("/findall")
    public void findAllByStream() {
        List<BookRequest> lstBookRequest = bookRequestRepository.findAll();

        Map<Long, Map<String, Set<String>>> result = lstBookRequest.stream()
                // .filter(x -> 1 == (x.getUserid()))
                .collect(Collectors.groupingBy(BookRequest::getUserid, Collectors.groupingBy(BookRequest::getCategory,
                        Collectors.mapping(BookRequest::getBook, Collectors.toSet()))));

        System.out.println(result);

    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }

}
