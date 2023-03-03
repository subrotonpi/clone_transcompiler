@ VisibleForTesting static void binarySearch ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  LinkedList < Integer > A = new LinkedList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  Collections . sort ( A ) ;
  A . clear ( ) ;
  int ans = 0 ;
  int t_max = Integer . SIZE - 2 ;
  for ( int t = t_max ;
  t > 0 ;
  t -- ) {
    if ( A . size ( ) < 2 ) break ;
    while ( Integer . SIZE - 2 > t ) {
      A . removeLast ( ) ;
      if ( A . size ( ) < 2 ) break ;
    }
    if ( A . size ( ) < 2 ) break ;
    int pow2 = 1 << t ;
    LinkedList < Integer > A_tmp = new LinkedList < > ( ) ;
    while ( t == Integer . SIZE - 2 ) {
      int r = A . removeFirst ( ) ;
      int idx = bisect_left ( A , pow2 - r ) ;
      for ( ;
      idx > 0 ;
      idx -- ) {
        A_tmp . addFirst ( A . removeFirst ( ) ) ;
      }
      if ( A . size ( ) == 0 ) break ;
      if ( A . addFirst ( r ) == pow2 ) {
        A . removeFirst ( ) ;
        ans ++ ;
      }
      if ( A . size ( ) < 2 ) break ;
    }
    A . extendFirst ( A_tmp ) ;
  }
  System . out . println ( ans ) ;
}
