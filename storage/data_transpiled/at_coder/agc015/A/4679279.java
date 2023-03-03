public static int N ( ) {
  int N , A , B ;
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( A > B ) {
    ans = 0 ;
  }
  else if ( N == 1 ) {
    ans = A == B ? 1 : 0 ;
  }
  else {
    ans = ( N - 2 ) * ( B - A ) + 1 ;
  }
  return ans ;
}
