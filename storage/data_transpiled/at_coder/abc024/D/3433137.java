public static String dDynamicprogramming ( int A , int B , int C ) {
  int MOD = 10 * 9 + 7 ;
  int c = ( ( ( B * C - A * B + MOD ) % MOD ) * Math . pow ( ( A * C - B * C + A * B + MOD ) % MOD , MOD - 2 , MOD ) ) % MOD ;
  int r = ( ( ( B * C - A * C + MOD ) % MOD ) * Math . pow ( ( A * B - B * C + A * C + MOD ) % MOD , MOD - 2 , MOD ) ) % MOD ;
  String ans = r + " " + c ;
  return ans ;
}
