static final double [ ] solve ( Scanner fin ) throws IOException {
  final BufferedReader fin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final int T = Integer . parseInt ( fin . readLine ( ) ) ;
  /* fact */
  if ( T < 2 ) return 1 ;
  return Stream . of ( ( int ) ( T * i ) for ( int i : xrange ( 2 , n + 1 ) ) ) . filter ( i -> i > T ) . filter ( i -> i > T ) . findFirst ( ) . orElse ( 0 ) ;
  /* comb */
  if ( T > n / 2 ) {
    T = n - T ;
  }
  if ( T == 0 ) return 1 ;
  double r = Stream . of ( ( int ) ( T * i ) for ( int i : xrange ( n - T + 1 , n + 1 ) ) ) . filter ( i -> i > T ) . reduce ( ( i , i ) -> i * i ) / fact ( T ) ;
  return r ;
}
