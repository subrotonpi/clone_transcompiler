static void print ( int n , int k ) {
  int [ ] a = ( int [ ] ) input . split ( " " ) ;
  int sub = Integer . MIN_VALUE ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    sub += a [ i + k ] - a [ i ] ;
    res += sub ;
  }
  System . out . println ( res ) ;
}
