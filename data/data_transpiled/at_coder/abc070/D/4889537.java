@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input ( args [ 0 ] ) ) ;
  int [ ] l = new int [ n ] ;
  Map < Integer , Set < Integer >> map = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input ( args [ i ] ) ) ;
    int b = Integer . parseInt ( input ( args [ i + 1 ] ) ) ;
    int c = Integer . parseInt ( input ( args [ i + 2 ] ) ) ;
    a -- ;
    b -- ;
    if ( map . containsKey ( a ) ) {
      map . get ( a ) . add ( new Integer ( b ) ) ;
    }
    else {
      map . put ( a , new HashSet < > ( ) ) ;
    }
    if ( map . containsKey ( b ) ) {
      map . get ( b ) . add ( new Integer ( a ) ) ;
    }
    else {
      map . put ( b , new HashSet < > ( ) ) ;
    }
  }
  int q = Integer . parseInt ( input ( args [ 0 ] ) ) ;
  int k = Integer . parseInt ( input ( args [ 1 ] ) ) ;
  k -- ;
  Queue < Integer > p = new ArrayDeque < > ( k ) ;
  while ( p . size ( ) > 0 ) {
    int w = p . poll ( ) ;
    for ( Integer i : map . get ( w ) ) {
      if ( ( l [ i . intValue ( ) ] == 0 && i . intValue ( ) != k ) || ( l [ i . intValue ( ) ] != 0 && l [ i . intValue ( ) ] > l [ w ] + i . intValue ( ) ) ) {
        l [ i . intValue ( ) ] = l [ w ] + i . intValue ( ) ;
        p . add ( i . intValue ( ) ) ;
      }
    }
  }
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int x = Integer . parseInt ( input ( args [ i + 1 ] ) ) ;
    int y = Integer . parseInt ( input ( args [ i + 2 ] ) ) ;
    System . out . println ( l [ x - 1 ] + l [ y - 1 ] ) ;
  }
}
