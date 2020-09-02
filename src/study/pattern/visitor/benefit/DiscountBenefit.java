package study.pattern.visitor.benefit;

import study.pattern.visitor.member.GoldMember;
import study.pattern.visitor.member.VipMember;

public class DiscountBenefit implements Benefit {
  
  @Override
  public void getBenefit(GoldMember member) {
    System.out.println("GOLD Discount");
  }
  
  @Override
  public void getBenefit(VipMember member) {
    System.out.println("VIP Discount");
  }
  
}
