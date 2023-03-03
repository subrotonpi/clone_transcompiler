@ VisibleForTesting static int [ ] [ ] solve ( ) throws IOException {
  final BufferedReader in = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final String raw = in . readLine ( ) ;
  final int [ ] [ ] ints = Ints . fromStrings ( raw ) ;
  final Scanner scanner = new Scanner ( System . in ) ;
  final int n = scanner . nextInt ( ) ;
  final int [ ] [ ] solve = new int [ n ] [ n ] ;
  final int [ ] [ ] result = new int [ n ] [ n ] ;
  for ( int j = n - 2 ;
  j > 0 ;
  j -- ) {
    for ( int [ ] orig : new int [ n ] [ n - j ] ) {
      final Set < String > left = new HashSet < > ( ) ;
      final Set < String > right = new HashSet < > ( ) ;
      for ( int i = 0 ;
      i < orig . length ;
      i ++ ) {
        left . add ( scanner . nextInt ( ) ) ;
        right . add ( scanner . nextInt ( ) ) ;
      }
      boolean good = true ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        if ( ! orig [ i ] [ 0 ] . equals ( "" ) ) {
          if ( ! left . contains ( scanner . nextInt ( ) ) || ! right . contains ( scanner . nextInt ( ) ) ) {
            good = false ;
            break ;
          }
        }
      }
      if ( good ) {
        return j ;
      }
    }
  }
  final int [ ] [ ] result = new int [ n ] [ n ] ;
  final int n = scanner . nextInt ( ) ;
  final Map < String , Set < String >> graph = new TreeMap < > ( ) ;
  final Set < String > left = new HashSet < > ( ) ;
  final Set < String > right = new HashSet < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    final String u = scanner . next ( ) ;
    final String v = scanner . next ( ) ;
    left . add ( u ) ;
    right . add ( v ) ;
    graph . put ( "l" + u , "r" + v ) ;
  }
  final Set < String > sol = new HopcroftKarp ( graph ) . maximumMatching ( ) ;
  final int orig = left . size ( ) + right . size ( ) - sol . size ( ) / 2 ;
  return result ;
}
