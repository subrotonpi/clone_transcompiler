public static void print ( int n ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  int counter = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int b = a [ i ] ;
    do {
      if ( b % 2 == 1 ) break ;
      b = ( int ) ( b / 2 ) ;
      counter ++ ;
    }
    while ( b > 0 ) ;
  }
  System . out . println ( counter ) ;
}
