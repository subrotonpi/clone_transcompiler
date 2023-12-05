public static void main ( String input , int n , int c , int k ) {
  int [ ] t = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) t [ i ] = Integer . parseInt ( input ) ;
  Arrays . sort ( t ) ;
  int ans = 0 ;
  int i = 0 ;
  while ( i < n ) {
    int cnt = 0 ;
    int a = t [ i ] + k ;
    for ( int j = 0 ;
    j < c ;
    j ++ ) {
      if ( i + j < n ) {
        if ( t [ i + j ] <= a ) {
          cnt ++ ;
        }
        else {
          break ;
        }
      }
      else {
        break ;
      }
    }
    ans ++ ;
    i += cnt ;
  }
  System . out . println ( ans ) ;
}
