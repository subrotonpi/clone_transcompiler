@ VisibleForTesting static double pi ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > r = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    r . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  double ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans += r . get ( i ) ;
  }
  return ans ;
}
