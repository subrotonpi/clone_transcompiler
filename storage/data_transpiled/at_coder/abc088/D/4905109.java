public static int [ ] [ ] [ ] M = new int [ H ] [ W ] ;
int wCount = 0 ;
for ( int i = 0 ;
i < H ;
i ++ ) {
  String s = input . nextLine ( ) ;
  int [ ] [ ] m = new int [ W ] [ W ] ;
  for ( int j = 0 ;
  j < W ;
  j ++ ) {
    if ( s . charAt ( j ) == '.' ) {
      m [ j ] [ w ] = 0 ;
      wCount ++ ;
    }
    else {
      m [ j ] [ w ] = 1 ;
    }
  }
  M [ i ] [ W ] = m ;
}
int [ ] [ ] [ ] path = new int [ W ] [ H ] [ W ] ;
for ( int j = 0 ;
j < H ;
j ++ ) {
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( M [ i ] [ j ] == 0 ) {
        if ( i != H - 1 ) {
          if ( M [ i + 1 ] [ j ] == 0 ) {
            path [ i ] [ j ] [ 0 ] = i + 1 ;
            path [ i + 1 ] [ j ] [ 0 ] = j ;
          }
        }
        if ( j != W - 1 ) {
          if ( M [ i ] [ j + 1 ] == 0 ) {
            path [ i ] [ j ] [ 0 ] = i ;
            path [ i ] [ j + 1 ] [ 0 ] = j ;
          }
        }
      }
    }
  }
  int [ ] [ ] M_path = new int [ W ] [ H ] ;
  for ( int j = 0 ;
  j < W ;
  j ++ ) {
    M_path [ j ] [ 0 ] = 10 * 27 ;
  }
  boolean [ ] [ ] M_checked = new boolean [ W ] [ H ] ;
  for ( int j = 0 ;
  j < W ;
  j ++ ) {
    M_checked [ j ] [ 0 ] = false ;
  }
  M_path [ 0 ] [ 0 ] = 0 ;
  @ SuppressWarnings ( "unchecked" ) Queue < Integer > Q = new LinkedList < Integer > ( ) ;
  M_checked [ 0 ] [ 0 ] = true ;
  while ( Q . size ( ) > 0 ) {
    int i = Q . remove ( ) ;
    int j = M_path [ i ] [ j ] ;
    int mp = M_path [ i ] [ j ] ;
    for ( int p : path