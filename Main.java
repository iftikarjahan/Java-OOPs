import java.util.Comparator;

class Main{
    public static void main(String[] args) {
        Car[]cars=new Car[5];
        cars[0]=new Car(250,300,"Yellow");
        cars[1]=new Car(150,350,"Red");
        cars[2]=new Car(400,290,"Black");
        cars[3]=new Car(550,310,"Green");
        cars[4]=new Car(600,150,"Violet");

        // display(cars);
        bubbleSort(cars,new CarPriceComparator());
        display(cars);

        

        // Now we want to sort the array according to diffrent conditions
        /*
        ->Now if we want to sort the cars array, then we need to specify that on what basis should the cars array 
        be sorted. This can be done using the help of comparator interface in the Car class. Here you need to take care
        of the syntax. Nothing very coceptual

        ->Now the problem with the comparable is that we can sort the cars array on the basis of one data
        member of the Cars class. But we want to make it dynamic and want to use it as per our needs like speed,
        price or color.
        In order to do so, we need to use the comparator

        ->For using the comparator, we need to create a new class that implements the comparator interface


        */ 
        

    }

    public static <T> void display(T[]arr){

        /*
        ->Here we can see when we display the cars array using the println function, then it displays the reference
        of the objects that we have created with some weired hex codes. This is because every class inherits
        the object class. And the object class is the place where the println function is defined. And the println
        uses the toString function that does the work of printing the weired addresses. So we need to do the 
        method overriding of the toString function in the Car class 
        */ 
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    } 

    public static <T> void bubbleSort(T[]arr,Comparator<T> comp){
        for(int counter=0;counter<arr.length-1;counter++){
            for(int j=0;j<arr.length-counter-1;j++){
                if(comp.compare(arr[j],arr[j+1])>0){
                    T temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}