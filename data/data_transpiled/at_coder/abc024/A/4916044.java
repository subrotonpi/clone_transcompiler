public static double a , double b , double c , double k ;
double s , t ;
s = Integer . parseInt ( input . nextLine ( ) ) ;
t = Integer . parseInt ( input . nextLine ( ) ) ;
return s + t < k ? a * s + b * t : a * s + b * t - c * ( s + t ) ;
}
