public static int T = Integer . parseInt ( Scanner in ) {
  int a ;
  int ss = 0 ;
  for ( int t = 0 ;
  t < xrange ( T ) ;
  t ++ ) {
    a = in . nextInt ( ) ;
    for ( int k = 0 ;
    k < xrange ( 4 ) ;
    k ++ ) {
      HashSet < Integer > s = new HashSet < Integer > ( Integer . parseInt ( in . next ( ) ) ) ;
      if ( k + 1 == a ) ss = s ;
    }
    a = in . nextInt ( ) ;
    for ( int k = 0 ;
    k < xrange ( 4 ) ;
    k ++ ) {
      HashSet < Integer > s = new HashSet < Integer > ( Integer . parseInt ( in . next ( ) ) ) ;
      if ( k + 1 == a ) ss &= s ;
    }
  }
  System . out . println ( "Case #" + ( t + 1 ) + ":" + ss ) ;
  if ( ss . size ( ) > 1 ) System . out . println ( "Bad magician!" ) ;
  else if ( ss . isEmpty ( ) ) System . out . println ( "Volunteer cheated!" ) ;
  else System . out . println ( new LinkedList < Integer > ( ss ) . toString ( ) ) ;
  return ss . size ( ) ;
}
