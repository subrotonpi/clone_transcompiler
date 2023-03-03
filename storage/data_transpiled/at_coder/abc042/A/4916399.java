@ Sys public static void main ( String [ ] args ) {
  String a = new String ( args [ 0 ] ) ;
  a . replaceAll ( "\\s" , "5" ) ;
  if ( a . replaceAll ( "\\s" , "5" ) . equals ( 2 ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
