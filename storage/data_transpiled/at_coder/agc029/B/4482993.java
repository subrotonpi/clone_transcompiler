@ VisibleForTesting static void from ( LinkedHashMap < Integer , Integer > input ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  Arrays . sort ( a , Collections . reverseOrder ( ) ) ;
  Map < Integer , Integer > c = new HashMap < > ( ) ;
  int ans = 0 ;
  for ( int x : a ) {
    if ( c . get ( x ) == 0 ) {
      continue ;
    }
    int temp = ( 1 << x ) - x ;
    c . put ( x , temp -- ) ;
    if ( c . keySet ( ) . contains ( temp ) ) {
      if ( c . get ( temp ) > 0 ) {
        c . put ( temp , 0 ) ;
        ans ++ ;
      }
    }
  }
  System . out . println ( ans ) ;
}
