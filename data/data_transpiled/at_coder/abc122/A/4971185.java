public static char [ ] [ ] getChars ( ) {
  char b = String . valueOf ( input . nextLine ( ) ) . charAt ( 0 ) ;
  switch ( b ) {
    case 'A' : System . out . println ( 'T' ) ;
    break ;
    case 'T' : System . out . println ( 'A' ) ;
    break ;
    case 'C' : System . out . println ( 'G' ) ;
    break ;
    case 'G' : System . out . println ( 'C' ) ;
    break ;
    default : break ;
  }
  return new char [ ] [ ] {
    b }
    ;
  }
  