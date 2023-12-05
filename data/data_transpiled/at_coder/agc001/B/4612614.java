public static List < Integer > rli ( ) {
  return Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < input . length ;
  i ++ ) {
    if ( i < input . length - 1 ) {
      input = input . substring ( 0 , i ) ;
    }
    int w = input . length - 1 ;
    int t = ( w - ( input . remainder ( ) ) ) % w ;
    int res = ( input . remainder ( ) + w - 1 ) / w * 3 * w - t * 3 ;
    if ( t != 0 ) {
      res += solve ( w , w - t ) ;
    }
    return res ;
  }
  {
    int n = rli ( ) ;
    int x = rli ( ) ;
    System . out . println ( solve ( n , x ) ) ;
  }
  if ( getClass ( ) . isAnonymousClass ( ) ) {
    System . out . println ( "main" ) ;
  }
  return null ;
}
