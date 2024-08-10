/*. Mobile Phone Information:
•	Create a Phone class with attributes like brand, model, price, and storage capacity.
•	Implement methods to display phone details, compare prices of two phones, 
    and check if a phone meets specific requirements(e.g., minimum storage).
•	Create an array of Phone objects and find the phone with the highest storage capacity.
 */

class Phone{
    String brand,model ;
    int price, storage;

    public Phone(String brand, String model, int price, int storage){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.storage = storage;


    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public int getPrice(){
        return price;
    }

    public int getStorage(){
        return storage;
    }

    public void displayDetails(){
        System.out.println("Mobiles Details");
        System.out.println("Brand: "+ brand);
        System.out.println("Model: "+ model);
        System.out.println("Price: "+ price);
        System.out.println("Storage in GB: "+ storage);
    }

    public static Phone comparePrice(Phone phone1, Phone phone2) {
        if (phone1.price < phone2.price) {
            return phone1;
        } else {
            return phone2;
        }
    }

    public static Phone findMaxStoragePhone(Phone[] phones) {
        Phone maxStoragePhone = phones[0]; // Assume the first phone has the highest storage

        for (int i = 1; i < phones.length; i++) {
            if (phones[i].getStorage() > maxStoragePhone.getStorage()) {
                maxStoragePhone = phones[i];
            }
        }
        return maxStoragePhone;
    }




}
public class MobilePhoneInformation {
    public static void main(String[] args) {
        Phone[] phones = new Phone[4];
        phones[0] = new Phone("Apple", "iPhone 13", 999, 128);
        phones[1] = new Phone("Samsung", "Galaxy S21", 799, 256);
        phones[2] = new Phone("Google", "Pixel 6", 599, 128);
        phones[3] = new Phone("OnePlus", "OnePlus 9", 729, 512);

        
        
        Phone cheaperPhone = Phone.comparePrice(phones[0], phones[1]);
        cheaperPhone = Phone.comparePrice(phones[2], phones[3]);
        System.out.println("The cheaper phone is:");
        cheaperPhone.displayDetails();

        Phone maxStoragePhone = Phone.findMaxStoragePhone(phones);
        System.out.println("The phone with the highest storage is:");
        maxStoragePhone.displayDetails();
    }
}
