public static String input ( ) {
  String s = input ( ) ;
  StringBuffer t = new StringBuffer ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == 'a' || s . charAt ( i ) == 'i' || s . charAt ( i ) == 'u' || s . charAt ( i ) == 'e' || s . charAt ( i ) == 'o' ) {
      continue ;
    }
    else {
      t . append ( s . charAt ( i ) ) ;
    }
  }
  System . out . println ( t ) ;
  return t . toString ( ) ;
}
