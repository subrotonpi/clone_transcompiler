@ SafeVarargs public static void prime ( ) {
  int f = Integer . parseInt ( open ( 0 ) ) ;
  int g = Integer . parseInt ( open ( 0 ) ) ;
  int h = Integer . parseInt ( open ( 0 ) ) ;
  int a = Integer . parseInt ( open ( 0 ) ) ;
  int ans = 1 ;
  List < Integer > l = new ArrayList < > ( ) ;
  for ( int s = 0 ;
  s < a ;
  s ++ ) {
    ans *= ( f / s ) * ( g / t ) * ( h / r ) ;
    l . add ( ans ) ;
    ans = 1 ;
  }
  System . out . println ( max ( l ) ) ;
}
