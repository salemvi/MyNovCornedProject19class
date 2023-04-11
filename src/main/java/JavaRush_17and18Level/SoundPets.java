package JavaRush_17and18Level;

import java.util.ArrayList;


import static java.sql.DriverManager.println;

public class SoundPets {
    public static void main(String[] args) {
        ArrayList pets = new ArrayList();
        pets.add(new Кот());
        pets.add(new Собака());
        pets.add(new Рыбка());

        // орать, если есть такая способность
        for(Object pet: pets)
        {
            if (pet instanceof Звучание)
            {
                Звучание крикун = (Звучание) pet;
                крикун.голос();

            }
        }


    }
}
interface Звучание
{
    void голос();
}
class Кот implements Звучание
{
    public void голос()
    {
        println("МЯУ");
    }
}

class Собака implements Звучание
{
    public void голос()
    {
        println("ГАВ");
    }
}

class Рыбка
{

}

