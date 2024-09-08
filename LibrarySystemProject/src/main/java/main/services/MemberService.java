package main.services;

import lombok.AllArgsConstructor;
import main.entities.Member;
import main.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Transactional
@Service
public class MemberService {
    @Autowired
    public MemberRepository memberRepository;

    //insert
    public Member insertMemberService(Member member)
    {
        memberRepository.save(member);
        return member;
    }

    //get all memebers
    public List<Member> getAllMembersService()
    {
        return (List<Member>) memberRepository.findAll();
    }
}
