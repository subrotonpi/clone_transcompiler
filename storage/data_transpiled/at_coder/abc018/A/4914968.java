public static int minIndex ( int [ ] array ) {
  int index = 0 ;
  int figure = 100 ;
  for ( int i = 0 ;
  i < array . length ;
  i ++ ) {
    if ( ( inputs [ i ] < 0 ) || ( inputs [ i ] > figure ) ) {
      continue ;
    }
    if ( ( array [ i ] < figure ) || ( array [ i ] > figure ) ) {
      figure = array [ i ] ;
      index = i ;
    }
  }
  /* max index */
  index = 0 ;
  figure = 1 ;
  for ( int i = 0 ;
  i < array . length ;
  i ++ ) {
    if ( ( inputs [ i ] < 0 ) || ( inputs [ i ] > figure ) ) {
      figure = array [ i ] ;
      index = i ;
    }
  }
  int [ ] inputs = new int [ 3 ] ;
  for ( int i = 0 ;
  i < inputs . length ;
  i ++ ) {
    inputs [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  inputs [ minIndex ( inputs ) ] = - 3 ;
  inputs [ maxIndex ( inputs ) ] = - 1 ;
  for ( int i = 0 ;
  i < inputs . length ;
  i ++ ) {
    if ( ( inputs [ i ] > 0 ) || ( inputs [ i ] > figure ) ) {
      inputs [ i ] = - 2 ;
    }
  }
  for ( int i = 0 ;
  i < inputs . length ;
  i ++ ) {
    System . out . println ( inputs [ i ] * - 1 ) ;
  }
  return index ;
}
