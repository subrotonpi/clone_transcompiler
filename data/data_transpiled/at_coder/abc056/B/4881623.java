public static int W ( int a , int b ) {
  int ans ;
  if ( a <= b ) {
    int aw = a + W ;
    ans = Math . max ( b - aw , 0 ) ;
  }
  else {
    int bw = b + W ;
    ans = Math . max ( a - bw , 0 ) ;
  }
  return ans ;
}
