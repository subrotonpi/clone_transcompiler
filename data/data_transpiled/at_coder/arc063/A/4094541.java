public static int input ( ) {
  int ans = 0 ;
  char pre = s . charAt ( 0 ) ;
  for ( int i = 1 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( ( pre == s . charAt ( i ) ) ) {
      continue ;
    }
    else {
      ans ++ ;
      pre = s . charAt ( i ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
