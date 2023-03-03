public static int input ( ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( i % 2 == 0 && S . charAt ( i ) == 'p' ) {
      ans -- ;
    }
    else if ( i % 2 == 1 && S . charAt ( i ) == 'g' ) {
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
