private static int Y = Integer . parseInt ( input ) {
  switch ( Y % 400 ) {
    case 0 : System . out . println ( "YES" ) ;
    break ;
    case 100 : System . out . println ( "NO" ) ;
    break ;
    case 4 : System . out . println ( "YES" ) ;
    break ;
    default : System . out . println ( "NO" ) ;
    break ;
  }
  return Y ;
}
