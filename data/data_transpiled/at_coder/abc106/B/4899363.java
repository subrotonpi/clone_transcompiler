public static int N = Integer . parseInt ( input ) {
  int [ ] count = new int [ 201 ] ;
  count [ 105 ] = 1 ;
  for ( int i = 105 ;
  i < 201 ;
  i ++ ) {
    if ( i % 2 == 1 ) {
      int num = 0 ;
      for ( int n = 1 ;
      n <= i ;
      n ++ ) {
        if ( i % n == 0 ) num ++ ;
      }
      if ( num == 8 ) {
        count [ i ] = count [ i - 1 ] + 1 ;
      }
      else {
        count [ i ] = count [ i - 1 ] ;
      }
    }
    else {
      count [ i ] = count [ i - 1 ] ;
    }
  }
  System . out . println ( count [ N ] ) ;
  return count [ N ] ;
}
