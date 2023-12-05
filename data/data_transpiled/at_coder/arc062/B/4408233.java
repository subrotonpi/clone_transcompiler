public static int input ( ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    char x = s . charAt ( i ) ;
    if ( i % 2 == 0 && x == 'p' ) ans -- ;
    else if ( i % 2 == 1 && x == 'g' ) ans ++ ;
  }
  return ans ;
}
