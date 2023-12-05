public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] h = new int [ 21 ] ;
  for ( int i = 0 ;
  i < h . length ;
  i ++ ) {
    h [ i ] = new int [ 21 ] ;
    for ( int j = 0 ;
    j < h [ i ] . length ;
    j ++ ) {
      h [ i ] [ j ] = i ;
    }
  }
  int [ ] salary = new int [ N + 1 ] ;
  for ( int i = N ;
  i > 0 ;
  i -- ) {
    if ( h [ i ] == new int [ ] {
    }
    ) {
      salary [ i ] = 1 ;
    }
    else if ( h [ i ] . length == 1 ) {
      salary [ i ] = salary [ h [ i ] [ 0 ] ] * 2 + 1 ;
    }
    else {
      int max = 0 ;
      int min = Integer . MAX_VALUE ;
      for ( int j = 0 ;
      j < h [ i ] . length ;
      j ++ ) {
        if ( max < salary [ h [ i ] [ j ] ] ) max = salary [ h [ i ] [ j ] ] ;
        if ( min > salary [ h [ i ] [ j ] ] ) min = salary [ h [ i ] [ j ] ] ;
      }
      salary [ i ] = max + min + 1 ;
    }
  }
  System . out . println ( salary [ 1 ] ) ;
}
