class detail
{
 private String name;
 private int Regno;
 public String getname()
 {
  return name;
 }
 public int getRegno()
 {
  return Regno;
 }
 public void setname(String n)
 {
  this.name=n;
 }
  public void setRegno(int r)
 {
  this.Regno=r;
 }
}
class detailmain
{
 public static void main(String a[])
 {
  detail d=new detail();
           d.setname("Akshu");
           d.setRegno(171);
  System.out.println("Student name is:"+d.getname());
  System.out.println("Student Regno is:"+d.getRegno());
 }
}