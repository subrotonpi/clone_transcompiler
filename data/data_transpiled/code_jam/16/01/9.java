public static long test ( int n ) {
  if ( n == 0 ) {
    return "INSOMNIA" ;
  }
  Set < String > digs = new HashSet < String > ( ) ;
  for ( int i : xrange ( 1 , 10000000000000 ) ) {
    digs . addAll ( String . valueOf ( i * n ) ) ;
    if ( digs . size ( ) == 10 ) {
      return i * n ;
    }
  }
  int N = input . nextInt ( ) ;
  for ( int i : xrange ( N ) ) {
    n = input . nextInt ( ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + test ( n ) ) ;
  }
  return n ;
}
