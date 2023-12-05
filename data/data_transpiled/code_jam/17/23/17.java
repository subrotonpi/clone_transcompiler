static final String solveOneShort ( int n , int [ ] horses , int [ ] [ ] d , int [ ] queries ) throws IOException {
  assert ( n == horses . length ) ;
  assert ( n == d . length ) ;
  double [ ] time = new double [ n ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  ++ i ) {
    int e = Integer . parseInt ( horses [ i ] [ 0 ] ) ;
    int s = Integer . parseInt ( horses [ i ] [ 1 ] ) ;
    int dist = 0 ;
    for ( int j = i + 1 ;
    j < n ;
    ++ j ) {
      int u = Integer . parseInt ( d [ j ] [ 0 ] ) ;
      int v = Integer . parseInt ( queries [ j ] [ 1 ] ) ;
      queries [ j ] = new int [ u - 1 ] ;
      for ( int j = 0 ;
      j < q ;
      ++ j ) {
        dist += d [ j - 1 ] [ j ] ;
      }
    }
    String [ ] res = new String [ time . length ] ;
    for ( int i = 0 ;
    i < res . length ;
    ++ i ) {
      res [ i ] = new String ( res [ i ] ) ;
    }
    String [ ] res ;
    if ( args . length > 1 ) {
      in = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    }
    if ( args . length > 2 ) {
      out = new PrintWriter ( System . out ) ;
    }
    else {
      out = new PrintWriter ( System . out ) ;
    }
    solveFiles ( in , out ) ;
    out . close ( ) ;
  }
  return String . valueOf ( time [ 0 ] ) ;
}
