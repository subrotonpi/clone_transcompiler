public static int MOD = 10 * 9 + 7 ;
int N = Integer . parseInt ( input ) ;
int M = Integer . parseInt ( input ) ;
int [ ] [ ] S = new int [ N + 1 ] [ N + 1 ] ;
int [ ] [ ] T = new int [ N + 1 ] [ N + 1 ] ;
int [ ] [ ] C = new int [ N + 1 ] [ N + 1 ] ;
for ( int i = 0 ;
i < M ;
i ++ ) {
  int l = Integer . parseInt ( input ) ;
  int r = Integer . parseInt ( input ) ;
  int x = Integer . parseInt ( input ) ;
  if ( r - l < x - 1 ) {
    System . out . println ( 0 ) ;
    exit ( 0 ) ;
  }
  S [ x - 1 ] [ r ] = Math . min ( S [ x - 1 ] [ r ] , l ) ;
  T [ x - 1 ] [ r ] = Math . max ( T [ x - 1 ] [ r ] , l ) ;
  C [ r ] = 1 ;
}
int [ ] S0 = S [ 0 ] ;
int [ ] S1 = S1 [ 0 ] ;
int [ ] S2 = S2 [ 0 ] ;
int [ ] T0 = T [ 0 ] ;
int [ ] T1 = T [ 1 ] ;
int [ ] T2 = T [ 1 ] ;
boolean ok = true ;
for ( int i = 0 ;
i < N + 1 ;
i ++ ) {
  if ( ! T2 [ i ] < S1 [ i ] || ! T1 [ i ] < S0 [ i ] ) {
    ok = false ;
    break ;
  }
}
if ( ! ok ) {
  System . out . println ( 0 ) ;
  exit ( 0 ) ;
}
int [ ] RM = new int [ N + 1 ] ;
int [ ] GM = new int [ N + 1 ] ;
for ( int i = N - 1 ;
i >= 0 ;
i -- ) {
  RM [ i ] = Math . min ( RM [ i + 1 ] , S1 [ i + 1 ] ) ;
  GM [ i ] = Math . min ( GM [ i + 1 ] , S0 [ i + 1 ] ) ;
}
X = new int [ N + 1 ] ;
D [ 0 ] = 6 ;
B = new int [ N + 1 ] [ N + 1 ] ;
B [ 0 ] [ 0 ] = 3 ;
bb = 0 ;
for ( int b = 1 ;
b < N ;
b