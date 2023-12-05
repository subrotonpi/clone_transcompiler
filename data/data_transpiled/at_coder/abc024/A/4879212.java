public static double a , double b , double c , double k ;
double s , t ;
s = Integer . parseInt ( input . nextLine ( ) ) ;
t = Integer . parseInt ( input . nextLine ( ) ) ;
d = a * s + b * t ;
if ( ( s + t ) >= k ) d -= ( s + t ) * c ;
System . out . println ( d ) ;
return d ;
}
