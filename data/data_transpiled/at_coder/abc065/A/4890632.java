public static String X , String A , String B = map ( Integer . parseInt , input ( ) ) ;
int over = - A + B ;
return ( over <= 0 ? "delicious" : over <= X ? "safe" : over <= X ? "dangerous" : X ) ;
}
