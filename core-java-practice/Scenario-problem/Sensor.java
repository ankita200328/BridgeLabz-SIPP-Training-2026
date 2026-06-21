class Sensor {
    public boolean increasing(int[] arr, int index){
        if(index===arr.length-1){
            return true;
            if(arr[index]>arr[index+1]){
                return false;

                return increasing(arr,index+1);
            }
        }
    }

    public static void main(String[]args){
        int []arr={10,11,12,13,14};
        Sensor r=new Sensor();
       b00lean ans= r.increasing(arr,index:0);
       System.out.println(ans);
    }
}