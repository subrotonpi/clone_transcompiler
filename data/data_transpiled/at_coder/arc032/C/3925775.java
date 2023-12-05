@ VisibleForTesting static int [ ] heapSort ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > P = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    P . add ( new Integer ( a ) ) ;
  }
  int [ ] T = new int [ N ] ;
  Arrays . sort ( P , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return o2 . compareTo ( o1 ) ;
    }
  }
  ) ;
  List < Integer > que = new ArrayList < > ( ) ;
  int cur = 0 ;
  int l = 0 ;
  for ( int i = N - 1 ;
  i >= 0 ;
  i -- ) {
    int a = P . get ( i ) ;
    int b = P . get ( i ) ;
    while ( que . size ( ) > 0 ) {
      a = que . get ( i ) ;
      b = P . get ( i ) ;
    }
  }
  return T ;
}
