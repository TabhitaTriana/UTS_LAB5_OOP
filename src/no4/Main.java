package no4;

import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Calculation calc = new Calculation();

            System.out.println("Pilih perhitungan yang diinginkan:");
            System.out.println("1. Luas Lingkaran");
            System.out.println("2. Volume Bola");
            System.out.println("3. Hukum Newton Kedua (F = m * a)");
            System.out.println("4. Gravitasi Universal (F = G * (m1 * m2) / r^2)");
            System.out.println("5. Persamaan Gerak Parabola");
            System.out.println("6. Energi Kinetik");

            System.out.print("Masukkan Perhitungan Yang Diinginkan (Masukkan Angka 1-6) : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double radiusCircle = scanner.nextDouble();
                    double area = calc.calculate(radiusCircle);
                    System.out.println("Luas lingkaran: " + area);
                    break;
                case 2:
                    System.out.print("Masukkan jari-jari bola: ");
                    double radiusSphere = scanner.nextDouble();
                    double volume = calc.calculate(radiusSphere, true);
                    System.out.println("Volume bola: " + volume);
                    break;
                case 3:
                    System.out.print("Masukkan massa (kg): ");
                    double mass = scanner.nextDouble();
                    System.out.print("Masukkan percepatan (m/s^2): ");
                    double acceleration = scanner.nextDouble();
                    double force = calc.calculate(mass, acceleration);
                    System.out.println("Gaya: " + force);
                    break;
                case 4:
                    System.out.print("Masukkan massa pertama (kg): ");
                    double mass1 = scanner.nextDouble();
                    System.out.print("Masukkan massa kedua (kg): ");
                    double mass2 = scanner.nextDouble();
                    System.out.print("Masukkan jarak antara dua massa (m): ");
                    double distance = scanner.nextDouble();
                    double gravitationalForce = calc.calculate(mass1, mass2, distance);
                    System.out.println("Gaya gravitasi: " + gravitationalForce);
                    break;
                case 5:
                    System.out.print("Masukkan kecepatan awal (m/s): ");
                    double initialVelocity = scanner.nextDouble();
                    System.out.print("Masukkan sudut peluncuran (derajat): ");
                    double angle = scanner.nextDouble();
                    double[] results = calc.calculateProjectileMotion(initialVelocity, angle);
                    System.out.println("Waktu terbang: " + results[0] + " s");
                    System.out.println("Tinggi maksimum: " + results[1] + " m");
                    System.out.println("Jarak jangkauan: " + results[2] + " m");
                    break;
                case 6:
                    System.out.print("Masukkan massa (kg): ");
                    double massKE = scanner.nextDouble();
                    System.out.print("Masukkan kecepatan (m/s): ");
                    double velocity = scanner.nextDouble();
                    double kineticEnergy = calc.calculateKineticEnergy(massKE, velocity);
                    System.out.println("Energi kinetik: " + kineticEnergy + " Joule");
                    break;
                case 7:
                    System.out.print("Masukkan massa (kg): ");
                    double massPE = scanner.nextDouble();
                    System.out.print("Masukkan tinggi (m): ");
                    double height = scanner.nextDouble();
                    double potentialEnergy = calc.calculatePotentialEnergy(massPE, height);
                    System.out.println("Energi potensial: " + potentialEnergy + " Joule");
                    break;
                case 8:
                    System.out.print("Masukkan batas bawah a: ");
                    double a = scanner.nextDouble();
                    System.out.print("Masukkan batas atas b: ");
                    double b = scanner.nextDouble();
                    double integral = calc.calculateIntegral(a, b);
                    System.out.println("Integral dari x^2 antara " + a + " dan " + b + " adalah: " + integral);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            scanner.close();
        }
    }

