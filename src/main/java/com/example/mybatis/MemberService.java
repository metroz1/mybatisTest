package com.example.mybatis;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberMapper memberMapper;
    public ResponseEntity<?> findAll() {


        ArrayList<HashMap<String, Object>> memberList = memberMapper.findAll();

        return new ResponseEntity<>(memberList, HttpStatus.OK);
    }

    public ResponseEntity<?> findOne(String name) {

        HashMap<String, Object> member = memberMapper.findByName(name);

        return new ResponseEntity<>(member, HttpStatus.OK);
    }


}
