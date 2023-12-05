public static int input ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  List < Integer > li = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    li . add ( i ) ;
  }
  int [ ] bLs = new int [ N + 1 ] ;
  bLs [ N ] = 0 ;
  int accumValue = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    accumValue += li . get ( i ) ;
    bLs [ i ] = accumValue ;
  }
  Map < Integer , Integer > modMap = Maps . newHashMap ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int mod = bLs [ i ] % M ;
    if ( ! mod . equals ( i ) ) {
      modMap . put ( mod , 1 ) ;
    }
    else {
      modMap . put ( mod , 1 ) ;
    }
  }
  long ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans += modMap . get ( i ) ;
  }
  return ans ;
}
