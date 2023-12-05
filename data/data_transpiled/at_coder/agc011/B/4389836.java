public static void print ( int N ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( A ) ;
  int c = 0 ;
  int kind = N ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    int a = A [ i ] ;
    if ( c * 2 < a ) {
      kind = N - i ;
    }
    c += a ;
  }
  System . out . println ( kind ) ;
}
