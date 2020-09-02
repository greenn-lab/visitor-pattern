package study.pattern.visitor.benefit;

import study.pattern.visitor.member.GoldMember;
import study.pattern.visitor.member.VipMember;

public interface Benefit {
  
  void getBenefit(GoldMember member);
  
  void getBenefit(VipMember member);
  
}
