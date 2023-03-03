public static String bEquation ( int N ) {
  List < Integer > isSatisfyEquation = new ArrayList < Integer > ( ) ;
  for ( int x = N - 153 ;
  x <= N ;
  x ++ ) {
    if ( x < 0 ) {
      continue ;
    }
    int f = Integer . parseInt ( String . valueOf ( x ) ) ;
    if ( x + f == N ) {
      isSatisfyEquation . add ( x ) ;
    }
  }
  String ans = "\n" ;
  return ans ;
}
