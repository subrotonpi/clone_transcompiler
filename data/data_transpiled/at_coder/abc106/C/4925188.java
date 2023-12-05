{
  s = Arrays . stream ( input . split ( " " ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int count = 0 ;
  while ( s . length ( ) == 1 ) {
    s = s . substring ( 1 ) ;
    count ++ ;
    if ( s . length ( ) == 0 ) {
      break ;
    }
  }
  if ( k <= count ) {
    System . out . println ( 1 ) ;
  }
  else {
    System . out . println ( s . substring ( 0 , k ) ) ;
  }
}
