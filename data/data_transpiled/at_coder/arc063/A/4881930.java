public static int input ( ) {
  int block = 0 ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) {
    if ( i == 0 ) {
      block ++ ;
    }
    else if ( S . charAt ( i ) != S . charAt ( i - 1 ) ) {
      block ++ ;
    }
  }
  return ( block - 1 ) ;
}
