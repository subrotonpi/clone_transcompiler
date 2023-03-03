@ VisibleForTesting static String readString ( ) {
  int _T = Integer . parseInt ( readString ( ) ) ;
  for ( int _t = 1 ;
  _T <= _T ;
  _t ++ ) {
    int N = Integer . parseInt ( readString ( ) ) ;
    Map < Integer , Integer > map = new HashMap < > ( ) ;
    for ( int i = 0 ;
    i < 2 * N - 1 ;
    i ++ ) {
      for ( int h : Integer . parseInt ( readString ( ) ) ) {
        map . put ( h , 1 ) ;
      }
    }
    List < String > res = new ArrayList < > ( ) ;
    for ( int h : map . keySet ( ) ) {
      if ( map . get ( h ) % 2 == 1 ) res . add ( h ) ;
    }
    Collections . sort ( res ) ;
    res = StringUtil . join ( res , " " ) ;
    System . out . println ( "Case #" + _t + ": " + res ) ;
  }
  return "" ;
}
