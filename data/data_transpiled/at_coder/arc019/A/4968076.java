public static String print ( String s ) {
  s = list ( input ) ;
  StringBuffer res = new StringBuffer ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    switch ( s . charAt ( i ) ) {
      case 'I' : res . append ( '1' ) ;
      break ;
      case 'D' : case 'O' : res . append ( '0' ) ;
      break ;
      case 'B' : res . append ( '8' ) ;
      break ;
      case 'Z' : res . append ( '2' ) ;
      break ;
      case 'S' : res . append ( '5' ) ;
      break ;
      default : res . append ( s . charAt ( i ) ) ;
    }
  }
  System . out . println ( res ) ;
  return res . toString ( ) ;
}
