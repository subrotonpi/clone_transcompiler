public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] lst = new int [ N ] [ 2 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    lst [ i ] [ 0 ] = x ;
    lst [ i ] [ 1 ] = y ;
  }
  int res = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < N ;
    j ++ ) {
      res = Math . max ( res , ( ( lst [ j ] [ 0 ] - lst [ i ] [ 0 ] ) * ( 2 + ( lst [ j ] [ 1 ] - lst [ i ] [ 1 ] ) * ( 1 / 2 ) ) ) ) ;
    }
  }
  return res ;
}
