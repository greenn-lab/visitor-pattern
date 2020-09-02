package study.pattern.visitor.member;

public class GoldMember implements Member {

  @Override
  public void point() {
    System.out.println("GOLD Point");
  }
  
  @Override
  public void discount() {
    System.out.println("GOLD Discount");
  }

}
