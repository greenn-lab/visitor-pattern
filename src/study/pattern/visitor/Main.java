package study.pattern.visitor;

import study.pattern.visitor.benefit.Benefit;
import study.pattern.visitor.benefit.DiscountBenefit;
import study.pattern.visitor.benefit.FreePassBenefit;
import study.pattern.visitor.benefit.PointBenefit;
import study.pattern.visitor.member.GoldMember;
import study.pattern.visitor.member.Member;
import study.pattern.visitor.member.VipMember;

public class Main {

    public static void main(String[] args) {
      Member goldMember = new GoldMember();
      Member vipMember = new VipMember();
  
      Benefit pointBenefit = new PointBenefit();
      Benefit discountBenefit = new DiscountBenefit();
      Benefit freePassBenefit = new FreePassBenefit();
      
      goldMember.accept(pointBenefit);
      vipMember.accept(pointBenefit);
      
      goldMember.accept(discountBenefit);
      vipMember.accept(discountBenefit);
      
      goldMember.accept(freePassBenefit);
      vipMember.accept(freePassBenefit);
    }
    
}
