public static final String getPattern ( int i ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  final String [ ] lines = scanner . nextLine ( ) . split ( "\\s+" ) ;
  final int T = Integer . parseInt ( lines [ 0 ] , 10 ) ;
  for ( int i = 1 ;
  i < T ;
  i ++ ) {
    final String l = lines [ i ] ;
    final int N = Integer . parseInt ( l , 10 ) ;
    final Set < String > s = new HashSet < String > ( ) ;
    int curr = 0 ;
    int times = 0 ;
    if ( N == 0 ) {
      System . out . println ( "Case #" + ( i + 1 ) + ":" + "INSOMNIA" ) ;
      continue ;
    }
    while ( true ) {
      curr += N ;
      times ++ ;
      for ( int c = Integer . parseInt ( curr ) ;
      c < N ;
      c ++ ) {
        s . add ( c ) ;
      }
      if ( s . size ( ) == 10 ) break ;
    }
    System . out . println ( "Case #" + ( i + 1 ) + ":" + curr ) ;
  }
  return "" ;
}
