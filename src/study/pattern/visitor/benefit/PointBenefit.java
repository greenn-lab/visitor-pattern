package study.pattern.visitor.benefit;

import study.pattern.visitor.member.GoldMember;
import study.pattern.visitor.member.VipMember;

public class PointBenefit implements Benefit {
  
  @Override
  public void getBenefit(GoldMember member) {
    System.out.println("GOLD Point");
  }
  
  @Override
  public void getBenefit(VipMember member) {
    System.out.println("VIP Point");
  }
  
}
