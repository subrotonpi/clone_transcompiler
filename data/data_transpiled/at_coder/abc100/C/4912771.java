public static void lenList ( int lenList ) {
  int [ ] inputArray = new int [ lenList ] ;
  for ( int i = 0 ;
  i < lenList ;
  i ++ ) {
    inputArray [ i ] = Integer . parseInt ( input ) ;
  }
  int n = 0 ;
  for ( int x : inputArray ) {
    while ( ( x % 2 ) == 0 ) {
      x /= 2 ;
      n ++ ;
    }
  }
  System . out . println ( n ) ;
}
