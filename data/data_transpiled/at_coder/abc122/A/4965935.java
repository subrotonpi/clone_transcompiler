public static char b ( ) {
  char b = input . charAt ( 0 ) ;
  switch ( b ) {
    case 'A' : System . out . print ( "T" ) ;
    break ;
    case 'T' : System . out . print ( "A" ) ;
    break ;
    case 'G' : System . out . print ( "C" ) ;
    break ;
    default : System . out . print ( "G" ) ;
    break ;
  }
  return b ;
}
