public static void input ( Scanner scanner ) {
  int LEN = scanner . nextInt ( ) ;
  int [ ] PC = new int [ LEN ] ;
  int [ ] MC = new int [ LEN ] ;
  for ( int i = 0 ;
  i < LEN ;
  i ++ ) {
    switch ( scanner . nextInt ( ) ) {
      case '+' : PC [ i ] ++ ;
      break ;
      case '-' : MC [ i ] ++ ;
      break ;
    }
  }
  int [ ] SUMPC = new int [ LEN ] ;
  for ( int i = LEN - 1 ;
  i >= 0 ;
  i -- ) {
    SUMPC [ i ] = SUMPC [ SUMPC . length - 1 ] + PC [ i ] ;
  }
  int [ ] SUMMC = new int [ LEN ] ;
  for ( int i = LEN - 1 ;
  i >= 0 ;
  i -- ) {
    SUMMC [ i ] = SUMMC [ SUMMC . length - 1 ] + MC [ i ] ;
  }
  SUMPC = SUMPC [ 1 ] ;
  SUMMC = SUMMC [ 1 ] ;
  int [ ] MSC = new int [ LEN ] ;
  for ( int i = 0 ;
  i < LEN ;
  i ++ ) {
    if ( scanner . nextInt ( ) == 'M' ) {
      MSC [ i ] = SUMPC [ i ] - SUMMC [ i ] ;
    }
  }
  int LENSC = MSC . length ;
  Arrays . sort ( MSC ) ;
  int ANS = 0 ;
  for ( int i = 0 ;
  i < LENSC / 2 ;
  i ++ ) {
    ANS += - MSC [ i ] ;
  }
  for ( int j = i + 1 ;
  j < LENSC ;
  j ++ ) {
    ANS += MSC [ j ] ;
  }
  System . out . println ( ANS ) ;
}
