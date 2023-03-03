static boolean dah ( int n , int r , int t ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  int case = 1 ;
  while ( scanner . hasNextInt ( ) ) {
    final String [ ] line = scanner . nextLine ( ) . split ( " " ) ;
    final int r = Integer . parseInt ( line [ 0 ] ) ;
    final int t = Integer . parseInt ( line [ 1 ] ) ;
    int men = 0 ;
    int mai = 10 * 20 ;
    while ( men != mai ) {
      final int med = ( men + mai ) / 2 ;
      if ( dah ( med , r , t ) ) men = med + 1 ;
      else mai = med ;
    }
    while ( ! dah ( men , r , t ) ) men -- ;
  }
  return false ;
}
