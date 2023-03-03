public static void input ( ) {
  n = Integer . parseInt ( input . readLine ( ) ) ;
  m = new int [ n ] ;
  for ( int i = 0 ;
  i < m . length ;
  i ++ ) {
    m [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int a = 0 ;
  for ( int i = 0 ;
  i < m . length ;
  i ++ ) {
    int y = 0 ;
    for ( int j = 0 ;
    j < m . length ;
    j ++ ) {
      if ( m [ i ] % j == 0 ) {
        y ++ ;
      }
    }
    a += ( y + 1 ) / 2 / y ;
  }
  System . out . println ( a ) ;
}
