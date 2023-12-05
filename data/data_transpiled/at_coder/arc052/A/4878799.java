public static void main ( String [ ] args ) {
  String s = input . nextLine ( ) ;
  StringBuilder cs = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    char c = s . charAt ( i ) ;
    if ( c >= '0' && c <= '9' ) {
      cs . append ( c ) ;
    }
  }
  System . out . println ( Integer . parseInt ( cs . toString ( ) ) ) ;
}
