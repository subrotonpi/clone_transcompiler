public static int [ ] getSums ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] s = new int [ n ] ;
  int p = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    p += a [ i ] ;
    s [ i ] = p ;
  }
  s [ n ] = 0 ;
  return s ;
}
