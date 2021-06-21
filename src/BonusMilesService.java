public class BonusMilesService {
    public int calculate(int price) {
        int rub = 20; //сумма за которую копятся бонусы
        int bonusmili = 1; //сколько миль начисляется за 1 значение rub
        int miles = 0;
        if (price >= rub) {
            miles = price / rub * bonusmili;
        }else {
            price = 0;
        }
        return miles;
    }
}
