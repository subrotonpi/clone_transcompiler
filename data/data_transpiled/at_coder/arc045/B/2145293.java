@ VisibleForTesting static List < Integer > inpl ( ) {
  return Lists . newArrayList ( ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] R = new int [ N + 2 ] ;
  int [ ] Q = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) Q [ i ] = inpl ( ) ;
  for ( int s = 0 , t = 0 ;
  s < Q . length ;
  s ++ ) {
    R [ s ] ++ ;
    R [ t + 1 ] -- ;
  }
  R [ R . length - 1 ] = - 2 * M ;
  int c = 0 , f = - 1 ;
  int [ ] Pf = new int [ M ] , Pe = new int [ M ] ;
  boolean rec = false ;
  for ( int i = 0 ;
  i < R . length ;
  i ++ ) {
    c += R [ i ] ;
    if ( ( c >= 2 ) == rec ) {
    }
    else if ( rec ) {
      Pf [ i ] = f ;
      Pe [ i ] = i - 1 ;
      rec = false ;
    }
    else {
      f = i ;
      rec = true ;
    }
  }
  List < Integer > ANS = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < Q . length ;
  i ++ ) {
    final int s = Q [ i ] ;
    final int t = Q [ i ] ;
    int j = Arrays . binarySearch ( Pf , s ) ;
    if ( j > 0 ) {
      final int e = Pe [ j - 1 ] ;
      if ( t <= e ) ANS . add ( i ) ;
    }
    else {
    }
  }
  System . out . println ( ANS . size ( ) ) ;
  if ( ANS . size ( ) > 0 ) {
    System . out . println ( ( Integer ) ANS . get ( 0 ) ) ;
  }
  return ANS ;
}
