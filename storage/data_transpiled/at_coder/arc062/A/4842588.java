static final int N = Integer . parseInt ( input ) {
  int pt = 1 ;
  int pa = 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int tRatio = pt / t ;
    int aRatio = pa / a ;
    if ( pt % t != 0 ) ++ tRatio ;
    if ( pa % a != 0 ) ++ aRatio ;
  }
  return pt + pa ;
}
