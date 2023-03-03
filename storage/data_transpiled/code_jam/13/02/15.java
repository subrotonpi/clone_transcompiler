public static ThreadLocal < Map < String , Object >> setup = new ThreadLocal < Map < String , Object >> ( ) {
  @ Override protected Map < String , Object > initialValue ( ) {
    return new HashMap < String , Object > ( ) ;
  }
  @ Override protected Map < String , Object > reader ( String testcase , BufferedReader in , String ... ignore ) throws IOException {
    int [ ] P = ArrayUtil . readInts ( in ) ;
    int [ ] S = new int [ P [ 0 ] ] ;
    for ( int i = 0 ;
    i < P [ 0 ] ;
    i ++ ) S [ i ] = ArrayUtil . readInts ( in ) ;
    return new HashMap < String , Object > ( ) ;
  }
  @ Override protected String solver ( BufferedReader in , String testcase , Integer N , Integer [ ] P , Integer I , Integer T , Integer [ ] S , Integer [ ] C , String ... ignore ) throws IOException {
    final int [ ] S = new int [ S . length ] ;
    for ( int i = 0 ;
    i < S . length ;
    i ++ ) S [ i ] = S [ i ] . intValue ( ) ;
    final int [ ] done = new int [ P [ 0 ] ] ;
    for ( int row = 0 ;
    row < P [ 0 ] ;
    row ++ ) {
      int m = S [ row ] . intValue ( ) ;
      done [ row ] = S [ row ] . intValue ( ) == m ? 1 : 0 ;
    }
    for ( int col = 0 ;
    col < P [ 1 ] ;
    col ++ ) {
      int m = S [ 0 ] . intValue ( ) ;
      done [ 0 ] = S [ 0 ] . intValue ( ) == m ? 1 : 0 ;
    }
    String res = done . length == P [ 0 ] * P [ 1 ] ? "YES" : "NO" ;
    return "Case #" + testcase + ": " + res + "\n" ;
  }
}
