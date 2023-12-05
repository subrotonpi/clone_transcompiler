static int input ( ) {
  int ans = 10 * 5 ;
  {
    int cnt = 0 ;
    int k = s . indexOf ( w ) ;
    int length = s . length ( ) ;
    while ( true ) {
      if ( k == length ) break ;
      StringBuffer s_ = new StringBuffer ( ) ;
      for ( int i = 0 ;
      i < s . length ( ) - 1 ;
      i ++ ) {
        if ( s . charAt ( i + 1 ) == w ) s_ . append ( w ) ;
        else s_ . append ( s . charAt ( i ) ) ;
      }
      length -- ;
      k = s_ . indexOf ( w ) ;
      s = s_ . toString ( ) ;
      cnt ++ ;
    }
  }
  for ( int s_ : s ) ans = Math . min ( ans , f ( s , s_ ) ) ;
  System . out . println ( ans ) ;
  return ans ;
}
