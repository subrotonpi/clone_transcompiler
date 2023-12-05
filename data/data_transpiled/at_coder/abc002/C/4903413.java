public static double a , double b , double c , double d , double e , double f ;
double X1 , Y1 , X2 , Y2 ;
double S ;
X1 = c - a ;
Y1 = d - b ;
X2 = e - a ;
Y2 = f - b ;
S = ( double ) ( X1 * Y2 - X2 * Y1 ) / 2 ;
if ( S > 0 ) {
  System . out . println ( S ) ;
}
else {
  System . out . println ( ( double ) - S ) ;
}
return S ;
}
