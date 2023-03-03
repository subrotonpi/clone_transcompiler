private static Map < Integer , Integer > ints ( ) {
  return map ( in -> in . nextInt ( ) , in -> in . nextInt ( ) , in -> in . nextInt ( ) , in -> in . nextInt ( ) , in -> in . nextInt ( ) , in . nextInt ( ) ) ;
  /* solve the list of numbers */
  int x0 = in . nextInt ( ) ;
  int len = Math . min ( len , x0 ) ;
  int M = len - 1 + 1 ;
  int limit = Math . min ( limit , M ) ;
  int [ ] counts = new int [ M ] ;
  for ( int x : len ) {
    counts [ x ] ++ ;
  }
  for ( int lim : xrange ( limit , 0 , M - 1 ) ) {
    int [ ] copyCounts = new int [ M ] ;
    for ( int count : counts ) {
      copyCounts [ count ] ++ ;
    }
    if ( canSolve ( copyCounts , lim , M ) ) {
      return lim ;
    }
  }
  return 1 ;
}
