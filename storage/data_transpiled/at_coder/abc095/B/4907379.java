static int N ( ) {
  int X = Integer . parseInt ( input . nextLine ( ) ) , N = X ;
  int [ ] m = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) m [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  X -= sum ( m ) ;
  int ans = ( X / min ( m ) ) + N ;
  System . out . println ( ans ) ;
  return ans ;
}
