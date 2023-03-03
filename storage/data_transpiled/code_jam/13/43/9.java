static final int cases = Integer . parseInt ( System . in ) ;
int N = 0 ;
int [ ] B = null ;
int [ ] A = null ;
int [ ] RR = null ;
/* copy the array */
for ( int i = 0 ;
i <= N ;
i ++ ) {
  A = new int [ N ] ;
  B = new int [ N ] ;
  A [ i ] = i ;
  RR = null ;
}
/* solve the array */
int [ ] sepA = new int [ N + 1 ] ;
int [ ] sepB = new int [ N + 1 ] ;
int mA = 1 ;
for ( int i = 0 ;
i <= N ;
i ++ ) {
  mA = Math . max ( mA , sepA [ i ] + 1 ) ;
  compA [ i ] = mA ;
}
int [ ] compB = new int [ N + 1 ] ;
for ( int i = 0 ;
i <= N ;
i ++ ) {
  B = new int [ N + 1 ] ;
  B [ i ] = i ;
}
for ( int i = 0 ;
i <= N ;
i ++ ) {
  A [ i ] = compA [ i ] ;
  B [ i ] = compB [ i ] ;
  RR [ i ] = n ;
  sepA [ i ] = compA [ i ] ;
  sepB [ i ] = compB [ i ] ;
}
for ( int i = 0 ;
i <= N ;
i ++ ) {
  if ( A [ i ] == compA [ i ] && B [ i ] == compB [ i ] ) {
    int pr = RR [ i ] ;
    int pa = sepA [ i ] ;
    int pb = sepB [ i ] ;
    RR [ i ] = n ;
    sepA [ i ] = compA [ i ] ;
    sepB [ i ] = compB [ i ] ;
    rr = copy ( RR ) ;
    if ( solve ( copy ( sepA ) , copy ( sepB ) , n + 1 ) ) return true ;
    for ( int j = 0 ;
    j <= N ;
    j ++ ) RR [ j ] = rr [ j ] ;
    RR [ i ] = pr ;
    sepA [ i ] = pa ;
    sepB [ i ] = pb ;
  }
}
for ( int i = 0 ;
i <= Integer . MAX_VALUE ;
i ++ ) {
  N = Integer . parseInt ( System . in . readLine ( ) ) ;
  A = new int [ N + 1 ] ;
  