@ VisibleForTesting static double hypot ( Scanner input ) {
  int N = input . nextInt ( ) ;
  List < Integer > A = new ArrayList < > ( N ) ;
  List < Integer > B = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int sx = 0 ;
  int sy = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int ax = A . get ( i ) ;
    int ay = B . get ( i ) ;
    sx += ax ;
    sy += ay ;
  }
  double gxa = sx / N ;
  double gya = sy / N ;
  sx = sy = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int bx = B . get ( i ) ;
    int by = B . get ( i ) ;
    sx += bx ;
    sy += by ;
  }
  double gxb = sx / N ;
  double gyb = sy / N ;
  double c1 = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int ax = A . get ( i ) ;
    int ay = B . get ( i ) ;
    sx += ax ;
    sy += ay ;
  }
  double c1 = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int bx = B . get ( i ) ;
    int by = B . get ( i ) ;
    int bx = B . get ( i ) ;
    int by = B . get ( i ) ;
    int by = B . get ( i ) ;
  }
  return ( c1 / N ) ;
}
