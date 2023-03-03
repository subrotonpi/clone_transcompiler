public static int t = Integer . parseInt ( scanner . nextLine ( ) ) {
  int t = Integer . parseInt ( scanner . nextLine ( ) ) ;
  {
    int [ ] left = new int [ l . length ] ;
    for ( int i = 1 ;
    i < l . length ;
    i ++ ) {
      left [ i ] = l [ i ] ;
    }
    int [ ] right = new int [ l . length ] ;
    for ( int i = 1 ;
    i < l . length ;
    i ++ ) {
      right [ i ] = l [ i ] ;
    }
  }
  class Tree {
    int [ ] arr ;
    int value ;
    int [ ] left , right ;
    int [ ] right ;
    {
      left = arr [ 0 ] ;
      right = arr [ 0 ] ;
      if ( arr . length > 1 ) left [ 0 ] = new int [ arr . length - 1 ] ;
      right = new int [ arr . length - 1 ] ;
      for ( int i = 1 ;
      i < arr . length ;
      i ++ ) right [ 0 ] = arr [ i ] ;
    }
  }
  int a ;
  int b ;
  int [ ] m1 ;
  int i ;
  for ( i = 0 ;
  i < m . length ;
  i ++ ) {
    m1 = Arrays . binarySearch ( m , i ) ;
    a = a - 1 ;
    b = b - 1 ;
  }
  for ( i = 0 ;
  i < m1 . length ;
  i ++ ) {
    a = a + b ;
  }
  for ( i = 0 ;
  i < m . length ;
  i ++ ) {
    m = Arrays . binarySearch ( m , i ) ;
    m = Arrays . binarySearch ( m , i ) ;
    c = Arrays . binarySearch ( c , i ) ;
    c . reverse ( ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + minMoney ( m , new Tree ( c ) ) ) ;
  }
  return t ;
}
