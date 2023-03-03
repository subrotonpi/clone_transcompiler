static int [ ] withoutDuplication ( String s ) {
  int [ ] res = new int [ s . length ( ) ] ;
  int prev = - 1 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    int i = ( s . charAt ( i ) - 'a' ) ;
    if ( i != prev ) {
      res [ s . length ( ) ] = i ;
      prev = i ;
    }
  }
  final int mod = 1000000007 ;
  {
    if ( n <= 1 ) return 1 ;
  }
  {
    return n * fact ( n - 1 ) % mod ;
  }
  {
    int n = 26 ;
    int [ ] inE = new int [ n ] , outE = new int [ n ] , midE = new int [ n ] , badE = new int [ n ] ;
    int [ ] g = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      String s = s . substring ( 0 , i ) ;
      int [ ] letters = withoutDuplication ( s ) ;
      if ( letters . length == 1 ) midE [ letters [ 0 ] ] ++ ;
      else {
        outE [ letters [ 0 ] ] ++ ;
        inE [ letters [ letters . length - 1 ] ] ++ ;
        g [ letters [ 0 ] ] = letters [ letters . length - 1 ] ;
        for ( int j = 1 ;
        j < letters . length - 1 ;
        j ++ ) badE [ letters [ j ] ] ++ ;
      }
    }
    for ( int i : xrange ( n ) ) {
      if ( badE [ i ] > 0 && inE [ i ] + outE [ i ] + midE [ i ] + badE [ i ] > 1 ) return 0 ;
      if ( inE [ i ] > 1 || outE [ i ] > 1 ) return 0 ;
    }
    boolean [ ] seen = new boolean [ n ] , nc = 0 ;
    for ( int i : xrange ( n ) ) {
      if ( seen [ i ] || inE [ i ] != 0 ) continue ;
      if ( outE [ i ] + midE [ i ] > 0 ) nc ++ ;
      int t = i ;
      while ( t != - 1 ) {
        seen [ t ] = true ;
        t = g [ t ] ;
      }
    }
    if ( Stream . of ( seen ) . filter ( s -> s . charAt ( z ) == ' ' ) . count ( ) < n ) return 0 ;
  }
  int T