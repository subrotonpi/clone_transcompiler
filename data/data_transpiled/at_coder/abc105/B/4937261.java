@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static int readInteger ( ) {
  final InputStream stdin = Thread . currentThread ( ) . getContextClassLoader ( ) . getResourceAsStream ( "test.txt" ) ;
  final Function < Integer , Integer > readInt = new Function < Integer , Integer > ( ) {
    @ Override public Integer apply ( Integer from ) {
      return Integer . parseInt ( from . readLine ( ) ) ;
    }
  }
  ;
  final Function < String , String > readStr = new Function < String , String > ( ) {
    @ Override public String apply ( String from ) {
      return stdin . readLine ( ) ;
    }
  }
  ;
  final int N = readInt . apply ( ) . intValue ( ) ;
  final boolean [ ] l = new boolean [ N + 1 ] ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    l [ i ] = false ;
  }
  @ Override public void solve ( ) {
    int ans = 0 ;
    l [ 0 ] = true ;
    for ( int i = 0 ;
    i < N + 1 ;
    i ++ ) {
      if ( l [ i ] && i + 4 < N + 1 ) {
        l [ i + 4 ] = true ;
      }
    }
    for ( int i = 0 ;
    i < N + 1 ;
    i ++ ) {
      if ( l [ i ] && i + 7 < N + 1 ) {
        l [ i + 7 ] = true ;
      }
    }
  }
  if ( getClass ( ) . equals ( "java.util.concurrent.atomic.AtomicInteger" ) ) {
    if ( solve ( ) ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
  else {
    System . out . println ( "No" ) ;
  }
}
