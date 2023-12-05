static final void solve ( ) {
  final int INF = Double . MAX_VALUE ;
  final int N = INF ;
  int n = - 1 ;
  int nc = 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final char c = String . valueOf ( S ) ;
    if ( c != '1' ) {
      n = i + 1 ;
      nc = c ;
      break ;
    }
  }
  if ( n == - 1 ) {
    System . out . println ( 1 ) ;
    return ;
  }
  if ( K < n ) {
    System . out . println ( 1 ) ;
  }
  else {
    System . out . println ( nc ) ;
  }
  /* main loop */
  final Scanner scanner = new Scanner ( System . in ) ;
  while ( scanner . hasNextInt ( ) ) {
    final String line = scanner . nextLine ( ) ;
    for ( final String word : line . split ( " " ) ) {
      scanner . next ( ) ;
    }
  }
  final Queue < String > tokens = scanner . poll ( ) ;
  final int S = Integer . parseInt ( ( String ) tokens . poll ( ) ) ;
  final int K = Integer . parseInt ( ( String ) tokens . poll ( ) ) ;
  solve ( S , K ) ;
}
