public static String [ ] rotate ( int N , @ NonNull String [ ] S ) {
  String [ ] res = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    res [ i ] = "" ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      res [ i ] += S [ N - j - 1 ] . charAt ( i ) ;
    }
  }
  String [ ] ans ;
  ans = rotate ( N , S ) ;
  System . out . println ( Arrays . toString ( ans ) ) ;
  return ans ;
}
