public static char [ ] input ( ) {
  char sa [ ] = input ( ) ;
  char sb [ ] = input ( ) ;
  char sc [ ] = input ( ) ;
  int aIdx = 0 ;
  int bIdx = 0 ;
  int cIdx = 0 ;
  char next_ = 'a' ;
  do {
    switch ( next_ ) {
      case 'a' : if ( aIdx >= sa . length ) {
        System . out . println ( "A" ) ;
        break ;
      }
      next_ = sa [ aIdx ++ ] ;
      break ;
      case 'b' : if ( bIdx >= sb . length ) {
        System . out . println ( "B" ) ;
        break ;
      }
      next_ = sb [ bIdx ++ ] ;
      break ;
      case 'c' : if ( cIdx >= sc . length ) {
        System . out . println ( "C" ) ;
        break ;
      }
      next_ = sc [ cIdx ++ ] ;
      break ;
    }
  }
  while ( true ) ;
  return sa ;
}
