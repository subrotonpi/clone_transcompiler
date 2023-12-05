static private int solve ( int N , int [ ] Z , boolean [ ] [ ] F ) {
  int p = Z . indexOf ( min ( Z ) ) ;
  int ans = Z [ p ] ;
  Stack < Integer > S = new Stack < > ( ) ;
  S . add ( p ) ;
  boolean [ ] V = new boolean [ N ] ;
  V [ p ] = true ;
  for ( ;
  ;
  ) {
    int next = - 1 ;
    for ( ;
    p < N ;
    p ++ ) {
      if ( V [ p ] ) continue ;
      Stack < Integer > s = S . empty ( ) ;
      while ( s . size ( ) > 0 && ! F [ s . peek ( ) ] [ p ] ) s . pop ( ) ;
      if ( s . size ( ) == 0 ) continue ;
      s . add ( p ) ;
      boolean [ ] v = V . clone ( ) ;
      boolean [ ] c = new boolean [ N ] ;
      while ( s . size ( ) > 0 ) {
        int q = s . pop ( ) ;
        v [ q ] = true ;
        for ( int i = 0 ;
        i < N ;
        i ++ ) {
          if ( F [ q ] [ i ] && ! v [ i ] ) s . push ( i ) ;
          c [ q ] = true ;
        }
      }
      boolean ok = true ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        if ( ! v [ i ] && ! V [ i ] ) ok = false ;
      }
      if ( ok && ( next < 0 || Z [ p ] < Z [ next ] ) ) next = p ;
    }
    ans += Z [ next ] ;
    while ( ! F [ S . peek ( ) ] [ next ] ) S . pop ( ) ;
    S . add ( next ) ;
    V [ next ] = true ;
  }
  for ( int t = 0 ;
  t < input . nextInt ( ) ;
  t ++ ) {
    N = Integer . parseInt ( input . nextLine ( ) ) ;
    M = Integer . parseInt ( input . nextLine ( ) ) ;
    Z = new int [ N ] ;
    F = new boolean [ N ] ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      int a = Integer . parseInt ( input . nextLine ( ) ) - 1 ;
      int b = Integer . parseInt ( input . nextLine ( ) ) ;
      F [ a ] [ b ] = F [ b ] [ a ] = true ;
    }
    System . out . println ( " Case ▁ #