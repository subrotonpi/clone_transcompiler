public static int N = Integer . parseInt ( input ) {
  String S = input ;
  int x = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    switch ( S . charAt ( i ) ) {
      case 'I' : x ++ ;
      ans = Math . max ( ans , x ) ;
      break ;
      case 'D' : x -- ;
      break ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
