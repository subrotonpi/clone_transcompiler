static final String print ( ) {
  final int [ ] a = new int [ 3000 ] ;
  System . setIn ( new BufferedReader ( new InputStreamReader ( System . in ) ) ) ;
  final int [ ] bar = new int [ a . length ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    for ( int y = a [ i ] ;
    y < a . length ;
    y ++ ) {
      bar [ i ] = y - nx ;
    }
  }
  final int [ ] foo2 = new int [ a . length ] ;
  int i = 0 ;
  final int n = a . length ;
  do {
    if ( a [ i ] == n ) break ;
    if ( a [ i ] > n ) return null ;
    picks [ i ] = a [ i ] ;
    i = a [ i ] ;
  }
  while ( i < n ) ;
  final StringBuilder res = new StringBuilder ( ) ;
  int nx = 0 ;
  for ( int x : picks ) {
    if ( x == nx ) {
      res . append ( height - level * ( n - x ) ) ;
    }
    else {
      final String t = foo2 ( bar ( a , nx , x ) , level + 1 , height - level * ( n - x ) ) ;
      if ( t == null ) return null ;
      res . append ( t ) ;
    }
    nx = x + 1 ;
  }
  while ( nx < n ) ;
  return res . toString ( ) ;
}
