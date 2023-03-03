@ VisibleForTesting static int [ ] [ ] floydWarshall ( ) {
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> cost = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) {
    List < Integer > sub = Lists . newArrayList ( ) ;
    for ( int j = 0 ;
    j < 10 ;
    j ++ ) {
      sub . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    }
    cost . add ( sub ) ;
  }
  double [ ] [ ] d = new double [ 10 ] [ 10 ] ;
  for ( int i = 0 ;
  i < d . length ;
  i ++ ) {
    d [ i ] [ i ] = 0 ;
  }
  L . length = d . length ;
  for ( int i = 0 ;
  i < d . length ;
  i ++ ) {
    d [ i ] [ i ] = 0 ;
  }
  L . length = d [ i ] . length ;
  L . length = d . length ;
  return L ;
}
