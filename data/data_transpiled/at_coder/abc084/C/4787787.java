public static int [ ] [ ] getDigits ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] l = new int [ n ] [ n - 1 ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    l [ i ] = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      l [ i ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
  }
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    int [ ] [ ] l_ = l [ j ] ;
    int c = 0 ;
    for ( int i = 0 ;
    i < n - 1 - j ;
    i ++ ) {
      if ( c <= l_ [ i ] [ 1 ] ) {
        c = l_ [ i ] [ 1 ] ;
      }
      else if ( ( c % l_ [ i ] [ 2 ] != 0 ) && ( c % l_ [ i ] [ 2 ] != 0 ) ) {
        c = ( c / l_ [ i ] [ 2 ] + 1 ) * l_ [ i ] [ 2 ] ;
      }
      else {
        c = ( c / l_ [ i ] [ 2 ] ) * l_ [ i ] [ 2 ] ;
      }
      c += l_ [ i ] [ 0 ] ;
    }
    System . out . println ( c ) ;
  }
  return l ;
}
