package com.example.mybatis;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/app")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/findAll")
    public ResponseEntity<?> findAllMember() {

        return memberService.findAll();
    }
//
//    @GetMapping("/findOne")
//    publi

}
