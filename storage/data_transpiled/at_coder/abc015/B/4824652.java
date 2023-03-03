static final int N = Integer . parseInt ( input ) {
  int [ ] A = list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int s = 0 ;
  int c = 0 ;
  for ( int a : A ) {
    if ( a != 0 ) {
      c ++ ;
    }
    s += a ;
  }
  System . out . println ( ( int ) Math . ceil ( s / c ) ) ;
  return s ;
}
