static final int [ ] input ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int L = Integer . parseInt ( input . readLine ( ) ) ;
  int T = Integer . parseInt ( input . readLine ( ) ) ;
  List < Integer > a = new ArrayList < > ( ) ;
  for ( int l = 0 ;
  l < N ;
  l ++ ) a . add ( Integer . parseInt ( input . readLine ( ) ) ) ;
  List < Integer > _a = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) a . add ( i ) ;
  _a . sort ( ) ;
  int num = 0 ;
  int start = a . get ( 0 ) ;
  int direction = a . get ( 1 ) ;
  double eps = 1e-9 ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    if ( direction == 1 ) continue ;
  }
  return _a . get ( i ) ;
}
