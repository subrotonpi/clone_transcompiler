public static void print ( int N ) {
  int [ ] score = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    score [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  int minimum = 100 ;
  for ( int s : score ) {
    ans += s ;
    if ( s % 10 != 0 ) {
      minimum = Math . min ( minimum , s ) ;
    }
  }
  if ( ans % 10 != 0 ) {
    System . out . println ( ans ) ;
  }
  else {
    if ( minimum == 100 ) {
      System . out . println ( "0" ) ;
    }
    else {
      System . out . println ( ans - minimum ) ;
    }
  }
}
