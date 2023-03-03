@ VisibleForTesting static int from ( String input ) {
  int N = Integer . parseInt ( input ) ;
  String name = input ;
  String kit = input ;
  Counter < String > cn = new Counter < String > ( name ) ;
  Counter < String > ck = new Counter < String > ( kit ) ;
  for ( String k : cn . keySet ( ) ) {
    if ( ! ck . containsKey ( k ) ) {
      System . out . println ( - 1 ) ;
      exit ( ) ;
    }
  }
  int ans = 1 ;
  while ( ( cn . get ( k ) & ck . get ( k ) ) != 0 ) {
    ck . increment ( ) ;
    ans ++ ;
  }
  return ans ;
}
