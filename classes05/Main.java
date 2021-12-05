package by.introduction.fourth.classes05.main;
/*
 4. Programming with classes

    Простейшие классы и объекты.

5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать 
   свое значение на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика 
   значениями по умолчанию и произвольными значениями. Счетчик имеет методы увеличения и 
   уменьшения состояния, и метод позволяющий получить его текущее состояние. Написать код, 
   демонстрирующий все возможности класса.

 */
public class Main {
	
    public static void main(String[] args) {
    
        Counter defaultCounter = new Counter();	
		Logic log = new Logic();		
		View view = new View();
        
		view.printСurrentСounterValue("Counter initialization default values \nInitialized counter: ", defaultCounter.showCounter());

        for (int i = 0; i < 12; i++) {
        	defaultCounter.setCount(log.increase(defaultCounter.getMinValue(), defaultCounter.getMaxValue(), defaultCounter.getCount()));        	
        }

        view.printСurrentСounterValue("Counter after increasing: ", defaultCounter.showCounter());
       
        defaultCounter.setCount(log.decrease(defaultCounter.getMinValue(), defaultCounter.getMaxValue(), defaultCounter.getCount()));
        
        view.printСurrentСounterValue("Counter after decreasing: ", defaultCounter.showCounter());
        System.out.println();
        
        
        Counter arbitraryCounter = new Counter(10, 40, 12);
        
        
		view.printСurrentСounterValue("Initialization with arbitrary values \nInitialized counter: ", arbitraryCounter.showCounter());
        for (int i = 0; i < 10; i++) {
        	arbitraryCounter.setCount(log.increase(arbitraryCounter.getMinValue(), arbitraryCounter.getMaxValue(), arbitraryCounter.getCount()));
        }
         
        view.printСurrentСounterValue("Counter after increasing: ", arbitraryCounter.showCounter());
        
        arbitraryCounter.setCount(log.decrease(arbitraryCounter.getMinValue(), arbitraryCounter.getMaxValue(), arbitraryCounter.getCount()));
        
        view.printСurrentСounterValue("Counter after decreasing: ", arbitraryCounter.showCounter());        
    }
}
