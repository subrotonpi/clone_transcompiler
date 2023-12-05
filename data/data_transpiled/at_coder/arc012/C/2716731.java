public static int L = 19 ;
String [ ] S = new String [ L ] ;
for ( int i = 0 ;
i < L ;
i ++ ) S [ i ] = input . next ( ) ;
int O = Integer . parseInt ( S [ i ] ) ;
int X = Integer . parseInt ( S [ i ] ) ;
if ( ! X <= O && O <= X + 1 ) {
  System . out . println ( "NO" ) ;
  exit ( 0 ) ;
}
final int M = 5 ;
{
  for ( int i = 0 ;
  i < L - M + 1 ;
  i ++ ) for ( int j = 0 ;
  j < L ;
  j ++ ) {
    int cnt = 0 ;
    for ( int k = 0 ;
    k < M ;
    k ++ ) cnt += ( ( i + k != c || j != r ) && S [ i + k ] . charAt ( j ) == 'o' ) ;
    if ( cnt == M ) return 1 ;
  }
}
{
  for ( int i = 0 ;
  i < L ;
  i ++ ) for ( int j = 0 ;
  j < L - M + 1 ;
  j ++ ) {
    int cnt = 0 ;
    for ( int k = 0 ;
    k < M ;
    k ++ ) cnt += ( ( i + k != c || j + k != r ) && S [ i + k ] . charAt ( j + k ) == 'o' ) ;
    if ( cnt == M ) return 1 ;
  }
}
{
  for ( int i = 0 ;
  i < L - M + 1 ;
  i ++ ) for ( int j = 0 ;
  j < L - M + 1 ;
  j ++ ) {
    int cnt = 0 ;
    for ( int k = 0 ;
    k < M ;
    k ++ ) cnt += ( ( i + k != c || j + k != r ) && S [ i + k ] . charAt ( j + k ) == 'o' ) ;
    if ( cnt == M ) return 1 ;
    cnt = 0 ;
    for ( int k = 0 ;
    k < M ;
    k ++ ) cnt += ( ( i + M - 1 - k != c || j + k != r ) && S [ i + M - 1 - k ] . charAt ( j + k ) == 'x' ) ;
    if ( cnt == M ) return 1 ;
  }
}
{
  for ( int i = 0 ;
  i < L ;
  i ++ ) for ( int j = 0 ;
  j < L ;
  j ++ ) if ( O ==