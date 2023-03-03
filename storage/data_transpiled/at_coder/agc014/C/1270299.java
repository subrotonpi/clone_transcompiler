@ VisibleForTesting static int getDistToExit ( ) {
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] rooms = new String [ h ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    String row = input . nextLine ( ) . trim ( ) ;
    rooms [ i ] = row ;
    if ( row . contains ( "S" ) ) {
      s = new Point ( i , row . indexOf ( "S" ) ) ;
    }
  }
  return h ;
}
