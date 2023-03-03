static final String getSortingString ( ) throws IOException {
  File file = new File ( args . get ( 0 ) ) ;
  BufferedReader inputReader = new BufferedReader ( new FileReader ( file ) ) ;
  int numcases = Integer . parseInt ( inputReader . readLine ( ) . trim ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= numcases ;
  testCase ++ ) {
    int K = Integer . parseInt ( inputReader . readLine ( ) . trim ( ) ) ;
    List < Integer > list = CollectionUtils . getSortedList ( inputReader . readLine ( ) . trim ( ) ) ;
    int n = list . get ( 0 ) ;
    int [ ] dis = list . subList ( 1 , list . size ( ) ) ;
    int [ ] cards = new int [ K ] ;
    int [ ] remainingcards = new int [ K ] ;
    int remainingcardpos = 0 ;
    for ( int cardvalue = 0 ;
    cardvalue < K ;
    cardvalue ++ ) {
      remainingcardpos = ( cardvalue + remainingcardpos ) % remainingcards . length ;
      int card = remainingcards [ remainingcardpos ] ;
      cards [ card ] = cardvalue + 1 ;
      remainingcards [ remainingcardpos ] -- ;
    }
    System . out . print ( "Case #" + testCase + ":" ) ;
    for ( int di : dis ) {
      System . out . print ( " " + cards [ di - 1 ] ) ;
    }
    System . out . println ( ) ;
  }
  return file . getAbsolutePath ( ) ;
}
