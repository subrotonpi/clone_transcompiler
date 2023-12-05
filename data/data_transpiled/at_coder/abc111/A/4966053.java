public static void input ( ) {
  String s = input ( ) ;
  StringBuffer s2 = new StringBuffer ( ) ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    if ( s . charAt ( i ) == '1' ) {
      s2 . append ( "9" ) ;
    }
    else {
      s2 . append ( '1' ) ;
    }
  }
  System . out . println ( s2 ) ;
}
