public static void print ( int n ) {
  int [ ] lis = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) lis [ i ] = Integer . parseInt ( input ( ) ) ;
  int ans = 0 ;
  int key = 0 ;
  int cou = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( lis [ i + 1 ] == lis [ i ] ) {
      if ( key == 0 ) {
        key = 1 ;
        cou = 1 ;
        ans ++ ;
      }
    }
  }
  if ( cou == 1 ) cou = 0 ;
  else key = 0 ;
  System . out . println ( ans ) ;
}
