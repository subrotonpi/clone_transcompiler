public static void print ( String rgb ) {
  rgb = input . replace ( " " , "" ) ;
  int num = Integer . parseInt ( rgb ) ;
  if ( num % 4 == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
