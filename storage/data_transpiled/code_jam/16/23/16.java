private static int doCase ( int N , String lines ) throws IOException {
  Set < String > unique = new HashSet < String > ( lines ) ;
  Set < String > U = new HashSet < String > ( ) ;
  Set < String > V = new HashSet < String > ( ) ;
  Map < String , List < String >> nodes = Maps . newHashMap ( ) ;
  for ( String word : unique ) {
    String [ ] words = word . split ( "\\s+" ) ;
    if ( nodes . containsKey ( words [ 0 ] ) ) {
      nodes . get ( words [ 0 ] ) . add ( words [ 1 ] ) ;
    }
    else {
      nodes . put ( words [ 0 ] , new ArrayList < String > ( Arrays . asList ( words ) ) ) ;
    }
    U . add ( words [ 0 ] ) ;
    V . add ( words [ 1 ] ) ;
  }
  final Map < String , List < String >> M = bipartiteMatch ( nodes ) ;
  int realCount = 0 ;
  final Set < String > unmatchedU = new HashSet < String > ( Collections . singletonList ( U ) ) ;
  final Set < String > unmatchedV = new HashSet < String > ( Collections . singletonList ( V ) ) ;
  for ( String v : V ) {
    if ( M . containsKey ( v ) ) {
      realCount ++ ;
      unmatchedV . remove ( v ) ;
      String u = M . get ( v ) ;
      unmatchedU . remove ( u ) ;
    }
  }
  realCount += unmatchedU . size ( ) + unmatchedV . size ( ) ;
  return N - realCount ;
}
