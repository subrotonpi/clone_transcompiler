public static String bXored ( int L , int [ ] B ) {
  int [ ] a = new int [ L ] ;
  for ( int k = 0 ;
  k < L - 1 ;
  k ++ ) {
    a [ k + 1 ] = B [ k ] ^ a [ k ] ;
  }
  String ans = "\n" + Integer . toString ( a ) ;
  return ans ;
}
