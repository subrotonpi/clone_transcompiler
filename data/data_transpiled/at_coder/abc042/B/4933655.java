static void n ( int l ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > lines = new ArrayList < > ( l ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    lines . add ( String . valueOf ( input . nextLine ( ) ) ) ;
  }
  String test = "" ;
  for ( String line : lines ) {
    test += line ;
  }
  System . out . println ( test ) ;
}
