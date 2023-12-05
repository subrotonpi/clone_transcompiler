static final int [ ] solve ( ) {
  final int INF = 2 * 30 ;
  {
    final int [ ] perm = new int [ S . length ] ;
    for ( int i = 0 ;
    i < S . length ;
    i ++ ) perm [ i ] = s [ i ] ;
  }
  {
    if ( S . length == 1 ) {
      return perm ;
    }
    else {
      for ( int i = 0 ;
      i < S . length ;
      i ++ ) perm [ i ] = s [ i ] ;
      for ( int i : xrange ( S . length - 1 ) ) perm [ i ] = s [ i ] ;
    }
  }
  {
    final StringBuilder sb = new StringBuilder ( ) ;
    final int k = perm . length ;
    for ( int i : xrange ( 0 , S . length , k ) ) {
      final String t = new String ( S , i , k ) ;
      t = sb . append ( t . charAt ( perm [ i ] ) ) ;
      sb . append ( s ) ;
    }
    return sb . toString ( ) ;
  }
  private int count ( final String s ) {
    int res = 1 ;
    for ( int i = 1 ;
    i < s . length ( ) ;
    i ++ ) if ( s . charAt ( i ) != s . charAt ( i ) ) res ++ ;
    return res ;
  }
}
