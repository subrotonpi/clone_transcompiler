public static int score ( @ Nonnull char [ ] [ ] board , @ Nonnull char [ ] [ ] B , @ Nonnull char [ ] [ ] C ) {
  int s = 0 ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) {
      if ( i < 2 && board [ i ] [ j ] == board [ i + 1 ] [ j ] ) s += B [ i ] [ j ] ;
      if ( j < 2 && board [ i ] [ j ] == board [ i ] [ j + 1 ] ) s += C [ i ] [ j ] ;
    }
  }
  return s ;
}
