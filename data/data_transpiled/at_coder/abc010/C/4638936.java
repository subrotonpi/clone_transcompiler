public static void txa ( int txa , int tya , int txb , int tyb , double t , double v ) {
  int n = Integer . parseInt ( input ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    double x = Integer . parseInt ( input ( ) ) ;
    double y = Integer . parseInt ( input ( ) ) ;
    if ( ( ( x - txa ) * x + ( y - tya ) * y ) * 0.5 + ( ( x - txb ) * y + ( y - tyb ) * y ) * 0.5 <= t * v ) {
      System . out . println ( "YES" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "NO" ) ;
}
