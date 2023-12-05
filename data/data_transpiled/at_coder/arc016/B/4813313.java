public static void print ( int n ) {
  char [ ] l = new char [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l [ i ] = input . charAt ( i ) ;
  }
  int sum = 0 ;
  for ( int i = 0 ;
  i < l . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < 9 ;
    j ++ ) {
      if ( l [ i ] [ j ] == 'x' ) {
        sum ++ ;
      }
      else if ( l [ i ] [ j ] == 'o' && ( i + 1 == l . length || l [ i + 1 ] [ j ] != 'o' ) ) {
        sum ++ ;
      }
    }
  }
  System . out . println ( sum ) ;
}
