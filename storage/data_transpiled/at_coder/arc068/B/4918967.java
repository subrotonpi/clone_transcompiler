@ MoreRequires ( "x" ) @ VisibleForTesting static void main ( String [ ] args ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  final Map < Integer , Integer > map = new HashMap < > ( ) ;
  for ( int a : A ) {
    if ( map . containsKey ( a ) ) {
      map . put ( a , 1 ) ;
    }
    else {
      map . put ( a , 1 ) ;
    }
  }
  int sum = 0 ;
  for ( int v : map . values ( ) ) {
    if ( v >= 2 ) {
      sum += v - 1 ;
    }
  }
  if ( sum % 2 == 0 ) {
    final int ans = map . size ( ) ;
    if ( ans > 0 ) {
      System . out . println ( ans ) ;
    }
  }
  if ( className . equals ( "java.util.concurrent.ThreadPoolExecutor" ) ) {
    System . out . println ( "ThreadPoolExecutor is not supported by java.util.concurrent.ThreadPoolExecutor.allowConcurrentDeetion" ) ;
  }
}
