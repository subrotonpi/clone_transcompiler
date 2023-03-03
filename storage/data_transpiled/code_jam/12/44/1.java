static final java . util . Collection < Pair < Integer , Integer >> solve ( ) throws IOException {
  final java . util . Scanner in = new java . util . Scanner ( System . in ) ;
  final java . util . Set < Pair < Integer , Integer >> newPlan = new HashSet < Pair < Integer , Integer >> ( ) ;
  final java . util . Set < Pair < Integer , Integer >> q = new HashSet < Pair < Integer , Integer >> ( ) ;
  if ( in . hasNext ( ) ) {
    final File fn = new File ( in . nextLine ( ) ) ;
    if ( fn . length ( ) >= 2 ) {
      newPlan . add ( Pair . of ( r , c ) ) ;
    }
    else {
      works = false ;
      break ;
    }
  }
  final int t = Integer . parseInt ( in . nextLine ( ) ) ;
  for ( int _t = xrange ( t ) ;
  _t < caves . size ( ) ;
  ++ _t ) {
    final int R = Integer . parseInt ( in . nextLine ( ) ) ;
    final int C = Integer . parseInt ( in . nextLine ( ) ) ;
    final List < String > themap = new ArrayList < String > ( ) ;
    final Map < Integer , Pair < Integer , Integer >> caves = new HashMap < Integer , Pair < Integer , Integer >> ( ) ;
    for ( int _r : xrange ( R ) ) {
      final String line = in . nextLine ( ) . trim ( ) ;
      assert line . length ( ) == C ;
      for ( int digit : xrange ( 10 ) ) {
        if ( line . contains ( ( char ) ( '0' + digit ) ) ) {
          caves . put ( digit , new Pair < Integer , Integer > ( _r , line . indexOf ( ( char ) ( '0' + digit ) ) ) ) ;
        }
      }
      themap . add ( line ) ;
    }
    assert new java . util . TreeSet < Pair < Integer , Integer >> ( caves . keySet ( ) ) . size ( ) == caves . size ( ) ;
    System . out . println ( "Case #" + ( _t + 1 ) + ":" ) ;
    for ( int cave : xrange ( caves . keySet ( ) ) ) {
      final Set < Pair < Integer , Integer >> reachable = new HashSet < Pair < Integer , Integer >> ( ) ;
      final Queue < Pair < Integer , Integer >> q = new ArrayDeque < Pair < Integer , Integer >> ( ) ;
      q . add (