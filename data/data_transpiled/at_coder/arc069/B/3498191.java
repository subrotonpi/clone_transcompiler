public static int N = Integer . parseInt ( input ) {
  String s = input . nextLine ( ) ;
  int [ ] S = s . charAt ( 0 ) == 'o' ? 1 : - 1 ;
  int [ ] [ ] X = new int [ N ] [ 4 ] ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    X [ i ] [ 0 ] = 1 ;
    X [ i ] [ 1 ] = 1 ;
    X [ i ] [ 1 ] = - 1 ;
    X [ i ] [ 2 ] = - 1 ;
    X [ i ] [ 3 ] = 1 ;
    X [ i ] [ 3 ] = - 1 ;
  }
  for ( int k = 0 ;
  k < 4 ;
  k ++ ) {
    for ( int i = 2 ;
    i < N ;
    i ++ ) {
      if ( S [ i - 1 ] * X [ k ] [ i - 1 ] == 1 ) {
        X [ k ] [ i ] = X [ k ] [ i - 2 ] ;
      }
      else {
        X [ k ] [ i ] = - X [ k ] [ i - 2 ] ;
      }
    }
    int flag = 0 ;
    for ( int i = 0 ;
    i < 2 ;
    i ++ ) {
      if ( S [ i - 1 ] * X [ k ] [ i - 1 ] == 1 ) {
        if ( X [ k ] [ i ] != X [ k ] [ i - 2 ] ) {
          flag = 1 ;
        }
      }
      else {
        if ( X [ k ] [ i ] != - X [ k ] [ i - 2 ] ) {
          flag = 1 ;
        }
      }
    }
    if ( flag == 0 ) {
      String T = "" ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        if ( X [ k ] [ i ] == 1 ) {
          T = T + "S" ;
        }
        else {
          T = T + "W" ;
        }
      }
      System . out . println ( T ) ;
      exit ( ) ;
    }
  }
  System . out . println ( - 1 ) ;
  return 0 ;
}
