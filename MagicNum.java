class MagicNum{
public static void main(String[] args){
int num=146;
int sum=0;

while(num>0||sum>9){
if (num==0){
num=sum;
sum=0;
}

int rem=num%10;
sum+=rem; 
num/=10;
}
System.out.println(sum);
if (sum==1){
System.out.println("its a magic number");
}
else{
System.out.println("its not a magic number");
}

}
}
