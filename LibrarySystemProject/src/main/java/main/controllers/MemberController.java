package main.controllers;

import main.entities.Member;
import main.handlers.MemberHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Member")
public class MemberController {
    @Autowired
    public MemberHandler memberHandler;
    @PostMapping
    public Member insertMember(Member member)
    {
        return memberHandler.insertMemberHandler(member);
    }

    @GetMapping
    public List<Member> getAllMembers()
    {
        return memberHandler.getAllMembersHandler();
    }
}
