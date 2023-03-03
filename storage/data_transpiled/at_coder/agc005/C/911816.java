public static void input ( ) {
  int [ ] a = list ( Integer . parseInt ( input ( ) ) ) ;
  /* Resolve the number of integers */
  if ( a . length == 1 ) {
    return ;
  }
  if ( a . length >= 2 ) {
    return ;
  }
  int maxNum = max ( a ) ;
  int minNum = min ( a ) ;
  if ( a . length < maxNum ) {
    return ;
  }
  if ( maxNum / 2 > minNum ) {
    return ;
  }
  if ( maxNum & 1 ) {
    for ( int i = maxNum / 2 + 1 ;
    i < maxNum ;
    i ++ ) {
      if ( ! a [ i ] ) {
        return ;
      }
      if ( a [ i ] > minNum ) {
        return ;
      }
    }
  }
  else {
    for ( int i = maxNum / 2 ;
    i < maxNum ;
    i ++ ) {
      if ( ! a [ i ] ) {
        return ;
      }
      if ( a [ i ] > minNum ) {
        return ;
      }
    }
  }
  System . out . println ( "Possible" ? "Impossible" : "" ) ;
}
