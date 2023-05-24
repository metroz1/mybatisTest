package com.example.mybatis;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/app")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/members-lists")
    public ResponseEntity<?> findAllMember() {

        return memberService.findAll();
    }

    @GetMapping("/members")
    public ResponseEntity<?> findMember(@RequestParam("name") String name) {

        return memberService.findOne(name);
    }

    @PostMapping("/members")
    public ResponseEntity<?> insertMember(@RequestBody MemberRequestDto memberRequestDto) {

        return memberService.insertMemeber(memberRequestDto);
    }

}
