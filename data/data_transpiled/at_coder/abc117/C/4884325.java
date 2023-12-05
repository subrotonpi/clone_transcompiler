public static int [ ] getStdoutOfRange ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > Xkari = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) Xkari . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  List < Integer > X = new ArrayList < Integer > ( Xkari ) ;
  Collections . sort ( X ) ;
  if ( N >= M ) {
    System . out . println ( 0 ) ;
  }
  else {
    List < Integer > D = new ArrayList < Integer > ( ) ;
    for ( int i = 0 ;
    i < M - 1 ;
    i ++ ) D . add ( X . get ( i + 1 ) - X . get ( i ) ) ;
    Collections . sort ( D ) ;
    D = D . subList ( 0 , N - 1 ) ;
    int ans = X . get ( M - 1 ) - X . get ( 0 ) - sum ( D ) ;
    System . out . println ( ans ) ;
  }
  return X . toArray ( new Integer [ 0 ] ) ;
}
