public static void input ( ) {
  int N = S . length ( ) ;
  int num_zero = 0 ;
  for ( char c : S ) {
    if ( c == '0' ) {
      num_zero ++ ;
    }
  }
  System . out . println ( min ( num_zero , N - num_zero ) * 2 ) ;
}
