static final int [ ] [ ] getBlues ( ) {
  final int N = Integer . parseInt ( input ( ) ) ;
  int Rmax = 0 ;
  int Rmin = 1000000001 ;
  int Bmax = 0 ;
  int Bmin = 1000000001 ;
  final List < List < Integer >> list = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    list . add ( new ArrayList < > ( Collections . singletonList ( input . nextLine ( ) ) ) ) ;
  }
  final List < Integer > tempBlues = new ArrayList < > ( ) ;
  for ( final List < Integer > d : list ) tempBlues . add ( d . get ( 1 ) ) ;
  final List < Integer > tempReds = new ArrayList < > ( ) ;
  for ( final List < Integer > d : list ) tempReds . add ( d . get ( 0 ) ) ;
  heapify ( tempReds ) ;
  Rmin = data . get ( 0 ) . get ( 0 ) ;
  Rmax = data . get ( N - 1 ) . get ( 0 ) ;
  Bmax = Math . max ( tempBlues , Bmax ) ;
  Bmin = Math . min ( tempBlues , Bmax ) ;
  int minValue = ( Rmax - Rmin ) * ( Bmax - Bmin ) ;
  Bmin = Rmin ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int heapMin = heapify ( tempReds ) ;
    if ( heapMin == data . get ( i ) . get ( 0 ) ) {
      heapify ( tempReds , data . get ( i ) . get ( 1 ) ) ;
      if ( data . get ( i ) . get ( 1 ) > Rmax ) Rmax = data . get ( i ) . get ( 1 ) ;
      if ( ( Rmax - tempReds . get ( i ) . get ( 0 ) ) * ( Bmax - Bmin ) < minValue ) minValue = ( Rmax - tempReds . get ( 0 ) * ( Bmax - Bmin ) ) ;
    }
    else break ;
  }
  System . out . println ( minValue ) ;
}
