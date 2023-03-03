static final void print ( int i , int i2 ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = input . nextInt ( ) ;
  double dMax = 0 ;
  int iP = 0 ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    fQ ( 1 , i ) ;
    final int d = input . nextInt ( ) ;
    if ( dMax < d ) {
      dMax = d ;
      iP = i ;
    }
  }
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    if ( i == iP ) {
      continue ;
    }
    else {
      fQ ( iP , i ) ;
      final int d = input . nextInt ( ) ;
      if ( dMax < d ) {
        dMax = d ;
      }
    }
  }
  System . out . println ( "!" + dMax ) ;
}
