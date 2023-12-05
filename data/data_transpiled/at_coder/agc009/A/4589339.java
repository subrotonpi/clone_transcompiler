public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] L = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L [ i ] = new int [ ] {
      Integer . parseInt ( input . nextLine ( ) ) }
      ;
    }
    int cnt = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( L [ N - i - 1 ] [ 0 ] % L [ N - i - 1 ] [ 1 ] != 0 ) {
        cnt += L [ N - i - 1 ] [ 1 ] - ( L [ N - i - 1 ] [ 0 ] % L [ N - i - 1 ] [ 1 ] ) ;
      }
      else {
        return 0 ;
      }
      L [ N - i - 2 ] [ 0 ] += cnt ;
    }
    System . out . println ( cnt ) ;
    return 0 ;
  }
  