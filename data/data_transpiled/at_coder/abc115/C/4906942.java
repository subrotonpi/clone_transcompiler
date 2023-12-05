public static void input ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) , K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] H = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    H [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 10 * 10 ;
  Arrays . sort ( H ) ;
  for ( int i = 0 ;
  i < N - K + 1 ;
  i ++ ) {
    ans = Math . min ( ans , H [ i + K - 1 ] - H [ i ] ) ;
  }
  System . out . println ( ans ) ;
}
