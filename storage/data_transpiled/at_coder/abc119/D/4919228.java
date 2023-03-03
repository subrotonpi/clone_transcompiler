@ SafeVarargs public static void binarySearch ( String ... input ) {
  int a = Integer . parseInt ( input [ 0 ] ) ;
  int b = Integer . parseInt ( input [ 1 ] ) ;
  int q = Integer . parseInt ( input [ 2 ] ) ;
  int [ ] a1 = new int [ a ] ;
  int [ ] b1 = new int [ b ] ;
  for ( int i = 0 ;
  i < a ;
  i ++ ) {
    a1 [ i ] = Integer . parseInt ( input [ 2 ] ) ;
    b1 [ i ] = Integer . parseInt ( input [ 2 ] ) ;
  }
  int len = input . length ;
  a1 = Arrays . copyOf ( a1 , len ) ;
  b1 = Arrays . copyOf ( b1 , len ) ;
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    int x = bisect_left ( a1 , i ) ;
    int y = bisect_right ( b1 , i ) ;
    int low = i - Math . min ( a1 [ x - 1 ] , b1 [ y - 1 ] ) ;
    int high = Math . max ( a1 [ x ] , b1 [ y ] ) - i ;
    int turn1 = Math . min ( a1 [ x ] - i , i - b1 [ y - 1 ] ) + Math . abs ( a1 [ x ] - b1 [ y - 1 ] ) ;
    int turn2 = Math . min ( b1 [ y ] - i , i - a1 [ x - 1 ] ) + Math . abs ( b1 [ y ] - a1 [ x - 1 ] ) ;
    System . out . println ( min ( low , high , turn1 , turn2 ) ) ;
  }
}
