static final double EPS = 1e-7 ;
/* Works for the given input array of doubles */
final double [ ] X = new double [ N ] ;
final double [ ] Y = new double [ N ] ;
final double [ ] R = new double [ N ] ;
final double radius = 1e-7 ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  for ( int j = i + 1 ;
  j < N ;
  j ++ ) {
    final double d = ( X [ i ] - X [ j ] ) * ( Y [ i ] - Y [ j ] ) + ( Y [ i ] - Y [ j ] ) * ( Y [ i ] - Y [ j ] ) ;
    final double r = ( 2 * radius - R [ i ] - R [ j ] ) * ( 2 * radius - r [ i ] - r [ j ] ) ;
    if ( d < r + EPS ) {
      return true ;
    }
  }
}
/* main program */
final int T = Integer . parseInt ( readLine ( ) ) ;
for ( int t = 1 ;
t <= T ;
t ++ ) {
  System . out . println ( "Case #" + t + ":" ) ;
  final int N = Integer . parseInt ( readLine ( ) ) ;
  X = new double [ N ] , Y = new double [ N ] , R = new double [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final double x = Integer . parseInt ( readLine ( ) ) ;
    final double y = Integer . parseInt ( readLine ( ) ) ;
    final double r = Integer . parseInt ( readLine ( ) ) ;
    X [ i ] = x ;
    Y [ i ] = y ;
    R [ i ] = r ;
  }
  if ( N > 3 ) {
    System . out . println ( >> System . err . format ( "%.6f" , N ) ) ;
    System . out . println ( "?" ) ;
    continue ;
  }
  if ( N < 3 ) {
    System . out . format ( "%.6f" , max ( R ) ) ;
    continue ;
  }
  double left = max ( R ) ;
  double right = 10000.0 ;
  for ( int iteration = 0 ;
  iteration < 1000 ;
  iteration ++ ) {
    final double mid = ( left + right ) * 0.5 ;
    if ( works ( X , Y , R , mid ) ) {
      right = mid ;
    }
    else {
      left = mid