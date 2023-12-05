static final String print ( String input ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  final int N = scanner . nextInt ( ) ;
  final List < Tuple < Integer , Integer >> data = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    data . add ( new Tuple < > ( Integer . parseInt ( scanner . nextLine ( ) ) ) ) ;
  }
  Collections . sort ( data ) ;
  List < Tuple < Integer , Integer >> data2 = new ArrayList < > ( N ) ;
  List < Tuple < Integer , Integer >> now = new ArrayList < > ( N ) ;
  for ( Tuple < Integer , Integer > d : data ) {
    if ( now . size ( ) == 0 ) {
      now . add ( d ) ;
      continue ;
    }
    if ( now . get ( 0 ) . intValue ( ) != d . intValue ( ) ) {
      Collections . sort ( now ) ;
      data2 . addAll ( now ) ;
      now = new ArrayList < > ( d ) ;
    }
  }
  Collections . sort ( data2 ) ;
  data2 . addAll ( now ) ;
  data = data2 ;
  final double inf = Double . POSITIVE_INFINITY ;
  final double [ ] dp = new double [ N + 1 ] ;
  dp [ 0 ] = inf ;
  dp2 [ 0 ] = inf ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int idx = Integer . parseInt ( dp [ i ] ) ;
    if ( dp2 [ idx - 1 ] < dp [ i ] && dp [ i ] < inf ) {
      dp [ i ] = dp2 [ i ] ;
      dp2 [ i ] = dp [ i ] ;
    }
  }
  return dp [ N ] ;
}
