public static int MOD = 10 * 9 + 7 ;
int N = Integer . parseInt ( input . nextLine ( ) ) ;
int M = Integer . parseInt ( input . nextLine ( ) ) ;
int [ ] F = new int [ N ] ;
int [ ] L = new int [ M + 1 ] ;
int [ ] P = new int [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  int f = Integer . parseInt ( input . nextLine ( ) ) ;
  F [ i ] = f ;
}
int l = 0 ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  int f = F [ i ] ;
  if ( L [ f ] == - 1 ) {
    P [ i ] = l ;
    L [ f ] = - 1 ;
  }
  else {
    L [ f ] = l ;
  }
}
DP = new int [ N + 2 ] ;
DP [ 0 ] = 1 ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  DP [ i + 2 ] = ( DP [ i + 1 ] + ( DP [ i + 1 ] - DP [ P [ i ] ] ) ) % MOD ;
}
return DP [ i ] ;
}
