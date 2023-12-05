static void solve ( int c ) {
  int n = Integer . parseInt ( readLine ( ) ) ;
  int m = Integer . parseInt ( readLine ( ) ) ;
  int [ ] [ ] g = new int [ n ] [ n ] ;
  int [ ] [ ] buckets = new int [ n ] [ m ] ;
  int area = - 1 ;
  for ( int i : xrange ( n ) ) {
    g [ i ] = map ( readLine ( ) ) ;
  }
  for ( int i : xrange ( m ) ) {
    buckets [ i ] = map ( readLine ( ) ) ;
  }
  int [ ] ans = new int [ n ] ;
  for ( int i = 0 ;
  i < ans . length ;
  i ++ ) {
    int cases = Integer . parseInt ( readLine ( ) ) ;
    for ( int j = 0 ;
    j < cases ;
    j ++ ) {
      int l1 = ( ( b [ 0 ] - g [ 0 ] [ 0 ] ) * ( b [ 1 ] - g [ 0 ] [ 1 ] ) * ( b [ 0 ] - g [ 1 ] [ 0 ] ) * ( b [ 1 ] - g [ 0 ] [ 1 ] ) ) ;
      int l2 = ( ( b [ 0 ] - g [ 1 ] [ 0 ] ) * ( b [ 1 ] - g [ 1 ] [ 1 ] ) * ( b [ 0 ] - g [ 1 ] [ 1 ] ) * ( b [ 1 ] - g [ 0 ] [ 1 ] ) ) ;
      int ll = ( ( g [ 0 ] [ 0 ] - g [ 1 ] [ 0 ] ) * ( b [ 0 ] - g [ 1 ] [ 0 ] ) * ( b [ 1 ] - g [ 1 ] [ 1 ] ) ) ;
      int [ ] vec1 = {
        ( g [ 1 ] [ 0 ] - g [ 0 ] [ 0 ] ) / ll , ( g [ 1 ] [ 1 ] - g [ 0 ] [ 1 ] ) / ll }
        ;
        int [ ] vec2 = {
          ( g [ 0 ] [ 0 ] - g [ 1 ] [ 0 ] ) / ll , ( g [ 1 ] [ 1 ] - g [ 0 ] [ 1 ] ) / ll }
          ;
          int [ ] c1 = {
            vec1 [ 0 ] * l1 + g [ 0 ] [ 0 ] , vec1 [ 1 ] * l1 + g [ 0 ] [ 1 ] }
            ;
            int [ ] c2 = {
              vec2 [ 0 ] * l2 + g [ 1 ] [ 0 ] , vec2 [