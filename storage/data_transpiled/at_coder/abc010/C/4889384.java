public static double a , double b , double c , double d , double e , double f ;
double x , y ;
for ( int i = 0 ;
i < Integer . parseInt ( input ) ;
i ++ ) {
  x = Integer . parseInt ( input . nextLine ( ) ) ;
  y = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( Math . abs ( x - a ) * Math . pow ( 2 , 2 ) + Math . abs ( y - b ) * Math . pow ( 2 , 2 ) ) * 0.5 + ( Math . abs ( x - c ) * Math . pow ( 2 , 2 ) + Math . abs ( y - d ) * Math . pow ( 2 , 2 ) ) * 0.5 <= e * f ) {
    System . out . println ( "YES" ) ;
    break ;
  }
}
else {
  System . out . println ( "NO" ) ;
}
return a ;
}
