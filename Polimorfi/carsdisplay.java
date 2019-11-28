public class carsdisplay {
    public static void main(String [] args){
        cars TvaForti = new Volvo(new String("4"));
        cars MtreEtretti = new BMW(new String("4"));
        cars TreEettaGTB = new Ferrari(new String("2"));

        cars cardisplay [] = {TvaForti, MtreEtretti, TreEettaGTB};
        for(cars car: cardisplay){
            System.out.println(car.getWheels());
            System.out.println(car.Color());
            System.out.println(car.Numberplat());
            System.out.println(car.Year());
        }
    }

}
