public static int solve ( int [ ] P ) {
  int [ ] sums = new int [ P . length ] ;
  for ( int i = 0 ;
  i < P . length ;
  i ++ ) {
    sums [ i ] = Integer . parseInt ( P [ i ] ) + sums [ P . length - i ] ;
  }
  int maxDif = 0 ;
  for ( int i = 0 ;
  i < sums . length ;
  i ++ ) {
    int p = sums [ i ] ;
    if ( i - p > maxDif ) {
      maxDif = i - p ;
    }
  }
  return maxDif ;
}
int T = input ( ) ;
for ( int t = 1 ;
t <= T ;
t ++ ) {
  final String S = input ( ) ;
  final int Stab = S . charAt ( 0 ) ;
  int s = solve ( Stab ) ;
  System . out . println ( "Case #" + t + ": " + s ) ;
}
