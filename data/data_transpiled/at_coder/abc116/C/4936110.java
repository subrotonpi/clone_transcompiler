static final int [ ] ii2ss ( int n ) {
  return new int [ n ] ;
}
{
  int [ ] sp2nn = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    sp2nn [ i ] = System . in . readInt ( ) ;
  }
  int [ ] ss2nn = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ss2nn [ i ] = Integer . parseInt ( sp2nn [ i ] ) ;
  }
  int [ ] hh = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    hh [ i ] = ss2nn [ i ] ;
  }
  int [ ] total = new int [ n ] ;
  int n = 1 ;
  do {
    c = count ( hh , n ) ;
    if ( c == 0 ) {
      break ;
    }
    total [ n ] = c ;
    n ++ ;
  }
  while ( n > 0 ) ;
  System . out . println ( total ) ;
}
