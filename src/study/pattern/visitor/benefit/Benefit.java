package study.pattern.visitor.benefit;

import study.pattern.visitor.member.Member;

public interface Benefit {
  
  void point(Member member);
  
  void discount(Member member);
  
}
