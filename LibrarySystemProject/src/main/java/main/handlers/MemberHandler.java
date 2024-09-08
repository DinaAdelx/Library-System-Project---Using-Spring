package main.handlers;

import lombok.AllArgsConstructor;
import main.entities.Member;
import main.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Transactional
@Service
public class MemberHandler {
    @Autowired
    public MemberService memberService;
    //insert
    public Member insertMemberHandler(Member member)
    {
        memberService.insertMemberService(member);
        return member;

    }

    //get all members
    public List<Member> getAllMembersHandler()
    {
        return memberService.getAllMembersService();
    }
}
