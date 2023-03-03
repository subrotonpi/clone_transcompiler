static int foo2 ( String [ ] ss , String [ ] qs ) throws IOException {
  final int m = ss . length ;
  final int n = qs . length ;
  final Map < String , Integer > ss2 = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String s = ss [ i ] ;
    ss2 . put ( s , i ) ;
  }
  final int [ ] [ ] res = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    res [ i ] [ 0 ] = - 1 ;
  }
  Arrays . sort ( qs ) ;
  int t = ss2 . getOrDefault ( qs [ 0 ] , - 1 ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    if ( i == t ) continue ;
    res [ 0 ] [ i ] = 0 ;
  }
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    t = ss2 . getOrDefault ( qs [ i ] , - 1 ) ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      if ( j == t ) continue ;
      for ( int k = 0 ;
      k < m ;
      k ++ ) {
        if ( res [ i - 1 ] [ k ] == - 1 ) continue ;
        int nr = res [ i - 1 ] [ k ] ;
        if ( j != k ) nr ++ ;
        if ( res [ i ] [ j ] == - 1 || res [ i ] [ j ] > nr ) res [ i ] [ j ] = nr ;
      }
    }
  }
  return Math . min ( Arrays . asList ( res ) , n - 1 ) ;
}
