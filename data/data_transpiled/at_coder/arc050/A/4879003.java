public static void main ( String [ ] args ) {
  String C = input . nextLine ( ) ;
  String c = input . nextLine ( ) ;
  if ( C . equalsIgnoreCase ( c ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  if ( getClass ( ) . equals ( "com.sun.tools.javac.Main" ) ) {
    Main . main ( args ) ;
  }
}
