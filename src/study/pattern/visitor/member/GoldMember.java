package study.pattern.visitor.member;

import study.pattern.visitor.benefit.Benefit;

public class GoldMember implements Member {
  
  @Override
  public void accept(Benefit benefit) {
    benefit.getBenefit(this);
  }
  
}
