public abstract class Kato_Chapter18 {
  public String familyName = "加藤";
  public String givenName;
  public String address = "東京都中野区〇〇";

  public void commonIntroduce() {
      System.out.println("名前は" + familyName + givenName + "です。");
      System.out.println("住所は" + address + "です。");
  }

  public void setGivenName(String name) {
      this.givenName = name;
  }

  public abstract void eachIntroduce();

  public void execIntroduce() {
      commonIntroduce();
      eachIntroduce();
  }
}
