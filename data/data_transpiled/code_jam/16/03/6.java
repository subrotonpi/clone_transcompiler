public static void input ( Scanner in ) {
  int N = in . nextInt ( ) , J = in . nextInt ( ) ;
  int s = Math . pow ( 2 , N / 2 - 1 ) + 1 ;
  System . out . println ( "Case #1:" ) ;
  for ( int i : xrange ( J ) ) {
    String t = in . next ( ) + "" + s ;
    System . out . println ( t + "," ) ;
    for ( int j : xrange ( 2 , 11 ) ) {
      int u = 0 ;
      for ( int k = 0 ;
      k < t . length ( ) ;
      k ++ ) {
        u *= j ;
        u += ( t . charAt ( k ) - '0' ) ;
      }
      System . out . println ( u + "," ) ;
    }
    System . out . println ( ) ;
    s += 2 ;
  }
}
