public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  if ( N < 5002 ) {
    if ( N % 2 == 0 ) {
      int [ ] sans = new int [ N - 2 ] ;
      for ( int i = 0 ;
      i < N - 2 ;
      i ++ ) {
        sans [ i ] = 6 * i + 3 ;
      }
      ans = sans . append ( 2 ) . append ( 4 ) ;
    }
    if ( N % 2 == 1 ) {
      int [ ] sans = new int [ N - 3 ] ;
      for ( int i = 0 ;
      i < N - 3 ;
      i ++ ) {
        sans [ i ] = 6 * i + 3 ;
      }
      ans = sans . append ( 2 ) . append ( 4 ) . append ( 6 ) ;
    }
    if ( N == 3 ) {
      ans = new int [ N ] ;
    }
  }
  else {
    int [ ] sans = new int [ 5000 ] ;
    int [ ] nis = new int [ N - 5000 ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      sans [ i ] = 6 * i + 3 ;
      nis [ i ] = 2 * i + 2 ;
    }
    ans = sans . append ( nis ) ;
  }
  String [ ] ans = ArrayUtil . toStringArray ( ans ) ;
  System . out . println ( Arrays . toString ( ans ) ) ;
}
