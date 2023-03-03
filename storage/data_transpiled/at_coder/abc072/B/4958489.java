public static void input ( ) {
  String s = input ( ) ;
  StringBuilder ss = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( i % 2 == 0 ) {
      ss . append ( s . charAt ( i ) ) ;
    }
  }
  System . out . println ( ss . toString ( ) ) ;
}
