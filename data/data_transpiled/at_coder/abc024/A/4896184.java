public static double a = input . nextDouble ( ) , b = input . nextDouble ( ) , c = input . nextDouble ( ) , k = input . nextDouble ( ) ;
double s = input . nextDouble ( ) , t = input . nextDouble ( ) ;
if ( s + t >= k ) {
  System . out . println ( ( a - c ) * s + ( b - c ) * t ) ;
}
else {
  System . out . println ( a * s + b * t ) ;
}
return s ;
}
