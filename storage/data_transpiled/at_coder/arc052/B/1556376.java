@ VisibleForTesting static void input ( Scanner input ) {
  int N = input . nextInt ( ) ;
  int Q = input . nextInt ( ) ;
  ArrayList < Integer > a = new ArrayList < > ( ) ;
  for ( int a = 0 ;
  a < N ;
  a ++ ) {
    for ( int h = input . nextInt ( ) ;
    h > 0 ;
    h -- ) {
      a . add ( new Integer ( a ) ) ;
    }
    a . add ( new Integer ( 10 * 9 ) ) ;
    a . add ( new Integer ( 10 * 9 ) ) ;
    a . add ( new Integer ( 1 ) ) ;
  }
  StringBuilder result = new StringBuilder ( ) ;
  append = result . append ( "\n" ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int qx1 = input . nextInt ( ) ;
    int qx2 = input . nextInt ( ) ;
    int total = 0 ;
    int i = 0 ;
    int x1 = a . get ( i ) ;
    int x2 = a . get ( i ) ;
    int r = a . get ( i ) ;
    int h = a . get ( i ) ;
    while ( x1 < qx2 ) {
      if ( x2 > qx1 ) {
        int lx = x1 > qx1 ? x1 : qx1 ;
        int ux = x2 > qx2 ? x2 : qx2 ;
        int rh = x2 - lx ;
        total += ( r * ( rh / h ) ) * 2 * PI * rh / 3 ;
        if ( x2 > qx2 ) {
          int _h = x2 - qx2 ;
          total -= ( r * ( _h / h ) ) * 2 * PI * _h / 3 ;
        }
      }
      i ++ ;
      x1 = x2 ;
      x2 = a . get ( i ) ;
    }
    append ( total ) ;
  }
  System . out . println ( result . toString ( ) ) ;
}
