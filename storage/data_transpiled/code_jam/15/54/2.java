static String solve ( int n , int [ ] sums , int [ ] freqs ) throws IOException {
  final int [ ] s = new int [ sums . length ] ;
  int i ;
  int m ;
  int i ;
  int i ;
  int m = 0 ;
  s [ i ] = n ;
  while ( sums . length > 1 || freqs [ 0 ] > 1 ) {
    if ( freqs [ 0 ] > 1 ) {
      m = 0 ;
    }
    else {
      m = sums [ 1 ] ;
    }
    s [ i ] = m ;
    int [ ] newSums = new int [ s . length ] ;
    int [ ] newFreps = new int [ s . length ] ;
    while ( sums . length > 0 ) {
      n = sums [ 0 ] ;
      freqs [ 0 ] -- ;
      if ( freqs [ 0 ] == 0 ) {
        sums [ 0 ] = 0 ;
        freqs [ 0 ] = 0 ;
      }
      i = sums . indexOf ( n + m ) ;
      freqs [ i ] -- ;
      if ( freqs [ i ] == 0 ) {
        sums [ i ] = 0 ;
        freqs [ i ] = 0 ;
      }
      if ( newSums [ i ] >= 0 ) {
        i = newSums [ i ] ;
        newFreps [ i ] ++ ;
      }
      else {
        newSums [ i ] = n ;
        newFreps [ i ] ++ ;
      }
    }
    sums = newSums ;
    freqs = newFreps ;
  }
  String string = "" ;
  for ( i = 0 ;
  i < s . length ;
  i ++ ) {
    string += s [ i ] ;
    string += " " ;
  }
  return string . substring ( 0 , string . length ( ) - 1 ) ;
}
