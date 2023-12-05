public static int [ ] getNegativeInstances ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] d = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    d [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  d = 2 * d ;
  int e = 0 ;
  int f = d [ 0 ] ;
  int g = 0 ;
  for ( int i = 0 ;
  i < 2 * n ;
  i ++ ) {
    if ( f == d [ i ] ) {
      g ++ ;
    }
    else {
      e = Math . max ( g , e ) ;
      g = 1 ;
      f = d [ i ] ;
    }
  }
  e = Math . max ( g , e ) ;
  if ( e == 2 * n ) {
    System . out . println ( - 1 ) ;
  }
  else {
    System . out . println ( ( e - 1 ) / 2 + 1 ) ;
  }
  return d ;
}
