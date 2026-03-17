package org.example.spring_develop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    MemberRepository memberRepository;

    public List<Member> getAllMembers() {

        return memberRepository.findAll();
    }


//    public List<Member> saveMember(Member member) {
//        return memberRepository.save(member);
//
//    }
}
