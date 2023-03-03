static final String print ( String [ ] args ) {
  final int N = Integer . parseInt ( input ( args [ 0 ] ) ) ;
  String ans = "" ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( N == "1" ) ans += "9" ;
    else ans += "1" ;
  }
  System . out . println ( ans ) ;
  if ( args . length == 0 ) {
    System . out . println ( "Usage: java -jar <jar file> <jar file>" ) ;
  }
  return ans ;
}
