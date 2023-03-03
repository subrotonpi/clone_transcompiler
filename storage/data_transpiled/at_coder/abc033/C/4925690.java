static final public void input ( ) {
  String S = input ( ) ;
  String [ ] plus_list = S . split ( "\\+" ) ;
  int no_zero_count = 0 ;
  for ( String s : plus_list ) {
    if ( ( s . indexOf ( "0" ) == 0 ) && ( s . length ( ) == 0 ) ) no_zero_count ++ ;
  }
  System . out . println ( no_zero_count ) ;
}
