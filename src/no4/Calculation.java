package no4;

 class Calculation {
    public Calculation(){
        System.out.println("Selamat Datang di Program Kalkulator Fisika dan Matematika");
    }

    public double calculate(double radius){
        return Math.PI * radius *radius;
    }

    public double calculate(double radius, boolean isVolume){
        if(isVolume){
            return(4.0/3.0) * Math.PI *Math.pow(radius,3);
        } else {
            return calculate(radius);
        }
    }
    public double calculate(double mass, double acceleration){
        return mass*acceleration;
    }

     public double calculate(double mass1, double mass2, double distance) {
         double G = 6.67430e-11; // Konstanta gravitasi dalam m^3 kg^-1 s^-2
         return G * (mass1 * mass2) / Math.pow(distance, 2);
     }

     public double[] calculateProjectileMotion(double initialVelocity, double angle) {
         double g = 9.81; // Gravitasi dalam m/s^2
         double radianAngle = Math.toRadians(angle);
         double timeOfFlight = (2 * initialVelocity * Math.sin(radianAngle)) / g;
         double maxHeight = Math.pow(initialVelocity * Math.sin(radianAngle), 2) / (2 * g);
         double range = Math.pow(initialVelocity, 2) * Math.sin(2 * radianAngle) / g;
         return new double[] {timeOfFlight, maxHeight, range};
     }

     public double calculateKineticEnergy(double mass, double velocity) {
         return 0.5 * mass * Math.pow(velocity, 2);
     }
}