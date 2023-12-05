@ VisibleForTesting static void check ( ) {
  final String nextLine = System . getProperty ( "line.separator" ) ;
  final int N = Integer . parseInt ( nextLine ) ;
  final int M = Integer . parseInt ( nextLine ) ;
  final int [ ] [ ] G = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    G [ i ] = new int [ N ] ;
  }
  for ( int i = 0 ;
  i < G . length ;
  i ++ ) {
    int a = Integer . parseInt ( nextLine ) ;
    int b = Integer . parseInt ( nextLine ) ;
    a -- ;
    b -- ;
    G [ i ] [ a ] = b ;
    G [ i ] [ b ] = a ;
  }
  {
    int [ ] u = new int [ N ] ;
    Arrays . fill ( u , 0 ) ;
    u [ s ] = u [ t ] = 1 ;
    Deque < Integer > que = new LinkedList < Integer > ( ) ;
    for ( int v : G [ s ] ) {
      if ( v == t ) continue ;
      u [ v ] = 1 ;
      que . add ( v ) ;
      boolean ok = false ;
      while ( que . size ( ) > 0 ) {
        int x = que . poll ( ) ;
        for ( int y : G [ x ] ) {
          if ( y == s && x != v ) return ;
          if ( ! u [ y ] ) {
            u [ y ] = 1 ;
            que . add ( y ) ;
          }
        }
      }
    }
    return ;
  }
  int [ ] C = new int [ 4 ] ;
  ok = true ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( G [ i ] . length % 2 == 1 ) ok = false ;
    C [ Math . min ( 3 , G [ i ] . length / 2 ) ] ++ ;
  }
  if ( C [ 1 ] == N || ( C [ 1 ] == N - 1 && C [ 2 ] == 1 ) ) ok = false ;
  else if ( C [ 1 ] == N - 2 && C [ 2 ] == 2 ) {
    int [ ] VV = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( G [ i ] . length == 4 ) VV [ i ] = i ;
    }
    if ( ! check ( * VV ) ) ok = false ;
  }
  System . out . println ( ok ? "Yes" : "No" ) ;
}
