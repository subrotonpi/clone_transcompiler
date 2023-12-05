public static String input ( ) {
  String s = input ( ) ;
  StringBuffer res = new StringBuffer ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    switch ( s . charAt ( i ) ) {
      case 'O' : res . append ( '0' ) ;
      break ;
      case 'D' : res . append ( '0' ) ;
      break ;
      case 'I' : res . append ( '1' ) ;
      break ;
      case 'Z' : res . append ( '2' ) ;
      break ;
      case 'S' : res . append ( '5' ) ;
      break ;
      case 'B' : res . append ( '8' ) ;
      break ;
      default : res . append ( s . charAt ( i ) ) ;
    }
  }
  System . out . println ( res ) ;
  return res . toString ( ) ;
}
