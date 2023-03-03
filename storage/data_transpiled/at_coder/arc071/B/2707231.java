public static int mod = 10 * * 9 + 7 ;
/* Sum subarrays of A */
int N = A . size ( ) ;
int [ ] S = new int [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  S [ i ] = 0 ;
  for ( int a : A ) {
    S [ i ] = S [ i - 1 ] + a ;
    S [ i ] %= mod ;
  }
}
int M = Integer . parseInt ( input ( ) ) ;
int [ ] X = new int [ M ] ;
for ( int i = 0 ;
i < X . length ;
i ++ ) {
  X [ i ] = 0 ;
}
for ( int i = 0 ;
i < Y . length ;
i ++ ) {
  Y [ i ] = 0 ;
}
int diffX = X [ N ] - X [ i ] ;
int diffY = Y [ M ] - Y [ i ] ;
System . out . println ( sumSubarrays ( diffX ) * sumSubarrays ( diffY ) % mod ) ;
return M ;
}
