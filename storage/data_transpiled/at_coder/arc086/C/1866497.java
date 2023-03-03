@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static < T > Supplier < Supplier < T >> getMath ( ) {
  final Map < Integer , Supplier < T >> cache = new HashMap < > ( ) ;
  final Supplier < T > supplier = ( ) -> {
    if ( ! cache . containsKey ( supplier ) ) {
      cache . put ( supplier , new Supplier < T > ( ) {
        @ Override public T get ( ) {
          return supplier . get ( ) ;
        }
      }
      ) ;
    }
    return supplier . get ( ) ;
  }
  ;
  final long mod = 1000000007 ;
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Integer > parents = Lists . newArrayList ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  final List < Set < Integer >> children = new ArrayList < > ( ) ;
  for ( int c = 0 ;
  c < n + 1 ;
  c ++ ) {
    children . get ( parents . get ( c ) ) . add ( parents . get ( c ) + 1 ) ;
  }
  final List < Set < Integer >> levels = new ArrayList < > ( ) ;
  levels . add ( new HashSet < > ( 0 ) ) ;
  do {
    final Set < Integer > level = new HashSet < > ( ) ;
    for ( int p = levels . get ( levels . size ( ) - 1 ) ;
    p >= 0 ;
    p -- ) {
      level . addAll ( children . get ( p ) ) ;
    }
    if ( level . isEmpty ( ) ) break ;
    levels . add ( level ) ;
  }
  while ( true ) ;
  Collections . reverse ( levels ) ;
  final AtomicInteger levelNodeCount = new AtomicInteger ( ) ;
  final List < List < T >> balls = new ArrayList < > ( n + 1 ) ;
  for ( int i = 0 ;
  i < levels . size ( ) ;
  i ++ ) {
    final Set < Integer > level = levels . get ( i ) ;
    levelNodeCount . incrementAndGet ( level . size ( ) ) ;
    for ( int node : level ) {
      final Set < Integer > cn = children . get ( node ) ;
      if ( cn != null ) {
        if ( cn . size ( ) == 1 ) {
          final List < T > bs = balls . get ( cn . iterator ( ) . next ( ) ) ;
          bs . appendAll ( new ArrayList < > ( 1 ) ) ;
          balls . put ( node , bs ) ;
          continue ;
        }
        final List < T > ballsFrom @ @