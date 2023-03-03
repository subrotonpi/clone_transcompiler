public static void print ( String A ) {
  String B = input ( ) ;
  if ( A . charAt ( 0 ) == B . charAt ( B . length ( ) - 1 ) && A . charAt ( 1 ) == B . charAt ( 1 ) && A . charAt ( B . length ( ) - 1 ) == B . charAt ( 0 ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
