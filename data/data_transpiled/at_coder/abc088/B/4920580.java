public static void input ( ) {
  List < Integer > numbers = new ArrayList < > ( Collections . singletonList ( Integer . parseInt ( input ( ) ) ) ) ;
  int alice = 0 ;
  int bob = 0 ;
  while ( ( numbers . size ( ) > 0 ) ) {
    if ( numbers . size ( ) == 1 ) {
      alice += numbers . remove ( numbers . size ( ) - 1 ) ;
    }
    else {
      alice += numbers . remove ( numbers . size ( ) - 1 ) ;
      bob += numbers . remove ( numbers . size ( ) - 1 ) ;
    }
  }
  System . out . println ( alice - bob ) ;
}
