@ SafeVarargs public static void binarySearch ( String ... input ) {
  int a , b , q ;
  int [ ] a1 = new int [ a ] ;
  int [ ] b1 = new int [ b ] ;
  for ( int i = 0 ;
  i < a ;
  i ++ ) {
    a1 [ i ] = Integer . parseInt ( input [ i ] ) ;
    b1 [ i ] = Integer . parseInt ( input [ i ] ) ;
  }
  int len = input . length ;
  int mama = Math . max ( a1 [ len - 1 ] , b1 [ len - 1 ] ) ;
  int mami = Math . min ( a1 [ len - 1 ] , b1 [ len - 1 ] ) ;
  int mimi = Math . min ( a1 [ 0 ] , b1 [ 0 ] ) ;
  int mima = Math . max ( a1 [ 0 ] , b1 [ 0 ] ) ;
  a1 = Arrays . copyOf ( a1 , len + 20 ) ;
  b1 = Arrays . copyOf ( b1 , len + 20 ) ;
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    if ( i >= mama ) {
      System . out . println ( i - mami ) ;
    }
    else if ( i <= mimi ) {
      System . out . println ( mima - i ) ;
    }
    else {
      int x = bisect_left ( a1 , i ) ;
      int y = bisect_left ( b1 , i ) ;
      int low = i - Math . min ( a1 [ x - 1 ] , b1 [ y - 1 ] ) ;
      int high = Math . max ( a1 [ x ] , b1 [ y ] ) - i ;
      int turn1 = Math . min ( a1 [ x ] - i , i - b1 [ y - 1 ] ) + Math . abs ( a1 [ x ] - b1 [ y - 1 ] ) ;
      int turn2 = Math . min ( b1 [ y ] - i , i - a1 [ x - 1 ] ) + Math . abs ( b1 [ y ] - a1 [ x - 1 ] ) ;
      System . out . println ( min ( low , high , turn1 , turn2 ) ) ;
    }
  }
}
