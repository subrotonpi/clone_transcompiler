public static String S = ( input ) {
  int k = 0 ;
  int j = 0 ;
  for ( char chr : S ) {
    if ( ( chr == 'A' ) || ( chr == 'C' ) || ( chr == 'G' ) || ( chr == 'T' ) ) {
      j = j + 1 ;
    }
    else {
      if ( k < j ) k = j ;
      j = 0 ;
    }
  }
  return k ;
}
