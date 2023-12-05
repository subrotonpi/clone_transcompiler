public static int N = Integer . parseInt ( input ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > P = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    P . add ( i ) ;
  }
  int i = 0 ;
  while ( i < K ) {
    if ( P . get ( i ) == a || P . get ( i ) == b ) {
      System . out . println ( "NO" ) ;
      break ;
    }
    else {
      i ++ ;
      if ( i == K ) {
        if ( Lists . newArrayList ( ) . size ( ) == K ) {
          System . out . println ( "YES" ) ;
        }
        else {
          System . out . println ( "NO" ) ;
        }
      }
    }
  }
  return i ;
}
