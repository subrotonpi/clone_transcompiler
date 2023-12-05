public static int x ( ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  switch ( x ) {
    case 3 : case 5 : case 7 : System . out . println ( "YES" ) ;
    break ;
    default : System . out . println ( "NO" ) ;
    break ;
  }
  return x ;
}
