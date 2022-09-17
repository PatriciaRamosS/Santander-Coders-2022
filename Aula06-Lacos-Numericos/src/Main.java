public class Main {
    public static void main(String[] args) {

        int i = 0, num=0;

        /*for(i=1;i<=5;i++) {
            num=num+1;
            System.out.println(num);
        }*/

        //Para cada iteração do i eu terei 10 iterações do j
        for(i=1;i<=10;i++) {
            for(int j=1;j<=10;j++) {
                System.out.println(j + "X" + i + "=" + j*i);
            }

        }
    }
}