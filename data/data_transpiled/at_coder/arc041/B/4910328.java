public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] [ ] b = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) b [ i ] = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = new int [ m ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) a [ i ] [ 0 ] = 0 ;
  for ( int ni = 0 ;
  ni < n ;
  ni ++ ) for ( int mi = 0 ;
  mi < m ;
  mi ++ ) {
    if ( b [ ni ] [ mi ] > 0 ) {
      int tmp = b [ ni ] [ mi ] ;
      b [ ni ] [ mi ] -= tmp ;
      b [ ni + 1 ] [ mi - 1 ] -= tmp ;
      b [ ni + 1 ] [ mi + 1 ] -= tmp ;
      b [ ni + 2 ] [ mi ] -= tmp ;
      a [ ni + 1 ] [ mi ] += tmp ;
    }
  }
  for ( int ni = 0 ;
  ni < n ;
  ni ++ ) for ( int mi = 0 ;
  mi < m ;
  mi ++ ) System . out . print ( a [ ni ] [ mi ] ) ;
  System . out . println ( ) ;
}
