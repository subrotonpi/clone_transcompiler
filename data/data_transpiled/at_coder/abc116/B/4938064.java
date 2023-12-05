public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] li = new int [ 1000000 ] ;
  Arrays . fill ( li , n ) ;
  int x = 0 ;
  int i = 0 ;
  while ( i <= 1000000 && x == 0 ) {
    if ( li [ i ] % 2 == 0 ) {
      li [ i ] = li [ i ] / 2 ;
      for ( int j = 0 ;
      j < i ;
      j ++ ) {
        if ( li [ i + 1 ] == li [ j ] ) {
          x = i + 2 ;
        }
        else {
        }
        i ++ ;
      }
    }
    else {
      li [ i ] = 3 * li [ i ] + 1 ;
      for ( int j = 0 ;
      j < i ;
      j ++ ) {
        if ( li [ i + 1 ] == li [ j ] ) {
          x = i + 2 ;
        }
        else {
        }
        i ++ ;
      }
    }
  }
  System . out . println ( x ) ;
}
