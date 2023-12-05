public static void print ( String s ) {
  s = new LinkedList < String > ( ) ;
  s . add ( input . nextLine ( ) ) ;
  int c = 0 ;
  for ( int i = 0 ;
  i < ( int ) s . length ( ) / 2 ;
  i ++ ) {
    if ( s . charAt ( i ) == s . charAt ( s . length ( ) - 1 - i ) ) {
      c ++ ;
    }
  }
  if ( c == ( int ) s . length ( ) / 2 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
