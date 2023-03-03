public static void main ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  char [ ] c = new char [ H ] ;
  int [ ] [ ] d = new int [ W ] [ H ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    c [ i ] [ j ] = Character . toString ( input . charAt ( i ) ) ;
  }
  int [ ] [ ] d = new int [ W ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( c [ i ] [ j ] == 's' ) {
        q = new ArrayList < > ( ) ;
        q . add ( new Integer ( i ) ) ;
        q . add ( new Integer ( j ) ) ;
        q . add ( new Integer ( 0 ) ) ;
      }
      if ( c [ i ] [ j ] == 'g' ) {
        gi = i ;
        gj = j ;
      }
    }
  }
  while ( q . size ( ) > 0 ) {
    int i = q . get ( 0 ) ;
    int j = q . get ( 1 ) ;
    int k = 0 ;
    if ( i < 0 || i >= H || j < 0 || j >= W ) continue ;
    if ( c [ i ] [ j ] == '#' ) k ++ ;
    if ( k > 2 ) continue ;
    if ( c [ i ] [ j ] == 'g' ) {
      System . out . println ( "YES" ) ;
      break ;
    }
    if ( d [ i ] [ j ] <= k ) continue ;
    d [ i ] [ j ] = k ;
    q . add ( new Integer ( i - 1 ) ) ;
    q . add ( new Integer ( j ) ) ;
    q . add ( new Integer ( i + 1 ) ) ;
    q . add ( new Integer ( j ) ) ;
    q . add ( new Integer ( i ) ) ;
    q . add ( new Integer ( j - 1 ) ) ;
    q . add ( new Integer ( i ) ) ;
    q . add ( new Integer ( j + 1 ) ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
