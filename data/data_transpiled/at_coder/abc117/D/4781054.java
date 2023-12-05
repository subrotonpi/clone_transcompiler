public static int input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) , K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int x = 0 ;
  int b = 1 << 50 ;
  for ( ;
  ;
  ;
  ) {
    b = b >> 1 ;
    if ( x + b > K ) {
      continue ;
    }
  }
}
