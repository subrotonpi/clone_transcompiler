public static void input ( Scanner scanner ) {
  for ( int testCase = 0 ;
  testCase < numCases ;
  testCase ++ ) {
    String rawCounts = scanner . nextLine ( ) . split ( " " ) [ 1 ] ;
    List < Integer > counts = CollectionUtils . toIntListWithExpectedSize ( Collections . nCopies ( numCases , rawCounts ) ) ;
    int standing = 0 ;
    int invited = 0 ;
    for ( int i = 0 ;
    i < counts . size ( ) ;
    i ++ ) {
      int count = counts . get ( i ) ;
      if ( count > 0 ) {
        int toInvite = Math . max ( i - standing , 0 ) ;
        invited += toInvite ;
        standing += toInvite + count ;
      }
    }
    System . out . printf ( "Case #%d: %d%n" , testCase + 1 , invited ) ;
  }
}
