@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static < T > void getMath ( ) {
  final Map < T , BigInteger > cache = new HashMap < > ( ) ;
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Integer > parents = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    parents . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  final Set < Set < Integer >> children = new HashSet < > ( ) ;
  for ( int c = 0 ;
  c < n ;
  c ++ ) {
    children . add ( parents . get ( c ) . add ( c + 1 ) ) ;
  }
  final Set < Set < Integer >> levels = new TreeSet < > ( new HashSet < > ( ) ) ;
  levels . add ( new HashSet < > ( 0 ) ) ;
  while ( true ) {
    final Set < Integer > level = new HashSet < > ( ) ;
    for ( int p = levels . size ( ) - 1 ;
    p >= 0 ;
    p -- ) {
      level . addAll ( children . get ( p ) ) ;
    }
    if ( level . isEmpty ( ) ) break ;
    levels . add ( level ) ;
  }
  Collections . reverse ( levels ) ;
  final AtomicInteger levelNodeCount = new AtomicInteger ( ) ;
  final List < List < Integer >> balls = new ArrayList < > ( n + 1 ) ;
  for ( int i = 0 ;
  i < levels . size ( ) ;
  i ++ ) {
    final Set < Integer > level = levels . get ( i ) ;
    levelNodeCount . incrementAndGet ( level . size ( ) ) ;
    for ( int node : level ) {
      final Set < Integer > cn = children . get ( node ) ;
      if ( cn != null ) {
        if ( cn . size ( ) == 1 ) {
          final List < Integer > bs = balls . get ( cn . iterator ( ) . next ( ) ) ;
          bs . appendln ( new int [ ] {
            1 , 1 , 0 }
            ) ;
            balls . put ( node , bs ) ;
            continue ;
          }
          final List < List < Integer >> ballsFromChildren = new ArrayList < > ( ) ;
          ballsFromChildren . add ( balls . get ( node ) ) ;
          Collections . sort ( ballsFromChildren , new Comparator < List < Integer >> ( ) {
            @ Override public int compare ( List < Integer > o1 , List < Integer