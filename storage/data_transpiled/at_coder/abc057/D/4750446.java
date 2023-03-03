static final double factorial ( int n , int a , int b ) {
  int n , a , b ;
  int [ ] v = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    v [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  System . out . println ( Arrays . toString ( v ) / a ) ;
  int prev = v [ 0 ] ;
  int cnt = 0 ;
  int [ ] rle = new int [ n ] ;
  for ( int i = 0 ;
  i < v . length ;
  i ++ ) {
    if ( v [ i ] != prev ) {
      rle [ cnt ] = i ;
      prev = v [ i ] ;
      cnt = 1 ;
    }
    else cnt ++ ;
  }
  rle [ cnt ] = cnt ;
  int [ ] cum = new int [ rle . length ] ;
  for ( int i = 0 ;
  i < rle . length ;
  i ++ ) cum [ i ] = rle [ i ] ;
  return cum [ 0 ] ;
}
