import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConditionerTest {
    @Test //Создаем тест, который проверяет что кондиционеру можно выставить температуру
    public void shouleSetTemperature() { //Создаем название теста
        Conditioner cond = new Conditioner();/*Создаем объект нашего кондиционера, создаем
         переменную нашего кондиционера(Conditioner cond) и кладем туда
         ново созданный объект(new Conditioner)**/
        cond.setCurrentTemperature(15);//Тестируемые действия, попытаемся туда положить температуру 15,
        // именно так мы обращаемся с полями
        int expected = 15; //Ожидаемая температура
        int actual = cond.getCurrentTemperature();//Фактическая температура

        Assertions.assertEquals(expected,
                actual);//Проверяем совпадает ли ожидаемая температура с фактической
    }

    @Test //Тест, не должен выставлять температуру выше максимума
    public void shoulNotSetTemperatureAboveMax() {
        Conditioner cond = new Conditioner();//Делаем подготовительное действие

        cond.setCurrentTemperature(50);//Делаем действие, которое тестируем

        int expected = 0;
        int actual = cond.getCurrentTemperature();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseTemperature50p() {
        Conditioner cond = new Conditioner();
        cond.setCurrentTemperature(25);/*Подготовка кондиционера к тестируемому действиюПросим кондиционер
  выставить себе текущую температуру 10 градусов**/

        cond.increaseTemp50p();//Просим кондиционер увеличить температуру на 50 процентов

        int expected = 25;
        int actual = cond.getCurrentTemperature();

        Assertions.assertEquals(expected, actual);
    }

    @Test // Тест, который будет проверять что выставилась действительно максимальная температура
    public void shouldSetToMaxTemperature() {
        Conditioner cond = new Conditioner();

        cond.setToMaxTemp();//Выполняем тестируемое действие
        int expected = 30;// Мы знаем кокая должна быть температура
        int actual = cond.getCurrentTemperature();//Мы спрашиваем через обращение к полю(currentTemperature)

        Assertions.assertEquals(expected, actual);//Делаем проверку(ассерт)
    }
}
