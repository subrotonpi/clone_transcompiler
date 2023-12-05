public static void main ( String [ ] args ) {
  int a , b ;
  a = Integer . parseInt ( input . nextLine ( ) ) ;
  b = Integer . parseInt ( input . nextLine ( ) ) ;
  a = Math . abs ( a ) ;
  b = Math . abs ( b ) ;
  if ( a < b ) {
    System . out . println ( "Ant" ) ;
  }
  else if ( a > b ) {
    System . out . println ( "Bug" ) ;
  }
  else {
    System . out . println ( "Draw" ) ;
  }
  if ( Class . isClassPresent ) {
    Class . forName ( "org.apache.log4j.Logger" ) ;
  }
}
