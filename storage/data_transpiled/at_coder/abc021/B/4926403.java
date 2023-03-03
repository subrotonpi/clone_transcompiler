public static void print ( String input ) {
  N = Integer . parseInt ( input ) ;
  a = Integer . parseInt ( input ) ;
  b = Integer . parseInt ( input ) ;
  K = Integer . parseInt ( input ) ;
  String [ ] Plist = ( input . split ( " " ) ) ;
  List < Integer > Plist_i = new ArrayList < Integer > ( ) ;
  for ( String s : Plist ) {
    Plist_i . add ( Integer . parseInt ( s ) ) ;
  }
  /* If the list is unique (list) then it is true */
  if ( N < 2 ) {
    System . out . println ( "NO" ) ;
  }
  else if ( K > ( N - 2 ) ) {
    System . out . println ( "NO" ) ;
  }
  else if ( a == b ) {
    System . out . println ( "NO" ) ;
  }
  else if ( Plist_i . isEmpty ( ) == false ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
  }
}
