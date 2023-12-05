@ VisibleForTesting static String pWormhole ( String s ) {
  String a = s . substring ( 0 , s . indexOf ( "," ) ) ;
  String b = s . substring ( s . indexOf ( "," ) + 1 ) ;
  wormholes . put ( Integer . parseInt ( a ) , Integer . parseInt ( b ) ) ;
  wormholes . put ( Integer . parseInt ( b ) , Integer . parseInt ( a ) ) ;
  /* Case # */
  int P = Integer . parseInt ( s . substring ( 0 , s . indexOf ( "," ) ) ) , W = Integer . parseInt ( s . substring ( s . indexOf ( "," ) + 1 ) ) ;
  final Set < Integer > wormholes ;
  wormholes = new HashSet < > ( ) ;
  map ( s , P , W ) ;
  final List < Pair < Integer , Set < Integer >>> pos = new ArrayList < > ( ) ;
  pos . add ( new Pair < > ( 0 , new HashSet < > ( ) , wormholes . get ( 0 ) ) ) ;
  final List < Pair < Integer , Set < Integer >>> result = new ArrayList < > ( ) ;
  while ( pos . isEmpty ( ) && result . isEmpty ( ) || pos . size ( ) > 0 && result . size ( ) > 0 && pos . get ( pos . size ( ) - 1 ) . second . size ( ) < result . get ( 0 ) . second . size ( ) ) {
    final Pair < Integer , Set < Integer >> p = pos . remove ( pos . size ( ) - 1 ) ;
    final Set < Integer > conquered = p . first . get ( pos . size ( ) - 1 ) ;
    final Set < Integer > threatened = p . second . get ( pos . size ( ) - 1 ) ;
    for ( final Integer p2 : wormholes . get ( p ) ) {
      if ( p2 == 1 ) {
        result . add ( new Pair < > ( 1 , conquered , threatened ) ) ;
      }
      else if ( conquered . contains ( p2 ) ) {
        continue ;
      }
      else {
        final Set < Integer > c = conquered . stream ( ) . map ( p :: second ) . collect ( Collectors . toSet ( ) ) ;
        final Set < Integer > t = ( Set < Integer > ) threatened . stream ( ) . filter ( p :: equals ) . collect ( Collectors . toList (