@ VisibleForTesting static void heapSort ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> L = new ArrayList < > ( N + 1 ) ;
  List < Double > Fd = new ArrayList < > ( N + 1 ) ;
  List < Double > Sd = new ArrayList < > ( N + 1 ) ;
  Fd . set ( 1 , 0 ) ;
  Sd . set ( N , 0 ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    L . get ( a ) . add ( b ) ;
    L . get ( b ) . add ( a ) ;
  }
  List < Integer > Q = new ArrayList < > ( ) ;
  heapSort ( Q , 1 ) ;
  while ( Q . size ( ) > 0 ) {
    int n = Integer . parseInt ( Q . get ( 0 ) ) ;
    double d = Fd . get ( n ) ;
    for ( int x : L . get ( n ) ) {
      if ( Fd . get ( x ) == Double . MAX_VALUE ) {
        Fd . set ( x , d + 1 ) ;
        heapSort ( Q , x ) ;
      }
    }
  }
  Q = new ArrayList < > ( ) ;
  heapSort ( Q , N ) ;
  while ( Q . size ( ) > 0 ) {
    int n = Integer . parseInt ( Q . get ( 0 ) ) ;
    double d = Sd . get ( n ) ;
    for ( int x : L . get ( n ) ) {
      if ( Sd . get ( x ) == Double . MAX_VALUE ) {
        Sd . set ( x , d + 1 ) ;
        heapSort ( Q , x ) ;
      }
    }
  }
  int f = 0 ;
  int s = 0 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    if ( Fd . get ( i ) <= Sd . get ( i ) ) {
      f ++ ;
    }
    else {
      s ++ ;
    }
  }
  if ( f > s ) {
    System . out . println ( "Fennec" ) ;
  }
  else {
    System . out . println ( "Snuke" ) ;
  }
}
