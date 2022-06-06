public class BoxDemo2 {
        public static void main(String args[]) {
            //Object
            Вох mybox1 = new Вох();
            Вох mybox2 = new Вох();
            double vol;
            // присвоить значения переменным э кземпляра myЬoxl
            mybox1.setWidth(10);
            mybox1.setHeight(20);
            mybox1.setDepth(15);
            //* присвоить другие значения переменным
            //э кземпляра шуЬох2 */
            mybox2.setWidth(3);
            mybox2.setHeight(6);
            mybox2.setDepth(9);

            System.out.println(mybox1);

            double width = mybox1.getWidth();


            // 11 рассчитать объем первого параллелепипеда
            vol = mybox1.getWidth() * mybox1.getHeight() * mybox1.getDepth();
            System.out.println("Oбъeм равен " + vol);
// рассчитать объем второго параллелепипеда
            vol = mybox2.getWidth() * mybox2.getHeight() * mybox2.getDepth();
            System.out.println(" Oбъeм равен " + vol);
        }
    }


