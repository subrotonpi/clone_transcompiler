@ Nullable private static List < String > solve ( String [ ] pic ) {
  final int T = Integer . parseInt ( next ( ) ) ;
  for ( int r : xrange ( pic . length - 1 ) ) {
    for ( int c : xrange ( pic [ 0 ] . length - 1 ) ) {
      if ( pic [ r ] . charAt ( c ) == '#' && pic [ r ] . charAt ( c + 1 ) == '#' && pic [ r + 1 ] . charAt ( c ) == '#' && pic [ r + 1 ] . charAt ( c + 1 ) == '#' ) {
        pic [ r ] . set ( c , '/' ) ;
        pic [ r ] . set ( c + 1 , '\\' ) ;
        pic [ r + 1 ] . set ( c , '\\' ) ;
        pic [ r + 1 ] . set ( c + 1 , rChar ) ;
      }
    }
  }
  final List < String > result = new ArrayList < > ( ) ;
  final int T = Integer . parseInt ( next ( ) ) ;
  for ( int t : xrange ( 1 , T + 1 ) ) {
    final int R = Integer . parseInt ( next ( ) ) ;
    final int C = Integer . parseInt ( next ( ) ) ;
    final List < String > pic = Lists . newArrayList ( ) ;
    for ( String row : islice ( pic , R , C ) ) {
      final List < String > newpic = solve ( pic ) ;
      System . out . println ( "Case #" + t + ":" ) ;
      if ( newpic . isEmpty ( ) ) {
        System . out . println ( "Impossible" ) ;
      }
      else {
        for ( String row : newpic ) {
          System . out . println ( row ) ;
        }
      }
    }
  }
  return result ;
}
