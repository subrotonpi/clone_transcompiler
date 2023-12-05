static final int [ ] getOccurrences ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Counter c = new Counter ( a ) ;
  int k = 0 ;
  for ( Entry < Integer , Entry < Integer , Entry < Integer , Entry < Integer , Entry < Integer , Entry < Integer >>>> > s : c ) {
    if ( s . getValue ( ) < s . getValue ( ) ) {
      k += s . getValue ( ) ;
    }
    else {
      k += s . getValue ( ) - s . getValue ( ) ;
    }
  }
  System . out . println ( k ) ;
  return a ;
}
