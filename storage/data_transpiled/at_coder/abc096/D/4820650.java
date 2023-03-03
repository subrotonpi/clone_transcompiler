{
  era = new int [ 55556 ] ;
  era [ 0 ] = era [ 1 ] = 0 ;
  for ( int i = 2 ;
  i <= ( int ) ( 55556 * 0.5 ) ;
  i ++ ) {
    if ( ( era [ i ] == 1 ) ) {
      for ( int j = i * 2 ;
      j < 55556 ;
      j += i ) era [ j ] = 0 ;
    }
  }
  v = new int [ 5 ] ;
  n = Integer . parseInt ( input ) ;
  for ( int i = 0 ;
  i < 55556 ;
  i ++ ) {
    if ( ( era [ i ] != 1 ) && ( i % 5 == 1 ) ) {
      System . out . print ( i + " " ) ;
      n -- ;
      if ( ( n == 0 ) ) break ;
    }
  }
  System . out . println ( ) ;
}
