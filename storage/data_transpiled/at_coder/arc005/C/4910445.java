@ VisibleForTesting static String heapToString ( ) {
  int H = Integer . parseInt ( input . readLine ( ) ) ;
  int W = Integer . parseInt ( input . readLine ( ) ) ;
  char [ ] c = new char [ H ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    c [ i ] = input . charAt ( i ) ;
  }
  Map < Pair < Integer , Integer > , Integer > dp = Maps . newHashMap ( ) ;
  StringBuilder sb = new StringBuilder ( ) ;
  heapToString ( sb , ( i , j ) -> {
    if ( dp . containsKey ( new Pair < > ( i , j ) ) ) {
      continue ;
    }
    dp . put ( new Pair < > ( i , j ) , k ) ;
  }
  ) ;
  for ( int y = 0 ;
  y < H ;
  y ++ ) {
    int x = sb . charAt ( y ) ;
    if ( c [ y ] == 'g' ) {
      x ++ ;
    }
  }
  return sb . toString ( ) ;
}
