public static void print ( int N ) {
  int [ ] T = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) T [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int [ ] ans = new int [ N ] ;
    int P = Integer . parseInt ( input . nextLine ( ) ) ;
    int X = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( P == j + 1 ) ans [ j ] = X ;
      else ans [ j ] = T [ j ] ;
    }
    System . out . println ( Arrays . toString ( ans ) ) ;
  }
}
