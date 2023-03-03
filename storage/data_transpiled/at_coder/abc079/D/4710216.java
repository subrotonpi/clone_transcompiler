public static void main ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  int [ ] [ ] cost = new int [ 10 ] [ 10 ] ;
  for ( int i = 0 ;
  i < cost . length ;
  i ++ ) {
    cost [ i ] [ 0 ] = Math . min ( cost [ i ] [ 0 ] , cost [ i ] [ 1 ] + cost [ i ] [ 0 ] ) ;
  }
  for ( int i = 0 ;
  i < cost . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < cost [ i ] [ 0 ] ;
    j ++ ) {
      cost [ i ] [ j ] = Math . min ( cost [ i ] [ j ] , cost [ i ] [ 1 ] ) ;
    }
  }
  int sumCost = 0 ;
  for ( int i = 0 ;
  i < cost . length ;
  i ++ ) {
    int [ ] num = Integer . parseInt ( input ) ;
    for ( int n : num ) {
      if ( n != - 1 ) {
        sumCost += cost [ n ] [ 1 ] ;
      }
    }
  }
  System . out . println ( sumCost ) ;
}
