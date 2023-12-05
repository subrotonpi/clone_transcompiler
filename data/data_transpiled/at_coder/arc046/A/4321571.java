public static String aRepDigit ( int N ) {
  int s = N - 1 ;
  int t = N / 9 ;
  String ans = String . valueOf ( t + 1 ) * ( s + 1 ) ;
  return ans ;
}
