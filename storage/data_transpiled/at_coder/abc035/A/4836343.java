public static void main ( String input ) {
  int w = Integer . parseInt ( input ) ;
  int h = Integer . parseInt ( input ) ;
  if ( Math . round ( w / h ) == 1.33 ) {
    System . out . println ( "4:3" ) ;
  }
  else {
    System . out . println ( "16:9" ) ;
  }
}
