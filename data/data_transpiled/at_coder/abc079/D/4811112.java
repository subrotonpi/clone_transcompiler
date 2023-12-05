public static void main ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  List < Integer > C = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) C . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  double [ ] cost = new double [ 10 ] ;
  cost [ 1 ] = 0 ;
  Set < Integer > check = new THashSet < > ( 1 , null ) ;
  while ( check . size ( ) > 0 ) {
    int now = check . iterator ( ) . next ( ) ;
    for ( int i = 0 ;
    i < 10 ;
    i ++ ) {
      if ( cost [ i ] > cost [ now ] + C . get ( i ) ) {
        cost [ i ] = cost [ now ] ;
        check |= new THashSet < > ( i , null ) ;
      }
    }
  }
  cost [ 0 ] = 0 ;
  double ans = 0 ;
  for ( int h = 0 ;
  h < H ;
  h ++ ) {
    for ( int a : map . get ( input ) ) ans += cost [ a ] ;
  }
  System . out . println ( ans ) ;
}
