public static int L = Integer . parseInt ( input ) {
  int [ ] X = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) X [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] temp = new int [ X . length ] ;
  temp = L - X [ 1 ] ;
  int ans = temp ;
  int itr1 = 0 ;
  int itr2 = N ;
  int a = N % 2 ;
  for ( int i = - ( N - 1 ) ;
  i < N ;
  i ++ ) {
    if ( ( i + a ) % 2 == 1 ) itr1 ++ ;
    else itr2 -- ;
    int minus ;
    if ( X [ i ] - X [ i - itr1 ] >= 0 ) minus = X [ i ] - X [ i - itr1 ] ;
    else minus = L + ( X [ i ] - X [ i - itr1 ] ) ;
    int plus ;
    if ( X [ i + itr2 ] - X [ i ] >= 0 ) plus = X [ i + itr2 ] - X [ i ] ;
    else plus = L + ( X [ i + itr2 ] - X [ i ] ) ;
    temp = temp - minus + plus ;
    ans = Math . max ( ans , temp ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
