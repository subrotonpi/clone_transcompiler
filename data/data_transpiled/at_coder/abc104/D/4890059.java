public static int [ ] [ ] input ( ) {
  String s = input . nextLine ( ) ;
  int [ ] [ ] d = new int [ 4 ] [ s . length ( ) + 1 ] ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    d [ 3 ] [ i ] = 0 ;
  }
  d [ 3 ] [ d . length - 1 ] ++ ;
  String e = "ABC" ;
  for ( int i = s . length ( ) - 1 ;
  i >= 0 ;
  i -- ) {
    for ( int j = 3 ;
    j >= 0 ;
    j -- ) {
      if ( j == 3 ) {
        if ( s . charAt ( i ) == '?' ) {
          d [ 3 ] [ i ] = ( d [ 3 ] [ i ] + d [ j + 1 ] [ i ] ) ;
        }
      }
    }
  }
  return d ;
}
