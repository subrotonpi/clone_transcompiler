public static int [ ] getCumax ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  List < Integer > As = new ArrayList < > ( A ) ;
  As . sort ( ) ;
  List < Integer > cumax = new ArrayList < > ( N ) ;
  int ma = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) cumax . add ( 0 ) ;
  ma = i ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = A . get ( i ) ;
    cumax . set ( i , Math . max ( cumax . get ( i - 1 ) , a ) ) ;
  }
  int ias = 0 ;
  int pma = 0 ;
  int ofs = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = cumax . get ( i ) ;
    if ( a == pma ) {
      System . out . println ( 0 ) ;
      continue ;
    }
    int s = 0 ;
    while ( ias < N && As . get ( ias ) <= a ) {
      s += As . get ( ias ) - ofs ;
      ias ++ ;
    }
    s += ( N - ias ) * ( a - ofs ) ;
    pma = a ;
    ofs = a ;
    System . out . println ( s ) ;
  }
  return cumax . toArray ( new Integer [ N ] ) ;
}
