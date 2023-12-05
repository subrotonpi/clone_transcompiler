@ Scanner ( System . in ) public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int ans4 = 0 ;
  int ans2 = 0 ;
  int ans0 = 0 ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] % 4 == 0 ) {
      ans4 ++ ;
    }
    else if ( a [ i ] % 2 == 0 ) {
      ans2 ++ ;
    }
    else {
      ans0 ++ ;
    }
  }
  if ( ans2 > 0 ) {
    if ( ans0 <= ans4 ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
  else {
    if ( ceil ( ( ans0 + ans4 ) / 2 ) >= ans0 ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
}
