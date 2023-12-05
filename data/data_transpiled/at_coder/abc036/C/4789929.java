@ SafeVarargs public static < T > void main ( Collection < T > ... args ) throws IOException {
  int n = Integer . parseInt ( new BufferedReader ( new InputStreamReader ( System . in ) ) . readLine ( ) ) ;
  a = new int [ n ] ;
  b = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . put ( i , i ) ;
  }
  b . put ( n , a ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . out . println ( b . get ( i ) ) ;
  }
}
