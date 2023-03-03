public static int Q ( int H , int S , int D ) {
  int N = Integer . parseInt ( input ( ) ) ;
  S = Math . min ( 4 * Q , 2 * H , S ) ;
  int ans ;
  if ( D >= 2 * S ) {
    ans = N * S ;
  }
  else {
    ans = N / 2 * D + N % 2 * S ;
  }
  return ans ;
}
