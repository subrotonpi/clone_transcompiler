public static int n ( int x ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) a [ i ] = x ;
  Arrays . sort ( a ) ;
  int count = 0 ;
  for ( int ai : a ) {
    if ( x >= ai ) {
      x -= ai ;
      count ++ ;
    }
    else {
      x = 0 ;
    }
  }
  if ( x > 0 ) {
    count -- ;
  }
  return count ;
}
