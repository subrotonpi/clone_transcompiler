public static int query ( int x , int y ) {
  System . out . println ( "? " + x + " " + y ) ;
  return Integer . parseInt ( input . nextLine ( ) ) ;
  if ( getClass ( ) . equals ( "org.apache.commons.lang3.math.NumberUtils" ) ) {
    int N = Integer . parseInt ( input . nextLine ( ) ) ;
    int maxLength = 0 ;
    int farthestV = 1 ;
    for ( int i = 2 ;
    i <= N ;
    i ++ ) {
      int dist = query ( 1 , i ) ;
      if ( maxLength < dist ) {
        maxLength = dist ;
        farthestV = i ;
      }
    }
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      if ( i == farthestV ) continue ;
      maxLength = Math . max ( maxLength , query ( farthestV , i ) ) ;
    }
    System . out . println ( "!" + maxLength ) ;
  }
  return 0 ;
}
