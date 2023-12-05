private static void solution ( ) {
  int N = Integer . parseInt ( readLine ( ) ) ;
  int K = Integer . parseInt ( readLine ( ) ) ;
  String [ ] [ ] B = new String [ N ] [ N ] ;
  for ( int r : xrange ( N ) ) {
    String row = "" ;
    for ( int p = readLine ( ) ;
    p != - 1 ;
    p = readLine ( ) ) {
      if ( p != '.' ) row += p ;
    }
    B [ r ] [ c ] = row . replaceAll ( " " , "" ) ;
  }
  Set < String > win = new HashSet < String > ( ) ;
  for ( int r = 0 ;
  r < N ;
  r ++ ) {
    for ( int c = 0 ;
    c < N ;
    c ++ ) {
      String p = B [ r ] [ c ] ;
      if ( p . equals ( "." ) ) continue ;
      for ( int dr = 1 , dc = 0 ;
      dr < N ;
      dr ++ , dc ++ ) {
        int r1 = r , c1 = c ;
        int count = K - 1 ;
        while ( count > 0 ) {
          r1 += dr ;
          c1 += dc ;
          if ( r1 == N || c1 == N || c1 == - 1 || B [ r1 ] [ c1 ] != p ) break ;
          count -- ;
        }
        if ( count == 0 ) win . add ( p ) ;
      }
    }
  }
  if ( win . size ( ) == 0 ) System . out . println ( "Neither" ) ;
  else if ( win . size ( ) == 2 ) System . out . println ( "Both" ) ;
  else if ( win . contains ( "R" ) ) System . out . println ( "Red" ) ;
  else System . out . println ( "Blue" ) ;
  int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int testcase : xrange ( T ) ) {
    System . out . println ( "Case #" + ( testcase + 1 ) + ":" ) ;
    solution ( ) ;
  }
}
