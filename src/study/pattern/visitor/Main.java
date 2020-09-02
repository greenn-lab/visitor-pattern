package study.pattern.visitor;

import study.pattern.visitor.member.GoldMember;
import study.pattern.visitor.member.Member;
import study.pattern.visitor.member.VipMember;

public class Main {

    public static void main(String[] args) {
      Member goldMember = new GoldMember();
      Member vipMember = new VipMember();
      
      goldMember.point();
      vipMember.point();
      
      goldMember.discount();
      vipMember.discount();
      
    }
    
}
