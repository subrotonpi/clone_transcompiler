public static int T = Integer . parseInt ( input ) {
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    final String s = input . next ( ) ;
    int standing = 0 ;
    int invited = 0 ;
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      standing += Integer . parseInt ( s . substring ( i , i + 1 ) ) ;
      if ( standing <= i ) {
        invited ++ ;
        standing ++ ;
      }
    }
    System . out . println ( "Case #" + testCase + ": " + invited ) ;
  }
  return T ;
}
