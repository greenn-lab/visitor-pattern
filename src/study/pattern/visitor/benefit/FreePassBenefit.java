package study.pattern.visitor.benefit;

import study.pattern.visitor.member.GoldMember;
import study.pattern.visitor.member.VipMember;

public class FreePassBenefit implements Benefit {
  
  @Override
  public void getBenefit(GoldMember member) {
    System.out.println("GOLD Free-pass");
  }
  
  @Override
  public void getBenefit(VipMember member) {
    System.out.println("VIP Free-pass");
  }
  
}
