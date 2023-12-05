static final String getPrintingString ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  final String INT = input . nextLine ( ) ;
  final String MAP = input . nextLine ( ) ;
  final String LIST = input . nextLine ( ) ;
  System . setOut ( "" ) ;
  INF = Double . POSITIVE_INFINITY ;
  MOD = 10 * 9 + 7 ;
  final char c = input . charAt ( 0 ) ;
  final String boin [ ] = {
    'a' , 'i' , 'u' , 'e' , 'o' }
    ;
    if ( boin [ c ] . contains ( "vowel" ) ) {
      System . out . println ( "vowel" ) ;
    }
    else {
      System . out . println ( "consonant" ) ;
    }
    return INT ;
  }
  