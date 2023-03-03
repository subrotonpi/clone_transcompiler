private static void puts ( String s ) {
  System . out . print ( s ) ;
  String vowels = "aeiou" ;
  /* solve case */
  String S = input . nextLine ( ) ;
  String n = input . nextLine ( ) ;
  n = Integer . parseInt ( n ) ;
  int streak = 0 ;
  int [ ] cons = new int [ S . length ( ) ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( vowels . indexOf ( S . charAt ( i ) ) >= 0 ) {
      streak = 0 ;
    }
    else {
      streak ++ ;
    }
    cons [ i ] = streak ;
  }
  int count = 0 ;
  int m = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( cons [ i ] >= n ) {
      m = i + 2 - n ;
    }
    count += m ;
  }
  System . out . println ( count ) ;
  for ( int testCase = 1 ;
  testCase <= 1 + Integer . MAX_VALUE ;
  testCase ++ ) {
    /* puts case #*/
    puts ( "Case #" + testCase + ": " ) ;
    /* solve case #*/
  }
}
