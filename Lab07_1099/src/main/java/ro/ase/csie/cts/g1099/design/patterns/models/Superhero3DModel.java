package ro.ase.csie.cts.g1099.design.patterns.models;

import ro.ase.csie.cts.g1099.design.patterns.interfaces.WeaponInterface;

import java.util.ArrayList;
import java.util.Random;

public class Superhero3DModel implements Cloneable{
    String name;
    boolean isPositive;
    boolean isCriticalWounded;

    int lifePoints;

    WeaponInterface leftHandWeapon;
    WeaponInterface rightHandWeapon;

    SuperPower superPower;
    SuperPower ultimatePower;

    String modelFileName;
    ArrayList<Point3D> points;


    private Superhero3DModel(){

    }

    public Superhero3DModel(String name, String modelFileName) {
        this.name = name;
        this.modelFileName = modelFileName;
        System.out.println("Loading the model file...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

        Random random = new Random();
        int noPoints = random.nextInt(1000);

        this.points =  new ArrayList<>(noPoints);

        for(int i = 0; i<noPoints; i++){
            points.add((new Point3D(random.nextInt(Point3D.LIMIT),
                    random.nextInt(Point3D.LIMIT),
                    random.nextInt(Point3D.LIMIT))
            ));
        }
    }
        @Override
        public Object clone() {
            //it's mistake
            // Superhero3DModel copy = new Superhero3DModel(this.name, this.modelFileName);
            Superhero3DModel copy = new Superhero3DModel();
            copy.name = this.name;
            copy.isPositive = this.isPositive;
            copy.isCriticalWounded = this.isCriticalWounded;
            copy.lifePoints = this.lifePoints;

            copy.points = (ArrayList<Point3D>) this.points.clone();

            copy.leftHandWeapon = this.leftHandWeapon.clone();
            copy.rightHandWeapon = this.rightHandWeapon.clone();
            return copy;
        }

    public void setName(String name) {
        this.name = name;
    }

    public void setPositive() {
        isPositive = true;
    }

    public void setCriticalWounded() {
        isCriticalWounded = true;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public void setLeftHandWeapon(WeaponInterface leftHandWeapon) {
        this.leftHandWeapon = leftHandWeapon;
    }

    public void setRightHandWeapon(WeaponInterface rightHandWeapon) {
        this.rightHandWeapon = rightHandWeapon;
    }

    public void setSuperPower(SuperPower superPower) {
        this.superPower = superPower;
    }

    public void setUltimatePower(SuperPower ultimatePower) {
        this.ultimatePower = ultimatePower;
    }


    public static class SuperheroBuilder{
            private Superhero3DModel superhero;

            public SuperheroBuilder(String name, String fileName){
                this.superhero = new Superhero3DModel(name,fileName);
            }

            public SuperheroBuilder setPositive(){
                this.superhero.setPositive();
                return this;
            }

            public SuperheroBuilder setCriticalWounded(){
                this.setCriticalWounded();
                return this;
            }

            public Superhero3DModel build(){
                return this.superhero;
            }
        }
}
