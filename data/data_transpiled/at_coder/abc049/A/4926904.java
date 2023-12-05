public static void input ( ) {
  char c = input . charAt ( 0 ) ;
  String [ ] vowels = {
    'a' , 'i' , 'u' , 'e' , 'o' }
    ;
    if ( vowels [ c ] . indexOf ( 'a' ) >= 0 ) {
      System . out . println ( "vowel" ) ;
    }
    else {
      System . out . println ( "consonant" ) ;
    }
  }
  