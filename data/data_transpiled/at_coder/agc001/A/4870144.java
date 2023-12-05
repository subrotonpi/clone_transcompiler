public static int N = Integer . parseInt ( input ) {
  int [ ] Ls = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Ls [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( Ls ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < Ls . length ;
  i += 2 ) {
    ans += Math . min ( Ls [ i ] , Ls [ i + 1 ] ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
