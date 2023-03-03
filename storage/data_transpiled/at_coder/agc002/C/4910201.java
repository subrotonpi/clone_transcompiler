public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int l = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int maxLen = a [ 0 ] + a [ 1 ] ;
  int maxJoint = 1 ;
  for ( int i = 1 ;
  i < n - 1 ;
  i ++ ) {
    int len = a [ i ] + a [ i + 1 ] ;
    if ( len > maxLen ) {
      maxLen = len ;
      maxJoint = i + 1 ;
    }
  }
  if ( maxLen < l ) {
    System . out . println ( "Impossible" ) ;
    exit ( ) ;
  }
  else {
    System . out . println ( "Possible" ) ;
    for ( int i = 1 ;
    i < maxJoint ;
    i ++ ) {
      System . out . println ( i ) ;
    }
    for ( int i = n - 1 ;
    i >= maxJoint ;
    i -- ) {
      System . out . println ( i ) ;
    }
    System . out . println ( maxJoint ) ;
  }
}
