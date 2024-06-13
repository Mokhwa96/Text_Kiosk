import java.util.Scanner;

public class kiosk_program {

    Scanner input = new Scanner(System.in);
    public double input_print(){
        while (true) {
            System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요. 주문을 끝내시려면 0번을 눌러주세요.");
            System.out.println("1) 김밥(1000원) 2) 계란 김밥(1500원) 3) 충무 김밥(1000원) 4) 떡볶이(2000원)");
            double menu_number = input.nextDouble();
//            System.out.println(menu_number);
            if (menu_number <= 4 && 0<=menu_number && menu_number%1 == 0){
                return menu_number;
            } else {
                System.out.println("[안내]메뉴에 포함된 번호를 입력하여 주세요.");
            }
        }
    }

    public double count(){
        while (true){
        System.out.println("------------------------------");
        System.out.println("[안내]선택하신 메뉴의 수량을 입력하여 주세요.");
        System.out.println("(※ 최대 주문 가능 수량 : 99)");
        double count = input.nextDouble();
        if (count <= 99 && 1<=count && count%1 == 0){
            return count;
        } else {
            System.out.println(String.format("[경고]%.0f개는 입력하실 수 없습니다.",count));
            System.out.println("[경고]수량 선택 화면으로 돌아갑니다.");
            }
        }
    }

    public int middle_price(int total_price,int menu_num, int count ){
        int [] prices = {1000,1500,1000,2000};
        int price = prices[menu_num-1];
        total_price += price * count;
        System.out.println(String.format("[안내]현재 주문하신 메뉴의 총 금액은 %d원 입니다.",total_price));
        return total_price;
    }

    public void Final_price(int total_price){
        System.out.println(String.format("[안내]주문하신 메뉴의 총 금액은 %d원 입니다.",total_price));
        System.out.println("[안내]이용해 주셔서 감사합니다.");
}}
