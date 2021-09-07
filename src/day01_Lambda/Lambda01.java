package day01_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Lambda01 {
	public Lambda01() {
    }

	public static void main(String[] args) {
		

	   
	        List<Integer> l = new ArrayList(Arrays.asList(14, 9, 13, 4, 9, 2, 4, 14, 15));
	        yazdirJava(l);
	        System.out.println();
	        yazdirLambda(l);
	        System.out.println();
	        ciftSayiJava(l);
	        System.out.println();
	        ciftSayiLambda(l);
	        System.out.println();
	        tekKare(l);
	        System.out.println();
	        farklitekKup(l);
	        System.out.println();
	        farkliciftKare(l);
	        System.out.println();
	        farkliciftKup(l);
	        System.out.println();
	        tersDuzSira(l);
	        System.out.println();
	        maxdeger(l);
	    }

	   

		public static void yazdirJava(List<Integer> list) {
	        Iterator var1 = list.iterator();

	        while(var1.hasNext()) {
	            Integer w = (Integer)var1.next();
	            System.out.print(w + " ");
	        }

	    }

	    public static void yazdirLambda(List<Integer> l) {
	        l.stream().forEach((t) -> {
	            System.out.print(t + " ");
	        });
	    }

	    public static void ciftSayiJava(List<Integer> l) {
	        Iterator var1 = l.iterator();

	        while(var1.hasNext()) {
	            Integer w = (Integer)var1.next();
	            if (w % 2 == 0) {
	                System.out.print(w + " ");
	            }
	        }

	    }

	    public static void ciftSayiLambda(List<Integer> l) {
	        l.stream().filter((t) -> {
	            return t % 2 == 0;
	        }).forEach((t) -> {
	            System.out.print(t + " ");
	        });
	    }

	    public static void tekKare(List<Integer> l) {
	        l.stream().filter((t) -> {
	            return t % 2 == 1;
	        }).map((t) -> {
	            return t * t;
	        }).forEach((t) -> {
	            System.out.print(t + " ");
	        });
	    }

	    public static void farklitekKup(List<Integer> l) {
	        l.stream().distinct().filter((t) -> {
	            return t % 2 == 1;
	        }).map((t) -> {
	            return t * t * t;
	        }).forEach((t) -> {
	            System.out.print(t + " ");
	        });
	    }

	    public static void farkliciftKare(List<Integer> l) {
	        System.out.println(l.stream().distinct().filter((t) -> {
	            return t % 2 == 0;
	        }).map((t) -> {
	            return t * t;
	        }).reduce(0, (x, y) -> {
	            return x + y;
	        }));
	    }

	    public static void farkliciftKup(List<Integer> l) {
	        System.out.println(l.stream().distinct().filter((t) -> {
	            return t % 2 == 0;
	        }).map((t) -> {
	            return t * t * t;
	        }).reduce(1, (x, y) -> {
	            return x * y;
	        }));
	    }

	    private static void tersDuzSira(List<Integer> l) {
	        l.stream().sorted().forEach((t) -> {
	            System.out.print(t + " ");
	        });
	        System.out.println();
	        l.stream().sorted(Comparator.reverseOrder()).forEach((t) -> {
	            System.out.print(t + " ");
	        });
	        System.out.println();
	        l.stream().distinct().sorted(Comparator.reverseOrder()).forEach((t) -> {
	            System.out.print(t + " ");
	        });
	    }
	    private static void maxdeger(List<Integer> l) {
			 System.out.println("En büyük :" + l.stream().reduce(Integer.MIN_VALUE,Math::max));
			 System.out.println("En kücük :" + l.stream().reduce(Integer.MAX_VALUE,Math::min));
			 
			l.stream().sorted(Comparator.reverseOrder()).limit(1).forEach(MethodLambda::bosluklaYazdir);//En büyük
		    l.stream().sorted().limit(1).forEach(MethodLambda::bosluklaYazdir);//En kücük
		    l.stream().sorted().limit(l.size()-1).forEach(MethodLambda::bosluklaYazdir);
		}


	}


