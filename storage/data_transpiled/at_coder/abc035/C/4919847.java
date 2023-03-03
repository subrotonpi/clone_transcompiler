public static String othello ( @ Nonnegative int N , int Q , @ Nonnegative int [ ] queries ) {
  int [ ] s = new int [ N ] ;
  for ( int l = 0 ;
  l < queries . length ;
  l ++ ) {
    s [ queries [ l ] - 1 ] ++ ;
    if ( queries [ l ] < N ) {
      s [ queries [ l ] ] -- ;
    }
  }
  char [ ] cum = new char [ N ] ;
  cum [ 0 ] = s [ 0 ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    cum [ i ] = cum [ i - 1 ] + s [ i ] ;
  }
  return new String ( cum ) ;
}
