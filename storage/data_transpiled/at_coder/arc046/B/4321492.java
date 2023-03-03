public static String bStone ( int N , int A , int B ) {
  if ( N <= A ) return "Takahashi" ;
  String ans ;
  if ( A == B ) {
    ans = N % ( A + 1 ) != 0 ? "Takahashi" : "Aoki" ;
  }
  else ans = "Takahashi" ;
  return ans ;
}
