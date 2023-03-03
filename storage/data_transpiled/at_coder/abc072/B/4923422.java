public static String input ( ) {
  String s = input ( ) ;
  String t = '' ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i += 2 ) {
    t += s . charAt ( i ) ;
  }
  System . out . println ( t ) ;
  return t ;
}
