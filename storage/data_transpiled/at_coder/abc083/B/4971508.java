public static int N ( ) {
  String A = input . nextLine ( ) ;
  String B = input . nextLine ( ) ;
  int k_sum = 0 ;
  int ans = 0 ;
  for ( int j = 1 ;
  j <= Integer . MAX_VALUE ;
  j ++ ) {
    String str = String . valueOf ( j ) ;
    k_sum = 0 ;
    for ( int i = 0 ;
    i < str . length ( ) ;
    i ++ ) k_sum += Integer . parseInt ( str . charAt ( i ) ) ;
    if ( k_sum >= A && k_sum <= B ) ans += Integer . parseInt ( str ) ;
  }
  return ans ;
}
