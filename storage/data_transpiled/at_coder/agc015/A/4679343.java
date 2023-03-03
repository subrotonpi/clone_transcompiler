public static int N ( ) {
  int ans = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( A > B ) {
    ans = 0 ;
  }
  else if ( N == 1 ) {
    ans = A == B ? 1 : 0 ;
  }
  else {
    int sum_min = ( N - 2 ) * A ;
    int sum_max = ( N - 2 ) * B ;
    ans = sum_max - sum_min + 1 ;
  }
  return ans ;
}
