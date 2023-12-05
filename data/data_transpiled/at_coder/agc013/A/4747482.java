public static void print ( int N ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] I = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    I [ i ] = i > A [ i ] ? A [ i ] : 10 * 10 ;
  }
  int [ ] D = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    D [ i ] = i < A [ i ] ? A [ i ] : 0 ;
  }
  boolean ci = false ;
  boolean cd = false ;
  int ans = 1 ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    ci += I [ i ] ;
    cd += D [ i ] ;
    if ( ci && cd ) {
      ans ++ ;
      ci = false ;
      cd = false ;
    }
  }
  System . out . println ( ans ) ;
}
