public static int n ( int x , int n ) {
  int a [ ] = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = i ;
  }
  Arrays . sort ( a ) ;
  Arrays . reverse ( a ) ;
  int ans = 0 ;
  while ( x > 0 ) {
    if ( x == 0 ) {
      break ;
    }
    else if ( a . length == 0 ) {
      ans -- ;
      break ;
    }
  }
  return ans ;
}
