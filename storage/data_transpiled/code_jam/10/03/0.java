static final int [ ] calcNext ( Map < Integer , Integer > next , int cur , int d ) {
  int _cur ;
  int _d ;
  int t = 0 ;
  if ( ( d & 1 ) != 0 ) {
    cur = next . get ( ( cur ++ ) ) ;
    _d = d ;
    d -- ;
  }
  cur = _cur ;
  _t = d ;
  t += _t ;
  cur = _cur ;
  _t = d / 2 ;
  t += _t ;
  next . put ( ( _cur ++ ) , ( d >> 1 ) ) ;
  return new int [ ] {
    cur , t }
    ;
  }
  