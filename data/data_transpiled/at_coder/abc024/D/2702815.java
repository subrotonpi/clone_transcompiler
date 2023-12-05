public static int power ( int n , int k ) {
  if ( k == 1 ) return n ;
  else if ( k % 2 == 0 ) return power ( ( n * n ) % mod , k / 2 ) ;
  else return ( n * power ( n , k - 1 ) ) % mod ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  return b ;
}
