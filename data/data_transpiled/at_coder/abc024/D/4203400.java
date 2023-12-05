public static int solve ( int A , int B , int C ) {
  int r = B * C % MOD - A * C % MOD ;
  r = r * Math . pow ( A * B % MOD + A * C % MOD - B * C % MOD , MOD - 2 , MOD ) % MOD ;
  int c = C * B % MOD - A * B % MOD ;
  c = c * Math . pow ( A * C % MOD + A * B % MOD - B * C % MOD , MOD - 2 , MOD ) % MOD ;
  return r + c ;
}
