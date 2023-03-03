public static void print ( int N ) {
  int [ ] [ ] A = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = new int [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      A [ i ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      System . out . print ( A [ N - j - 1 ] [ i ] + " " ) ;
    }
    System . out . println ( ) ;
  }
}
