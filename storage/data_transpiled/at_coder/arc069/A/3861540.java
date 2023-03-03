public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int p = ( m / 2 - n ) / 2 ;
  int ans = Math . min ( n , m / 2 ) ;
  for ( int k = Math . max ( 0 , p - 10 ) ;
  k <= p ;
  k += 10 ) {
    int v = Math . min ( n + k , m / 2 - k ) ;
    if ( v >= 0 ) {
      ans = Math . max ( ans , v ) ;
    }
  }
  System . out . println ( ans ) ;
}
