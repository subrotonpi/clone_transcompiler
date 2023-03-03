static final void dbg ( String a [ ] ) {
  int i , c ;
  int dist1 = 0 ;
  int res = 0 ;
  for ( i = 0 ;
  i < n ;
  i ++ ) {
    for ( j = 0 ;
    j < m ;
    j ++ ) {
      if ( a [ i ] . charAt ( j ) == '.' ) continue ;
      res += dist [ i ] [ j ] ;
    }
  }
  int p = ( int ) dist1 / 2 ;
  if ( dist1 % 2 > 0 ) {
    for ( i = 0 ;
    i < p ;
    i ++ ) res -= 2 * i ;
    for ( i = 0 ;
    i < dist1 ;
    i ++ ) res -= 2 * i ;
    for ( j = 0 ;
    j < m ;
    j ++ ) res += dist1 ;
    System . out . println ( "Case #" + ( test + 1 ) + "\n" ) ;
    n = ( int ) ( ( test + 1 ) / 2 ) ;
    m = ( int ) ( ( test + 1 ) / 2 ) ;
    a = new boolean [ n ] [ m ] ;
    dist = new int [ n ] [ m ] ;
    int r1 = 0 , c1 = 0 ;
    for ( i = 0 ;
    i < n ;
    i ++ ) {
      String s = ( String ) ( test + 1 ) ;
      a [ i ] = new boolean [ s ] ;
      dist [ i ] = new int [ s ] ;
      for ( j = 0 ;
      j < m ;
      j ++ ) {
        c = s . charAt ( j ) ;
        a [ i ] [ j ] = c != '.' ;
        dist [ i ] [ j ] = - 1 ;
        if ( ( c == 'T' ) && ( i + j ) > 0 ) r1 = i ;
        c1 = j ;
      }
    }
  }
  dr = new int [ ] {
    - 1 , 1 , 0 , 0 }
    ;
    dc = new int [ ] {
      0 , 0 , - 1 , 1 }
      ;
      dist [ 0 ] [ 0 ] = 0 ;
      q = new int [ ] {
        0 , 0 }
        ;
        qh = 0 ;
        qt = 1 ;
        while ( qh < qt ) {
          ( r = q [ qh ] ) ;
          c = ( c = q [ qh ] ) ;
          d = dist [ r ] [ c ] + 1 ;
          for ( i = 0 ;
          i < 4 ;
          i ++ ) put ( r + dr [ i ] , c + dc [ i ] , d )