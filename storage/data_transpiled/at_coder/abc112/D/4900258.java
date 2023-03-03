public static int input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) , M = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = 0 ;
  int m = 0 ;
  for ( int i = 0 ;
  i < 10 * 5 ;
  i ++ ) {
    if ( i * i < M && i <= ( i + 1 ) * i ) {
      m = i + 1 ;
      break ;
    }
  }
  if ( m > N ) {
    for ( int i = N ;
    i < m ;
    i ++ ) {
      if ( M % i == 0 ) {
        x = i ;
        break ;
      }
    }
  }
  return x ;
}
