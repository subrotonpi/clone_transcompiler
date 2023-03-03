public static void print ( int n ) {
  int [ ] red = new int [ n ] ;
  int [ ] blue = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    red [ i ] = x + y * 1000 ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    blue [ i ] = x * 1000 + y ;
  }
  Arrays . sort ( red ) ;
  Arrays . sort ( blue ) ;
  int ans = 0 ;
  int len = red . length ;
  for ( int b : blue ) {
    boolean flag = true ;
    for ( int r : red ) {
      if ( ( r % 1000 < b / 1000 ) && ( r / 1000 < b % 1000 ) && flag ) {
        flag = false ;
        red [ red . indexOf ( r ) ] = 9999999999 ;
        ans ++ ;
      }
    }
  }
  System . out . println ( ans ) ;
}
