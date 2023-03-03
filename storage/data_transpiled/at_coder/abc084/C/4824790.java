public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] [ ] lis = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) lis [ i ] = new int [ n ] ;
  for ( int i = 0 ;
  i < lis [ i ] . length ;
  i ++ ) lis [ i ] [ 0 ] = Integer . parseInt ( input ) ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    int now = 0 ;
    for ( int i = j ;
    i < n - 1 ;
    i ++ ) {
      if ( now < lis [ i ] [ 1 ] ) now += lis [ i ] [ 1 ] - now + lis [ i ] [ 0 ] ;
      else {
        if ( now % lis [ i ] [ 2 ] == 0 ) now += lis [ i ] [ 0 ] ;
        else now += lis [ i ] [ 2 ] - ( now % lis [ i ] [ 2 ] ) + lis [ i ] [ 0 ] ;
      }
    }
  }
  System . out . println ( now ) ;
}
