public static int [ ] [ ] getNegativeInstances ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N == 3 ) {
    System . out . println ( 2 , 5 , 63 ) ;
    exit ( ) ;
  }
  int count = 20000 ;
  int [ ] m2 = new int [ N ] ;
  int [ ] m3 = new int [ N ] ;
  int [ ] m6 = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i += 2 ) {
    if ( i % 6 != 0 ) {
      m2 [ i ] = i ;
    }
  }
  for ( int i = 0 ;
  i < N ;
  i += 3 ) {
    m3 [ i ] = i ;
  }
  m6 [ i ] = 6 ;
  if ( count > N ) {
    int diff = Math . min ( count - N , 9998 ) ;
    if ( diff % 2 == 1 ) {
      diff -- ;
    }
    if ( diff > 0 ) {
      m2 [ i ] = i ;
    }
  }
  return m2 ;
}
