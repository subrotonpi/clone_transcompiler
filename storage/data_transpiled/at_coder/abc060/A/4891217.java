public static void print ( String s ) {
  s = input . nextLine ( ) . split ( " " ) ;
  if ( ( s [ 0 ] . charAt ( s . length ( ) - 1 ) == s [ 1 ] . charAt ( 0 ) ) && ( s [ 1 ] . charAt ( s . length ( ) - 1 ) == s [ 2 ] . charAt ( 0 ) ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
