public static String bEuclideanAlgorithm ( int K ) {
  int [ ] fibonacci = new int [ K + 2 ] ;
  fibonacci [ 1 ] = 1 ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    fibonacci [ i + 2 ] = fibonacci [ i + 1 ] + fibonacci [ i ] ;
  }
  String ans = "" + ans ;
  return ans ;
}
