public static long getInverseElement ( @ IntRange ( from = 0 , to = 100 ) long x , int mod ) {
  long ans = 1 ;
  String bit = Integer . toBinaryString ( mod - 2 ) ;
  for ( int i = 0 ;
  i < bit . length ( ) ;
  i ++ ) {
    if ( bit . charAt ( i ) == '1' ) ans = ans * x % mod ;
    x = x * x % mod ;
  }
  return ans ;
}
