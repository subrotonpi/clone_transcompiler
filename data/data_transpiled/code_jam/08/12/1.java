private static String doTrial ( Scanner in ) throws IOException {
  final int N = in . nextInt ( ) ;
  final int M = in . nextInt ( ) ;
  final List < Pair < Integer , Set < Integer >>> faves = new ArrayList < Pair < Integer , Set < Integer >>> ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    final int [ ] v = new int [ N ] ;
    for ( int j = in . nextInt ( ) ;
    j < v . length ;
    j ++ ) v [ j ] = in . nextInt ( ) ;
    Integer malted = null ;
    final Set < Integer > unmaltedSet = new HashSet < Integer > ( ) ;
    for ( int j = 0 ;
    j < v . length ;
    j += 2 ) {
      if ( v [ j + 1 ] > 0 ) malted = v [ j ] ;
      else unmaltedSet . add ( v [ j ] ) ;
    }
    faves . add ( new Pair < Integer , Set < Integer >> ( malted , unmaltedSet ) ) ;
  }
  final Set < Integer > mustBeMalted = new HashSet < Integer > ( ) ;
  while ( true ) {
    boolean allFine = true ;
    boolean noUpdates = true ;
    for ( Pair < Integer , Set < Integer >> m : faves ) {
      final Set < Integer > u = m . getSecond ( ) ;
      if ( u != null ) {
        if ( mustBeMalted . contains ( m ) ) continue ;
      }
      if ( u . size ( ) == 0 ) {
        allFine = false ;
        if ( m == null ) break ;
        mustBeMalted . add ( m ) ;
        noUpdates = false ;
        continue ;
      }
    }
    if ( allFine || noUpdates ) break ;
  }
  if ( ! allFine ) return "IMPOSSIBLE" ;
  return Arrays . toString ( mustBeMalted . toArray ( new Integer [ 0 ] ) ) ;
}
in = new Scanner ( in ) ;
final int count = in . nextInt ( ) ;
for ( int i : xrange ( count ) ) {
  final String v = doTrial ( in ) ;
  System . out . println ( "Case #" + ( i + 1 ) + ": " + v ) ;
}
