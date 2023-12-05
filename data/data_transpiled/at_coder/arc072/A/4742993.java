public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = Integer . parseInt ( input ) ;
  int ans1 = 0 ;
  int s1 = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s1 += a [ i ] ;
    if ( i % 2 == 0 ) {
      if ( s1 <= 0 ) {
        ans1 += 1 - s1 ;
        s1 = 1 ;
      }
    }
    else {
      if ( s1 >= 0 ) {
        ans1 += s1 + 1 ;
        s1 = - 1 ;
      }
    }
  }
  int ans2 = 0 ;
  int s2 = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s2 += a [ i ] ;
    if ( i % 2 == 1 ) {
      if ( s2 <= 0 ) {
        ans2 += 1 - s2 ;
        s2 = 1 ;
      }
    }
    else {
      if ( s2 >= 0 ) {
        ans2 += s2 + 1 ;
        s2 = - 1 ;
      }
    }
  }
  System . out . println ( Math . min ( ans1 , ans2 ) ) ;
}
