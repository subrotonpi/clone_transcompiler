static final int div = 10 * 9 + 7 ;
int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
int M = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
int [ ] f = new int [ N ] ;
for ( int n = 0 ;
n < N ;
n ++ ) {
  f [ n ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
}
int [ ] dp = new int [ N + 1 ] ;
dp [ 0 ] = 1 ;
int begin = 0 ;
int s = 0 ;
Set < String > tasteSet = new HashSet < String > ( ) ;
for ( int n = 1 ;
n <= N ;
n ++ ) {
  s += dp [ n - 1 ] ;
  if ( tasteSet . contains ( f [ n - 1 ] ) ) {
    int idx = f . indexOf ( f [ n - 1 ] , begin , n - 1 ) ;
    tasteSet . removeAll ( Arrays . asList ( f [ begin ] , f [ idx ] ) ) ;
    s -= Integer . sum ( dp [ begin ] ) ;
    begin = idx + 1 ;
  }
  tasteSet . add ( f [ n - 1 ] ) ;
  s %= div ;
  dp [ n ] = s ;
}
System . out . println ( dp [ N ] % div ) ;
return N ;
}
