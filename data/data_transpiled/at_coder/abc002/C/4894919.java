static final double sqrt ( ) {
  double xa , ya , xb , yb , xc , yc ;
  xa = Integer . parseInt ( input . readLine ( ) ) ;
  ya = Integer . parseInt ( input . readLine ( ) ) ;
  xb = Integer . parseInt ( input . readLine ( ) ) ;
  yb = Integer . parseInt ( input . readLine ( ) ) ;
  xc = Integer . parseInt ( input . readLine ( ) ) ;
  yc = Integer . parseInt ( input . readLine ( ) ) ;
  double a = Math . sqrt ( ( xa - xb ) * ( xb - xc ) + ( yb - yc ) * ( xb - yc ) ) ;
  double b = Math . sqrt ( ( xb - xc ) * ( xb - yc ) ) ;
  double c = Math . sqrt ( ( xc - xa ) * ( yc - xa ) ) ;
  double s = ( a + b + c ) / 2 ;
  double S = Math . sqrt ( s * ( s - a ) * ( s - b ) * ( s - c ) ) ;
  System . out . println ( S . toString ( ) + "\n" ) ;
}
