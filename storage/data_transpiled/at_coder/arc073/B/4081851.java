private static void solve ( ) {
  I < Integer > i = new I < Integer > ( ) {
    @ Override public Integer [ ] apply ( Integer [ ] input ) {
      return Ints . toArray ( input ) ;
    }
  }
  ;
  int N = i . nextInt ( ) ;
  int W = i . nextInt ( ) ;
  Map < Integer , Integer > g = new HashMap < Integer , Integer > ( ) ;
  for ( ;
  N -- > 0 ;
  ) {
    int a = i . nextInt ( ) ;
    int b = i . nextInt ( ) ;
    g . put ( a , g . get ( a ) + b ) ;
  }
  int [ ] * w = g . keySet ( ) . toArray ( new Integer [ N ] ) ;
  int [ ] [ ] v = new int [ 4 ] [ ] ;
  for ( int i = 0 ;
  i < w . length ;
  i ++ ) {
    int [ ] s = new int [ 4 ] ;
    s [ 0 ] = 0 ;
    Arrays . sort ( g . get ( w [ i ] ) ) ;
    for ( int j = 1 ;
    j < s . length ;
    j ++ ) s [ j ] += s [ i - 1 ] ;
    v [ i ] = s ;
  }
  for ( int i = 0 ;
  i < w . length ;
  i ++ ) {
    w [ i ] = 10 * 18 ;
    v [ i ] [ 0 ] = 0 ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < v [ 0 ] . length ;
  i ++ ) {
    int s0 = w [ 0 ] * i ;
    for ( int j = 0 ;
    j < v [ 1 ] . length ;
    j ++ ) {
      int s1 = s0 + w [ 1 ] * j ;
      if ( s1 > W ) break ;
      for ( int k = 0 ;
      k < v [ 2 ] . length ;
      k ++ ) {
        int s2 = s1 + w [ 2 ] * k ;
        if ( s2 > W ) break ;
        int l = Math . min ( ( W - s2 ) / w [ 3 ] , v [ 3 ] . length - 1 ) ;
        ans = Math . max ( ans , v [ 0 ] [ i ] + v [ 1 ] [ j ] + v [ 2 ] [ k ] + v [ 3 ] [ l ] ) ;
      }
    }
  }
  System . out . println ( ans ) ;
}
