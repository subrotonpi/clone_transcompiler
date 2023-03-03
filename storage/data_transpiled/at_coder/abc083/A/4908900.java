public static String A , String B , String C , String D = map ( Integer . parseInt , input ( ) ) ;
long left = A + B ;
long right = C + D ;
return ( left > right ? "Left" : left < right ? "Right" : "Balanced" ) ;
}
