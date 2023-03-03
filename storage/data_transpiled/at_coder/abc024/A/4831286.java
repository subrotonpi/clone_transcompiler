public static double a , double b , double c , double k ;
double s , t ;
s = map ( input , s ) ;
t = map ( input , t ) ;
return a * s + b * t - ( s + t >= k ) * ( s + t ) * c ;
}
