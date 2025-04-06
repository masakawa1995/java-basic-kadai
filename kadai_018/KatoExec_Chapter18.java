public class KatoExec_Chapter18 {
    public static void main(String[] args) {
        Kato_Chapter18[] members = {
            new KatoTaro_Chapter18(),
            new KatoIchiro_Chapter18(),
            new KatoHanako_Chapter18()
        };

        // それぞれに名前をセット
        members[0].setGivenName("太郎");
        members[1].setGivenName("一郎");
        members[2].setGivenName("花子");

        for (Kato_Chapter18 member : members) {
            member.execIntroduce();
            System.out.println();
        }
    }
}
