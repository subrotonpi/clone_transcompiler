@ VisibleForTesting static void from ( LinkedHashMap < Integer , Integer > map ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  List < Integer > B = new ArrayList < > ( ) ;
  B . add ( A . get ( 0 ) ) ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    B . add ( B . get ( i - 1 ) + A . get ( i ) ) ;
  }
  Map < Integer , Integer > D = map . get ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int Z = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( B . get ( i ) == 0 ) {
      Z ++ ;
    }
    D . put ( B . get ( i ) , 1 ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans += ( ( D . get ( i ) - 1 ) * D . get ( i ) / 2 ) ;
  }
  if ( Z > 0 ) {
    ans += Z ;
  }
  System . out . println ( ans ) ;
}
