public static void input ( int n , int k ) {
  int [ ] r = new int [ n ] ;
  for ( int i = 0 ;
  i < r . length ;
  i ++ ) r [ i ] = i ;
  Arrays . sort ( r ) ;
  int tRate = 0 ;
  for ( int i = r . length - k ;
  i < r . length ;
  i ++ ) {
    tRate = ( tRate + r [ i ] ) / 2 ;
  }
  System . out . println ( tRate ) ;
}
