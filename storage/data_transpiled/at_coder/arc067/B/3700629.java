public static int N ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] X = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) X [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  X [ 0 ] = 0 ;
  int ans = 0 ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) ans += Math . min ( A * ( X [ i ] - X [ i - 1 ] ) , B ) ;
  System . out . println ( ans ) ;
  return ans ;
}
