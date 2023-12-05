private static String getString ( ) {
  char c = String . valueOf ( input . charAt ( 0 ) ) ;
  String [ ] L = {
    'a' , 'i' , 'u' , 'e' , 'o' }
    ;
    if ( L [ c ] . contains ( "vowel" ) ) {
      System . out . println ( "vowel" ) ;
    }
    else {
      System . out . println ( "consonant" ) ;
    }
    return L [ c ] ;
  }
  