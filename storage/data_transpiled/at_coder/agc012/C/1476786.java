public static int [ ] [ ] x ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] x = new int [ n ] [ ] ;
  int [ ] [ ] y = new int [ n ] [ ] ;
  k = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    x [ i ] = k ;
    y [ i ] = k ;
    k ++ ;
  }
  return x ;
}
