static final void solve ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  String input = System . getProperty ( "line.separator" ) ;
  int N = Integer . parseInt ( input ) ;
  List < Integer > e = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    e . add ( Integer . parseInt ( input ) ) ;
  }
  /* check if mid is smaller than min of max of min */
  double lx = 0 ;
  double ly = - Double . MAX_VALUE ;
  double ux = 0 ;
  double uy = Double . MIN_VALUE ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = e . get ( i ) ;
    int b = e . get ( i ) ;
    int w = e . get ( i ) ;
    double dist = mid / w ;
    double _lx = a - dist , _ux = a + dist ;
    double _ly = b - dist , _uy = b + dist ;
    lx = _lx > lx ? lx : _ux ;
    ly = _ly > ly ? ly : _ly ;
  }
  /* solve */
}
