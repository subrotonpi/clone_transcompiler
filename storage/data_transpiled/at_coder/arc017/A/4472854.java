public static void ans ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int q = ( int ) ( N * 0.5 ) ;
  int f = 1 ;
  for ( int i = 2 ;
  i <= q ;
  i ++ ) {
    if ( ( N % i ) == 0 ) {
      f = 0 ;
      break ;
    }
  }
  ans ( ) ;
}
