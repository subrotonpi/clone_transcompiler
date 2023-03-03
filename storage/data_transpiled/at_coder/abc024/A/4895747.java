public static double a , double b , double c , double k ;
double s , t ;
s = map . get ( input ) ;
t = map . get ( input ) ;
return s + t >= k ? s * a + t * b - ( s + t ) * c : s * a + t * b ;
}
