static final double getSummingDouble ( ) {
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Integer > nList = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( nList . get ( i ) != 0 ) {
      count ++ ;
      total += nList . get ( i ) ;
    }
  }
  final double avrage = total / count ;
  System . out . println ( Math . ceil ( avrage ) ) ;
  return avrage ;
}
