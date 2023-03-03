public static String print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  Map < Integer , List < Integer >> route = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    route . get ( a - 1 ) . add ( b - 1 ) ;
    route . get ( b - 1 ) . add ( a - 1 ) ;
  }
  String ans = "IMPOSSIBLE" ;
  for ( int island = 0 ;
  island < route . size ( ) ;
  island ++ ) {
    if ( route . get ( island ) . contains ( N - 1 ) ) {
      ans = "POSSIBLE" ;
      break ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
