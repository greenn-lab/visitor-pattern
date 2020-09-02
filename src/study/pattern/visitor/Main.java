package study.pattern.visitor;

import study.pattern.visitor.benefit.Benefit;
import study.pattern.visitor.benefit.BenefitImpl;
import study.pattern.visitor.member.GoldMember;
import study.pattern.visitor.member.Member;
import study.pattern.visitor.member.VipMember;

public class Main {

    public static void main(String[] args) {
      Member goldMember = new GoldMember();
      Member vipMember = new VipMember();
  
      Benefit benefit = new BenefitImpl();
      
      benefit.point(goldMember);
      benefit.point(vipMember);
      
      benefit.discount(goldMember);
      benefit.discount(vipMember);
    }
    
}
