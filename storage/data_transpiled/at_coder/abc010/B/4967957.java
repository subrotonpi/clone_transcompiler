public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] Aa = new int [ n ] ;
  for ( int i = 0 ;
  i < Aa . length ;
  i ++ ) {
    do {
      if ( Aa [ i ] % 2 == 0 || Aa [ i ] % 3 == 2 ) {
        Aa [ i ] -- ;
        ans ++ ;
      }
      else break ;
    }
    while ( true ) ;
  }
  System . out . println ( ans ) ;
}
