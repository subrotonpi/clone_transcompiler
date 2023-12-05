public static void main ( String input , int a , int b ) {
  int [ ] [ ] ar = new int [ 50 ] [ 100 ] ;
  for ( int i = 0 ;
  i < 50 ;
  i ++ ) {
    StringBuilder l = new StringBuilder ( ) ;
    for ( int j = 0 ;
    j < 100 ;
    j ++ ) {
      l . append ( "#" ) ;
    }
    ar [ i ] = l . toString ( ) ;
  }
  for ( int i = 0 ;
  i < 50 ;
  i ++ ) {
    StringBuilder l = new StringBuilder ( ) ;
    for ( int j = 0 ;
    j < 100 ;
    j ++ ) {
      l . append ( "." ) ;
    }
    ar [ i ] = l . toString ( ) ;
  }
  System . out . println ( 100 + " " + 100 ) ;
  int count = 0 ;
  for ( int i = 48 ;
  i >= 0 ;
  i -= 2 ) {
    if ( count == a - 1 ) break ;
    if ( i % 2 == 0 ) {
      for ( int j = 0 ;
      j < 100 ;
      j += 2 ) {
        ar [ i ] [ j ] = "." ;
        count ++ ;
        if ( count == a - 1 ) break ;
      }
    }
    else {
      for ( int j = 1 ;
      j < 100 ;
      j += 2 ) {
        ar [ i ] [ j ] = "." ;
        count ++ ;
        if ( count == a - 1 ) break ;
      }
    }
  }
  count = 0 ;
  for ( int i = 99 ;
  i >= 50 ;
  i -= 2 ) {
    if ( count == b - 1 ) break ;
    if ( i % 2 == 0 ) {
      for ( int j = 0 ;
      j < 100 ;
      j += 2 ) {
        ar [ i ] [ j ] = "#" ;
        count ++ ;
        if ( count == b - 1 ) break ;
      }
    }
    else {
      for ( int j = 1 ;
      j < 100 ;
      j += 2 ) {
        ar [ i ] [ j ] = "#" ;
        count ++ ;
        if ( count == b - 1 ) break ;
      }
    }
  }
  for ( int r : ar ) {
    System . out . println ( Arrays . toString ( r ) ) ;
  }
}
