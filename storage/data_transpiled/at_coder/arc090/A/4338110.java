static final int [ ] getDoubleArray ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A1 = Lists . newArrayList ( ) ;
  List < Integer > A2 = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A1 . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  List < Integer > dp = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A2 . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  dp . add ( 0 ) ;
  long ans = 0 ;
  if ( N == 1 ) {
    System . out . println ( A1 . get ( 0 ) + A2 . get ( 0 ) ) ;
  }
  else {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( Math . pow ( A1 . get ( 0 ) , i ) + Math . pow ( A2 . get ( i - 1 ) , i ) > ans ) {
        ans = Math . pow ( A1 . get ( 0 ) , i ) + Math . pow ( A2 . get ( i - 1 ) , i ) ;
      }
    }
  }
  System . out . println ( ( int ) ans ) ;
  return dp . toArray ( ) ;
}
