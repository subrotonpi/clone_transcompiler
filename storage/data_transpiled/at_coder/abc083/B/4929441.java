public static int N ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int sums = 0 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    int tmp = 0 ;
    int num = i ;
    while ( true ) {
      tmp += num % 10 ;
      num = ( int ) num / 10 ;
      if ( num == 0 ) break ;
    }
    if ( A <= tmp && tmp <= B ) sums += i ;
  }
  return sums ;
}
