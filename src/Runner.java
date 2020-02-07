public class Runner {
        public static void main(String[] args){
        Car Lambo = new Car (2015,  10000, "aventador","Lambourghini");
            Lambo.setYear(2014);
            System.out.println(Lambo.getYear());

            Lambo.setMiles(100);
            Lambo.drive(10);
            System.out.println(Lambo.getMiles());

            Lambo.setModel("Huracan");
            System.out.println(Lambo.getModel());

            Lambo.setMake("Lambourghini");
            System.out.println(Lambo.getMake());


            Rectangle Sweg = new Rectangle (8, 8);
            System.out.println(Sweg.getLength());
            System.out.println(Sweg.getLength());

            Sweg.setLength(6);
            Sweg.setWidth(6);

            System.out.println(Sweg.getArea());
            System.out.println(Sweg.getDiagonal());
            System.out.println(Sweg.isSquare());
        }
}
