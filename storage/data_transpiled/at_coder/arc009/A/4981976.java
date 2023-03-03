public static int N = Integer . parseInt ( input ) {
  List < Tuple > src = new ArrayList < Tuple > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    src . add ( tuple ( input ) ) ;
  }
  double ans = 0 ;
  for ( Tuple a : src ) {
    ans += a . x * a . y ;
  }
  ans *= 1.05 ;
  System . out . println ( ( int ) ans ) ;
  return ans ;
}
