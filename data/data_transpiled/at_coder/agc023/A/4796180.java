static final int [ ] getSumm ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  List < Integer > summ = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    summ . add ( summ . get ( i - 1 ) + A . get ( i ) ) ;
  }
  Set < Integer > s = new TreeSet < Integer > ( summ ) ;
  s . clear ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < s . size ( ) ;
  i ++ ) {
    if ( s . get ( i ) . intValue ( ) >= 2 ) {
      ans += s . get ( i ) . intValue ( ) * ( s . get ( i ) . intValue ( ) - 1 ) / 2 ;
    }
  }
  System . out . println ( ans ) ;
  return s . toArray ( ) ;
}
