public static int H = Integer . parseInt ( input ) {
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] box = new int [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    int [ ] a = new int [ input . nextInt ( ) ] ;
    for ( int j = 0 ;
    j < a . length ;
    j ++ ) {
      a [ j ] = input . nextInt ( ) ;
    }
    if ( Arrays . equals ( a , "." ) ) {
    }
    else {
      box [ i ] = a ;
    }
  }
  ArrayList < Integer > idx = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < box [ 0 ] . length ;
  i ++ ) {
    int ct = 0 ;
    for ( int j = 0 ;
    j < box . length ;
    j ++ ) {
      if ( box [ j ] [ i ] == '.' ) {
        ct ++ ;
      }
    }
    if ( ct == box . length ) {
      idx . add ( i ) ;
    }
  }
  for ( int i = 0 ;
  i < box . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < box [ i ] . length ;
    j ++ ) {
      if ( j < box [ i ] . length - 1 ) {
        if ( idx . contains ( j ) ) {
        }
        else {
          System . out . print ( box [ i ] [ j ] + " " ) ;
        }
      }
      else {
        if ( idx . contains ( j ) ) {
          System . out . println ( ) ;
        }
        else {
          System . out . println ( box [ i ] [ j ] ) ;
        }
      }
    }
  }
  return H ;
}
