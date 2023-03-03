public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] s_list = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) s_list [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int left = 0 ;
  int right = 0 ;
  int sum_num = 1 ;
  int ans = 0 ;
  if ( 0 == s_list [ left ] ) {
    ans = N ;
  }
  else {
    while ( left < N ) {
      while ( right < N && sum_num * s_list [ right ] <= K ) {
        sum_num *= s_list [ right ] ;
        right ++ ;
      }
      ans = Math . max ( ans , right - left ) ;
      if ( left == right ) right ++ ;
      else {
        sum_num /= s_list [ left ] ;
      }
      left ++ ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
