@ GwtIncompatible ( "java.lang.Math" ) public static double deg ( double a , double b ) {
  double q = 2 * PI ;
  double d = b - a ;
  double t = atan2 ( d , d ) ;
  if ( t < 0 ) t += q ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  Complex [ ] cs = new Complex [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    cs [ i ] = new Complex ( a , b ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    double [ ] args = new double [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      args [ j ] = deg ( cs [ i ] , cs [ j ] ) / q ;
    }
    Arrays . sort ( args ) ;
    int [ ] dif = new int [ n - 1 ] ;
    for ( int j = 0 ;
    j < n - 1 ;
    j ++ ) dif [ j ] = args [ j ] - args [ i - 1 ] ;
    dif [ 0 ] ++ ;
    System . out . println ( Math . max ( Math . max ( dif , 0 ) - 1 / 2 , 0 ) ) ;
  }
  return t ;
}
