package no4;

 class Calculation {

     // Konstanta
     private static final double GRAVITATIONAL_CONSTANT = 6.67430e-11; // Konstanta gravitasi dalam m^3 kg^-1 s^-2
     private static final double GRAVITY_EARTH = 9.81; // Gravitasi bumi dalam m/s^2
    //  Constructor untuk menampilkan informasi awal
     public Calculation(){
        System.out.println("Selamat Datang di Program Kalkulator Fisika dan Matematika");
    }

    // Overloading metode untuk menghitung luas lingkaran
    public double calculate(double radius){
        return Math.PI * radius *radius;
    }

    // Overloading metode untuk menghitung volume bola
    public double calculate(double radius, boolean isVolume){
        if(isVolume){
            return(4.0/3.0) * Math.PI *Math.pow(radius,3);
        } else {
            return calculate(radius);
        }
    }
     // Overloading metode untuk hukum Newton kedua
    public double calculate(double mass, double acceleration){
        return mass*acceleration;
    }

     // Overloading metode untuk rumus gravitasi universal
     public double calculate(double mass1, double mass2, double distance) {
         return GRAVITATIONAL_CONSTANT * (mass1 * mass2) / Math.pow(distance, 2);
     }

     // Metodh untuk menghitung persamaan gerak parabola
     public double[] calculateProjectileMotion(double initialVelocity, double angle) {
         double g = 9.81; // Gravitasi dalam m/s^2
         double radianAngle = Math.toRadians(angle);
         double timeOfFlight = (2 * initialVelocity * Math.sin(radianAngle)) / g;
         double maxHeight = Math.pow(initialVelocity * Math.sin(radianAngle), 2) / (2 * g);
         double range = Math.pow(initialVelocity, 2) * Math.sin(2 * radianAngle) / g;
         return new double[] {timeOfFlight, maxHeight, range};
     }


     // Metodh untuk menghitung energi kinetik
     public double calculateKineticEnergy(double mass, double velocity) {
         return 0.5 * mass * Math.pow(velocity, 2);
     }

     // Metodh untuk menghitung energi potensial
     public double calculatePotentialEnergy(double mass, double height) {
         double g = 9.81; // Gravitasi dalam m/s^2
         return mass * g * height;
     }

     // Metodh untuk menghitung integral sederhana
     public double calculateIntegral(double a, double b) {
         // Misalkan fungsi yang diintegralkan adalah f(x) = x^2
         // Integral dari x^2 adalah (1/3)x^3
         return (1.0 / 3.0) * (Math.pow(b, 3) - Math.pow(a, 3));
     }

}