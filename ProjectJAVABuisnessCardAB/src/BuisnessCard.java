

public class BuisnessCard {
    private String FirstName, LastName, Phone, City;// string avec S majuscule

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public BuisnessCard(String FirstName, String LastName, String Phone, String City)//constructor classe Buisness pour init
    {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Phone = Phone;
        this.City = City;
    }

    public BuisnessCard(String FirstName, String LastName)
    {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Phone = "12345678";
        this.City = "Krakow";
    }

  /*  public String GenerateCard()
    {
        String PrintCard = "";
        String SizeLign1 = this.FirstName + " " + this.LastName;
        String SizeLign2 = "Phone : " + this.Phone + " city : " + this.City;





            if(SizeLign2.length()>SizeLign1.length() ) {
                for (int cpt = 0; cpt < (SizeLign2.length() + 4); cpt++)//lenght() outil de la biblio string deja present dans java
                {
                    PrintCard += "*";
                }
            }
            else {
                for (int cpt = 0; cpt < (SizeLign1.length() + 4); cpt++) {
                    PrintCard += "*";
                }


            }

             PrintCard += "\n* ";
             PrintCard += this.FirstName + " " + this.LastName;
             if(SizeLign2.length()>SizeLign1.length())
             {
                 for(int cpt = SizeLign1.length(); cpt<SizeLign2.length();cpt++)
                 {
                     PrintCard += " ";
                 }
             }
             PrintCard += " *\n* ";
             PrintCard += "Phone : " + this.Phone + " city : " + this.City;

        if(SizeLign1.length()>SizeLign2.length())
        {
            for(int cpt = SizeLign2.length(); cpt<SizeLign1.length();cpt++)
            {
                PrintCard += " ";
            }
        }
        PrintCard += " *\n";


             if(SizeLign2.length()>SizeLign1.length()) {
                 for(int cpt =0; cpt < (SizeLign2.length()+4);cpt++)
                 {
                     PrintCard += "*";
                 }
             }
             else {
                 for(int cpt = 0; cpt < (SizeLign1.length() +4); cpt++)
                 {
                     PrintCard += "*";
                 }
             }


        return PrintCard;


    } */


public boolean Equals(BuisnessCard Bc)
{
    if(this.FirstName == Bc.FirstName && this.LastName == Bc.LastName && this.Phone == Bc.Phone && this.City == Bc.City)
        return true;
    else
        return false;
}

    public String toString() {
        return GenerateStars() + "\n* " + this.FirstName + " " + this.LastName + GenerateSpace(1) + "*\n* " +
            "phone : " + this.Phone + " " + "city : " + this.City + GenerateSpace(2) + "*\n" + GenerateStars();

    }

    public String GenerateSpace(int numLine) {
        String spaces = "";
        String SizeLign1 = this.FirstName + " " + this.LastName;
        String SizeLign2 = "phone : " + this.Phone + " city : " + this.City;

        if(numLine==1) {
            if(SizeLign2.length()>SizeLign1.length())
            {
                for(int cpt = SizeLign1.length(); cpt<SizeLign2.length();cpt++)
                {
                    spaces += " ";
                }
                return spaces + " ";
            }
            else {
                return " ";
            }
        }
        if(numLine==2) {
            if(SizeLign1.length()>SizeLign2.length())
            {
                for(int cpt = SizeLign2.length(); cpt<SizeLign1.length();cpt++)
                {
                    spaces += " ";
                }
                return spaces;
            }
            else {
                return " ";
            }
        }
        else
            return "";

    }


    public String GenerateStars(){
        String stars = "";
        String SizeLign1 = this.FirstName + " " + this.LastName;
        String SizeLign2 = "Phone : " + this.Phone + " city : " + this.City;

        if(SizeLign2.length()>SizeLign1.length()) {
            for(int cpt =0; cpt < (SizeLign2.length()+4);cpt++)
            {
                stars += "*";
            }
            return stars;
        }
        else {
            for(int cpt = 0; cpt < (SizeLign1.length() +4); cpt++)
            {
                stars += "*";
            }
            return stars;
        }
    }



}




