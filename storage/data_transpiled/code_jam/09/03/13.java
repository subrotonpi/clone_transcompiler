static int countletter ( char [ ] S , char l , char L ) {
  int ret = 0 ;
  for ( int i = 0 ;
  ( S [ i ] == l ) || ( S [ i ] == L ) ;
  i ++ ) {
    if ( ( S [ i ] == l ) || ( S [ i ] == L ) ) {
      ret ++ ;
    }
  }
  return ret ;
}
