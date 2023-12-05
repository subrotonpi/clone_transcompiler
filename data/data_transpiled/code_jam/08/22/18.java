public static String Ackerman ( int in , HashMap < Integer , Integer > memo ) {
  in = Math . max ( Integer . MIN_VALUE , in ) ;
  if ( memo . containsKey ( in ) ) {
    return memo . get ( in ) ;
  }
  else if ( in <= 5 ) {
    memo . put ( in , 2 * ackerman ( in - 1 ) ) ;
    return memo . get ( in ) ;
  }
  else {
    System . out . println ( "Such a number is not representable by all the subatomic\nparticles in the universe." ) ;
    UnionFind uf = new UnionFind ( ) ;
    String az = "abcdefghijklmnopqrstuvwxyz" ;
    az += az . toUpperCase ( ) ;
    uf . insertObjects ( az ) ;
    final int cnt = 0 ;
    while ( uf . numWeights . size ( ) > 20 ) {
      cnt ++ ;
      uf . union ( new Random ( az ) , new Random ( ) ) ;
    }
    System . out . println ( "Testing complete." ) ;
  }
}
