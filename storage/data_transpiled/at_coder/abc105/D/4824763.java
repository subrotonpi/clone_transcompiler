public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] S = new int [ M ] ;
  S [ 0 ] = 0 ;
  for ( int a : A ) {
    S [ i ] = ( S [ i - 1 ] + a ) % M ;
  }
  HashMap < Integer , Integer > map = new HashMap < > ( ) ;
  for ( int i = 1 ;
  i < S . length ;
  i ++ ) {
    map . put ( S [ i ] , map . get ( i ) + 1 ) ;
  }
  int out = 0 ;
  for ( int n : map . values ( ) ) {
    out += n * ( n - 1 ) / 2 ;
  }
  out += map . get ( 0 ) ;
  return out ;
}
