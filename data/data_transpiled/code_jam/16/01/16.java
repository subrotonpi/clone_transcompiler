public static void solveCase ( int t ) {
  int N = Integer . parseInt ( readLine ( ) ) ;
  if ( N == 0 ) {
    System . out . println ( "Case #" + t + ": " + "INSOMNIA" ) ;
    return ;
  }
  Set < String > digits = new HashSet < String > ( ) ;
  int lastNum = 0 ;
  for ( int i : xrange ( 1 , 120 ) ) {
    for ( String c : String . valueOf ( i * N ) ) {
      digits . add ( c ) ;
    }
    if ( digits . size ( ) == 10 ) {
      lastNum = i * N ;
      break ;
    }
  }
  assert digits . size ( ) == 10 ;
  System . out . println ( "Case #" + t + ": " + lastNum ) ;
  int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int i : xrange ( T ) ) {
    solveCase ( i + 1 ) ;
  }
}
