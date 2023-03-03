@ VisibleForTesting static int [ ] binarySearch ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int A = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Integer > Xs = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Xs . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  final List < Integer > lower = new ArrayList < > ( ) ;
  int same = 0 ;
  final List < Integer > upper = new ArrayList < > ( ) ;
  for ( int x : Xs ) {
    if ( x < A ) {
      lower . add ( A - x ) ;
    }
    else if ( x == A ) {
      same ++ ;
    }
    else {
      upper . add ( x - A ) ;
    }
  }
  return new int [ ] {
    N , same }
    ;
  }
  