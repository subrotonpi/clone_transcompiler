public static void input ( ) {
  String s = input . nextLine ( ) ;
  if ( HashSet . valueOf ( s ) . length ( ) == 1 ) {
    System . out . println ( "0" ) ;
  }
  else {
    LinkedList < String > wordList = new LinkedList < String > ( ) ;
    wordList . add ( s ) ;
    int cnt = 10 * 5 ;
    for ( String word : wordList ) {
      String [ ] t = s . split ( " " ) ;
      for ( int i = 1 ;
      i < s . length ( ) ;
      i ++ ) {
        StringBuffer tmp = new StringBuffer ( ) ;
        for ( int j = 0 ;
        j < t . length - 1 ;
        j ++ ) {
          if ( t [ j ] . equals ( word ) || t [ j + 1 ] . equals ( word ) ) {
            tmp . append ( word ) ;
          }
          else {
            tmp . append ( t [ j ] ) ;
          }
        }
        if ( HashSet . valueOf ( tmp . toString ( ) ) . length ( ) == 1 ) {
          cnt = Math . min ( cnt , i ) ;
          break ;
        }
        t = tmp . toString ( ) ;
      }
    }
    System . out . println ( cnt ) ;
  }
}
