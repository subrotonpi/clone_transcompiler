private static final Scanner input = new Scanner ( System . in ) {
  private final char a = input . next ( ) ;
  private final char [ ] vowel = {
    'a' , 'i' , 'u' , 'e' , 'o' }
    ;
    boolean flag = false ;
    for ( int i = 0 ;
    i < vowel . length ;
    i ++ ) {
      if ( ( vowel [ i ] == a ) && ( vowel [ i ] == 'a' ) ) {
        flag = true ;
      }
    }
    if ( ( flag == true ) && ( vowel [ 0 ] == 'a' ) ) {
      System . out . println ( "vowel" ) ;
    }
    else {
      System . out . println ( "consonant" ) ;
    }
  }
  