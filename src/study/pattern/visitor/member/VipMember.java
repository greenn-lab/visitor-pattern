package study.pattern.visitor.member;

import study.pattern.visitor.benefit.Benefit;

public class VipMember implements Member {

  public void accept(Benefit benefit) {
    benefit.getBenefit(this);
  }

}
