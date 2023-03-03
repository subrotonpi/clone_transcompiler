@ VisibleForTesting static Iterable < Boolean > permutations ( ) {
  for ( int tc = 0 ;
  tc < Integer . parseInt ( input ( ) ) ;
  tc ++ ) {
    int N = ( Integer . parseInt ( input ( ) ) ) ;
    int M = ( Integer . parseInt ( input ( ) ) ) ;
    int [ ] code = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) code [ i ] = Integer . parseInt ( input ( ) ) ;
    boolean [ ] [ ] G = new boolean [ N + 1 ] [ N + 1 ] ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      int u = ( Integer . parseInt ( input ( ) ) - 1 ) ;
      int v = ( Integer . parseInt ( input ( ) ) - 1 ) ;
      G [ u ] [ v ] = G [ v ] [ u ] = true ;
    }
    int best = Math . pow ( 10 , 5 * N ) ;
    for ( List < Integer > perm : permutations ( Lists . newArrayList ( ) ) ) {
      Stack < Integer > stack = new Stack < > ( N ) ;
      G [ N ] [ perm . get ( 0 ) ] = true ;
      boolean valid = true ;
      int cur = 0 ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        int city = perm . get ( i ) ;
        cur = cur * 100000 + code [ city ] ;
        while ( stack . size ( ) > 0 && ! G [ stack . peek ( ) ] [ city ] ) stack . pop ( ) ;
        if ( stack . isEmpty ( ) ) {
          valid = false ;
          break ;
        }
        stack . push ( city ) ;
      }
      if ( valid ) best = Math . min ( best , cur ) ;
      G [ N ] [ perm . get ( 0 ) ] = false ;
    }
    System . out . println ( "Case #" + ( tc + 1 ) + ": " + best ) ;
  }
  return G ;
}
