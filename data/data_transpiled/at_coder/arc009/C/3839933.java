public static int c_24 ( int N , int K ) {
  final int MOD = 1777777777 ;
  class Combination {
    int mod ;
    public int mod ;
    public int mod ;
    public int mult_inverse_ ( int n ) {
      return pow ( n , mod - 2 , mod ) ;
    }
    public int comb ( int n , int r ) {
      if ( n < 0 || r < 0 || n < r ) return 0 ;
      int numerator = 1 , denominator = 1 ;
      for ( int k = n ;
      k > n - r ;
      k -- ) {
        numerator = ( numerator * k ) % mod ;
      }
      for ( int k = r ;
      k > 0 ;
      k -- ) {
        denominator = ( denominator * k ) % mod ;
      }
      return t2 ;
    }
  }
  int ans = 0 ;
  for ( String i : input . split ( ) ) {
    ans = Integer . parseInt ( i ) ;
  }
  System . out . println ( c_24 ( N , K ) ) ;
  return ans ;
}
