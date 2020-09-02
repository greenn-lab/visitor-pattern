package study.pattern.visitor.member;

import study.pattern.visitor.benefit.Benefit;

public interface Member {

  void accept(Benefit benefit);

}
