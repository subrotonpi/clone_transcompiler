@ VisibleForTesting static void from ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > dates = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    dates . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  Collections . sort ( dates ) ;
  DateTime pv = new DateTime ( 2012 , 1 , 1 ) ;
  boolean [ ] dp = new boolean [ 366 ] ;
  for ( int i = 0 ;
  i < 366 ;
  i ++ ) {
    DateTime m = dates . get ( i ) ;
    DateTime cur = new DateTime ( 2012 , m , d ) ;
    int days = ( cur . minus ( pv ) ) . days ;
    for ( int j = days ;
    j < 366 ;
    j ++ ) {
      if ( dp [ j ] ) continue ;
      dp [ j ] = true ;
      break ;
    }
  }
  String s = StringUtils . join ( dp , "01" ) ;
  System . out . println ( max ( Integer . parseInt ( s ) , "0" ) ) ;
}
