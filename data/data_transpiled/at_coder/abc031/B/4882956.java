public static int L = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( A [ i ] < L ) {
      System . out . println ( L - A [ i ] ) ;
    }
    else if ( A [ i ] > H ) {
      System . out . println ( - 1 ) ;
    }
    else {
      System . out . println ( 0 ) ;
    }
  }
  return N ;
}
