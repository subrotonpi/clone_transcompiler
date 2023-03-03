public static void main ( String [ ] args ) {
  String s = input ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) - 1 ;
  i ++ ) {
    if ( s . charAt ( i ) == s . charAt ( i + 1 ) ) {
      System . out . println ( i + 1 + " " + i + 2 ) ;
      return ;
    }
    else if ( i + 2 < s . length ( ) ) {
      return ;
    }
  }
}
