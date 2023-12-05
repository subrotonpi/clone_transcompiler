@ VisibleForTesting static void from ( LinkedHashMap < Integer , Integer > input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] V = new int [ K ] ;
  Queue < Integer > q = new LinkedList < > ( ) ;
  int x = input . nextInt ( ) ;
  int r = input . nextInt ( ) ;
  int ans = 0 ;
  while ( q . size ( ) > 0 ) {
    x = q . poll ( ) ;
    int r = input . nextInt ( ) ;
    if ( x == 0 ) {
      ans = r ;
      break ;
    }
    if ( V [ x ] == 1 ) continue ;
    V [ x ] = 1 ;
    if ( V [ 10 * x % K ] == 0 ) q . add ( new Integer ( ( x + 1 ) % K ) ) ;
    if ( V [ ( x + 1 ) % K ] == 0 ) q . add ( new Integer ( r + 1 ) ) ;
  }
  System . out . println ( ans ) ;
}
