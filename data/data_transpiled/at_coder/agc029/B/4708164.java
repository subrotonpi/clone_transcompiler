public static void print ( int n ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  Arrays . sort ( a , Integer . reverse ) ;
  HashMap < Integer , Integer > map = new HashMap < > ( ) ;
  int count = 0 ;
  for ( int x : a ) {
    if ( ! map . containsKey ( x ) ) map . put ( x , 0 ) ;
    map . put ( x , 1 ) ;
  }
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    if ( map . get ( a [ i ] ) == 0 ) continue ;
    map . get ( a [ i ] ) -- ;
    int y = 2 * a [ i ] - a [ i ] ;
    if ( map . containsKey ( y ) && map . get ( y ) > 0 ) {
      count ++ ;
      map . get ( y ) -- ;
    }
  }
  System . out . println ( count ) ;
}
