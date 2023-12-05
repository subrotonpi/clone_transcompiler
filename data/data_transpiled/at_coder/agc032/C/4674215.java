static private boolean solve ( int n , int m , Map < Integer , Set < Integer >> links ) {
  final Set < Integer > v4 = new HashSet < > ( ) ;
  int v6 = 0 ;
  for ( int v = 0 ;
  v < m ;
  v ++ ) {
    final Set < Integer > link = links . get ( v ) ;
    final int l = link . size ( ) ;
    if ( l % 2 == 1 ) {
      return false ;
    }
    if ( l == 4 ) {
      v4 . add ( v ) ;
    }
    else if ( l >= 6 ) {
      v6 ++ ;
    }
  }
  if ( v6 > 0 ) {
    return true ;
  }
  if ( v4 . size ( ) > 2 ) {
    return true ;
  }
  if ( v4 . size ( ) < 2 ) {
    return false ;
  }
  final int s = v4 . iterator ( ) . next ( ) ;
  final int t = v4 . iterator ( ) . next ( ) ;
  for ( int c : links . get ( s ) ) {
    final Set < Integer > visited = new HashSet < > ( ) ;
    visited . add ( s ) ;
    visited . add ( t ) ;
    final Queue < Integer > q = new Queue < > ( ) ;
    q . add ( c ) ;
    while ( q . size ( ) > 0 ) {
      final int v = q . poll ( ) ;
      if ( v != c ) {
        continue ;
      }
      visited . add ( v ) ;
    }
  }
  return false ;
}
