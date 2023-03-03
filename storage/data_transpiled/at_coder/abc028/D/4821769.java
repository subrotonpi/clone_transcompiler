public static void print ( int n , int k ) {
  int ans = Integer . parseInt ( input ( ) ) ;
  ans = 1 + 3 * ( n - 1 ) + 6 * ( k - 1 ) * ( n - k ) ;
  ans /= n ;
  ans /= n ;
  System . out . println ( ans / n ) ;
}
