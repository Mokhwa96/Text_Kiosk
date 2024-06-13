public class Main {
    public static void main(String[] args) {
        System.out.println("[안내]안녕하세요. 김밥천국에 오신 것을 환영합니다.");
        System.out.println("------------------------------");
        int total_price = 0;
        kiosk_program kiosk = new kiosk_program();
        while(true) {
            int menu_num = (int) kiosk.input_print();
            if (menu_num == 0){
                break;
            }
            int count = (int) kiosk.count();
            total_price = kiosk.middle_price(total_price, menu_num,count);
        }
        kiosk.Final_price(total_price);
    }
}