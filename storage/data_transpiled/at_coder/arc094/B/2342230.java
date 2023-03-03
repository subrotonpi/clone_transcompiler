@ VisibleForTesting static int [ ] [ ] solve ( ) {
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Tuple < Integer , Integer >> que = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    que . add ( new Tuple < > ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  for ( Tuple < Integer , Integer > q : que ) {
    if ( q . get ( 0 ) == q . get ( 1 ) ) {
      System . out . println ( 2 * q . get ( 0 ) - 2 ) ;
    }
    else {
      int a = q . get ( 0 ) * q . get ( 1 ) ;
      int p = ( int ) Math . sqrt ( a ) ;
      if ( p * p == a ) {
        p -- ;
      }
      if ( a > p * ( p + 1 ) ) {
        System . out . println ( 2 * p - 1 ) ;
      }
      else {
        System . out . println ( 2 * p - 2 ) ;
      }
    }
  }
  return que . toArray ( new Tuple [ 0 ] [ q . size ( ) ] ) ;
}
