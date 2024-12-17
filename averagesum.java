package programmingjava;

public class averagesum {
	public static void main(String[] args) {
	String names[]={"test","test1","test2","test3"};
	int m1[]= {1,10,56,23};
	int m2[]= {5,10,56,23};
	int m3[]= {6,10,56,23};
double avg[]=new double[m1.length];
double sum=0 ,cavg=0;{
for(int i=0;i<names.length;i++) {
	avg[i]=(m1[i]+m2[i]+m3[i])/3;
	sum+=avg[i];
	System.out.println(names[i]+ " " +avg[i]);
}
cavg=sum/m1.length;
System.out.println(cavg);

}
	}
}


