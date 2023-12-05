public static String print ( String r , String g , String b ) {
  String s = Integer . parseInt ( input . nextLine ( ) ) ;
  s = r + g + b ;
  s = Integer . parseInt ( s ) ;
  if ( s . length ( ) % 4 == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return s ;
}
