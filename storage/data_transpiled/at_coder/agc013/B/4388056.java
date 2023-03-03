static private int [ ] [ ] readEdge ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final double inf = Double . POSITIVE_INFINITY ;
  final int n = Integer . parseInt ( input ) ;
  final int m = Integer . parseInt ( input ) ;
  final int [ ] [ ] edge = new int [ n + 1 ] [ m + 1 ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    final int a = Integer . parseInt ( input ) ;
    final int b = Integer . parseInt ( input ) ;
    edge [ a ] [ i ] = b ;
    edge [ b ] [ i ] = a ;
  }
  final int [ ] [ ] used = new int [ n + 1 ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    final int e = edge [ i ] [ 0 ] ;
    if ( used [ e ] ) {
      continue ;
    }
    else {
      return new int [ e ] [ ] ;
    }
  }
  final boolean [ ] [ ] used = new boolean [ n + 1 ] [ ] ;
  used [ 1 ] = used [ edge [ 1 ] [ 0 ] ] ;
  final int [ ] path = new int [ 2 ] ;
  path [ 0 ] = 1 ;
  path [ 1 ] = edge [ 1 ] [ 0 ] ;
  while ( true ) {
    final int con = ( con < inf ) ? - 1 : 1 ;
    if ( con == - 1 ) {
      break ;
    }
    else {
      path [ 0 ] = con ;
      used [ con ] = true ;
    }
  }
  path [ path . length - 1 ] = 0 ;
  while ( true ) {
    final int con = ( con < inf ) ? - 1 : 1 ;
    if ( con == - 1 ) {
      break ;
    }
    else {
      path [ path . length - 1 ] = con ;
      used [ con ] = true ;
    }
  }
  System . out . println ( path . length ) ;
  for ( int i = 0 ;
  i < path . length ;
  i ++ ) {
    final int e = path [ i ] [ 0 ] ;
    System . out . print ( e + " " ) ;
  }
  return used ;
}
