public static void print ( int n ) {
  char [ ] c = input . toCharArray ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( c [ i ] == 'A' ) ans += 4 ;
    else if ( c [ i ] == 'B' ) ans += 3 ;
    else if ( c [ i ] == 'C' ) ans += 2 ;
    else if ( c [ i ] == 'D' ) ans += 1 ;
  }
  System . out . println ( ans / n ) ;
}
