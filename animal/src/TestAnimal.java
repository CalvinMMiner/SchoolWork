public class TestAnimal 
{

      public static void main(String[] args) {

             Animal[] Animals = new Animal[7];

             Animals[0] = new Animal("Hippo");

             Animals[1] = new Mammal("Dog","white");

             Animals[2] = new Insect();

             Animals[3] = new Bat();

             Animals[4] = new Cat("happy","black");

             Animals[5] = new GrassHopper();

             Animals[6] = new Bee();

            

             /*

             Please add your code here. You need to call and display a method from each of the object.

             */
             System.out.println(  Animals[0].MakeUpOf() + "\n"  + ((Mammal) Animals[1]).BloodTemperature() + "\n"  +  ((Insect) Animals[2]).BodyParts() + "\n"  + 
            		 ((Bat) Animals[3]).fly() +  "\n"  + ((Cat) Animals[4]).meow() + "\n"  +  ((GrassHopper) Animals[5]).hop() + "\n"  +  ((Bee) Animals[6]).Sting() );

      }

}