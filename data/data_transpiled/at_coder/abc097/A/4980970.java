public static void main ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  int d = Integer . parseInt ( input ) ;
  int AB = Math . abs ( a - b ) ;
  int AC = Math . abs ( a - c ) ;
  int BC = Math . abs ( b - c ) ;
  if ( AC <= d ) {
    System . out . println ( "Yes" ) ;
  }
  else if ( AB <= d && BC <= d ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
