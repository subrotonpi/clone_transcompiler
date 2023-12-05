public static int [ ] A ( ) {
  int x = 0 ;
  for ( int i = input . length ( ) - 1 ;
  i >= 0 ;
  i -- ) {
    if ( input . charAt ( i ) == 'M' ) A [ i ] ++ ;
    else x += ( i - 1 ) ;
  }
  return A ;
}
