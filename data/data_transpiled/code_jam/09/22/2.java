public static String next ( String s ) throws Exception {
  StringBuilder sb = new StringBuilder ( s ) ;
  int l = sb . length ( ) ;
  int i = 0 ;
  int j = 0 ;
  for ( int k = 0 ;
  k < l - 1 ;
  k ++ ) {
    if ( sb . charAt ( k ) < sb . charAt ( k + 1 ) ) {
      i = k ;
    }
  }
  if ( i == 0 ) {
    sb = new StringBuilder ( s ) ;
    j = 0 ;
    while ( sb . charAt ( j ) == '0' ) {
      j ++ ;
    }
    char c = sb . charAt ( j ) ;
    sb . deleteCharAt ( j ) ;
    sb . insert ( 0 , c ) ;
    sb . insert ( 1 , '0' ) ;
    sb . delete ( 0 , sb . length ( ) ) ;
    return sb . toString ( ) ;
  }
  for ( int k = i ;
  k < l ;
  k ++ ) {
    sb . delete ( 0 , k ) ;
  }
  return s ;
}
