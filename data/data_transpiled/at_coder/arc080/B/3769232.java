static final void solve ( ) {
  int H = Integer . parseInt ( input . readLine ( ) ) ;
  int W = Integer . parseInt ( input . readLine ( ) ) ;
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  List < Integer > L = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < W ;
  i ++ ) {
    L . add ( Integer . parseInt ( input . readLine ( ) ) ) ;
  }
  String [ ] [ ] ans = new String [ H ] [ W ] ;
  int h = 0 , w = 0 ;
  for ( int i = 0 ;
  i < L . size ( ) ;
  i ++ ) {
    while ( v != 0 ) {
      if ( h % 2 == 0 ) {
        ans [ h ] [ w ] = String . valueOf ( i + 1 ) ;
        v -- ;
        if ( w == 0 ) h ++ ;
        else w -- ;
      }
    }
  }
  for ( String [ ] v : ans ) {
    System . out . println ( Arrays . toString ( v ) ) ;
  }
}
