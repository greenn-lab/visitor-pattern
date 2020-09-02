package study.pattern.visitor.member;

public class VipMember implements Member {
  
  @Override
  public void point() {
    System.out.println("VIP Point");
  }
  
  @Override
  public void discount() {
    System.out.println("VIP Discount");
  }
  
}
