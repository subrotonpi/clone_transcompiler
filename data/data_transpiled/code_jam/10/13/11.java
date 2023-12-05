static private int win ( int a , int b ) {
  final int l = win2 ( a , b ) ;
  final int r = win2 ( b , a ) ;
  if ( ( l == 1 ) || ( r == 1 ) ) {
    return 1 ;
  }
  else {
    return 0 ;
  }
}
