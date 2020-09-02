package study.pattern.visitor.benefit;

import study.pattern.visitor.member.GoldMember;
import study.pattern.visitor.member.Member;
import study.pattern.visitor.member.VipMember;

public class BenefitImpl implements Benefit {
  
  @Override
  public void point(Member member) {
    
    if (member instanceof GoldMember)
      System.out.println("GOLD Point");
    
    if (member instanceof VipMember)
      System.out.println("VIP Point");
  
  }
  
  @Override
  public void discount(Member member) {
    if (member instanceof GoldMember)
      System.out.println("GOLD Discount");
    
    if (member instanceof VipMember)
      System.out.println("VIP Discount");
  }
}
