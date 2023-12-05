public static void main ( String [ ] args ) {
  String s = input ( ) ;
  if ( s . equals ( s . substring ( 0 , s . length ( ) - 1 ) ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  if ( getClass ( ) . isAnonymousClass ( ) ) {
    new Main ( ) ;
  }
}
