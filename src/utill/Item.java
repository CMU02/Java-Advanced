package utill;

/**
 * 핵심 : 데이터보호 + 외부에서 잘못된 접근 방지
 * 캡슐화 적용 -> private + getter / setter
 */
public class Item {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("가격이 0 이상이어야 합니다.");
        }
        this.price = price;
    }

    public Item(String name, int price) {
        this.name = name;
        setPrice(price);
    }
}
