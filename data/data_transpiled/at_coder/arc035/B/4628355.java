@ VisibleForTesting static void doAnswer ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int mod = 10 * 9 + 7 ;
  @ SuppressWarnings ( "resource" ) LinkedHashMap < Integer , Integer > map = ddic ( Integer . class ) ;
  List < Integer > l = new LinkedList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    map . put ( a , ++ a ) ;
    l . add ( a ) ;
  }
  Collections . sort ( l ) ;
  long s = 0 ;
  long p = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s += l . get ( i ) * ( n - i ) ;
  }
  for ( int i : map . keySet ( ) ) {
    p *= fac ( map . get ( i ) ) ;
  }
  System . out . println ( s ) ;
  System . out . println ( p % mod ) ;
}
