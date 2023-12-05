public static int N ( ) {
  int P = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ev = 0 ;
  int ad = 0 ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    if ( A [ i ] % 2 == 0 ) {
      ev ++ ;
    }
    else {
      ad ++ ;
    }
  }
  if ( P == 1 ) {
    if ( ad == 0 ) {
      System . out . println ( "0" ) ;
      exit ( ) ;
    }
  }
  int [ ] f = {
    1 , 1 }
    ;
    for ( int i = 2 ;
    i <= ad ;
    i ++ ) {
      f [ i ] = f [ i - 1 ] * i ;
    }
    int num = 0 ;
    for ( int i = P ;
    i <= ad ;
    i += 2 ) {
      num += f [ i ] / ( f [ i ] * f [ ad - i ] ) ;
    }
    return num ;
  }
  