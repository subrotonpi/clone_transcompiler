public static int cin ( int m , int a , int b ) {
  int cin = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 1 ;
  i <= m ;
  i ++ ) {
    if ( cin <= a ) cin += b ;
    cin -= Integer . parseInt ( input . nextLine ( ) ) ;
    if ( cin < 0 ) {
      System . out . println ( i ) ;
      break ;
    }
  }
  else System . out . println ( "complete" ) ;
  return cin ;
}
