@ Sys public static void main ( String in , String out ) {
  int T = Integer . parseInt ( in ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    final int N = Integer . parseInt ( in . nextLine ( ) ) ;
    final int [ ] A = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      A [ i ] = Integer . parseInt ( in . nextLine ( ) ) ;
    }
    final List < Integer > sA = Lists . newArrayList ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      A [ i ] = A [ i ] ;
    }
    final List < Integer > perm = new ArrayList < > ( ) ;
    for ( int value = 0 ;
    value < N ;
    value ++ ) {
      perm . add ( i ) ;
    }
    final List < Integer > newperm = new ArrayList < > ( ) ;
    int tr = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int leftCT = Integer . parseInt ( in . nextLine ( ) ) ;
      if ( 2 * leftCT < i ) {
        newperm . add ( sA . get ( i ) ) ;
      }
      else {
        newperm . add ( sA . get ( i ) ) ;
      }
      tr += Math . min ( leftCT , i - leftCT ) ;
    }
    System . out . println ( "Case #" + t + ":" + tr ) ;
    System . out . println ( out >> err , Lists . newArrayList ( newperm ) ) ;
  }
}
