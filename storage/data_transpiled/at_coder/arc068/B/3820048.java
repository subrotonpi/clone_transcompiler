@ VisibleForTesting static LinkedHashMap < Integer , Integer > map ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( String s : input . split ( " " ) ) {
    A . add ( Integer . parseInt ( s ) ) ;
  }
  Map < Integer , Integer > Ac = Maps . newHashMap ( ) ;
  for ( int i : A ) {
    if ( Ac . get ( i ) > 1 ) {
      a += Ac . get ( i ) - 1 ;
    }
  }
  if ( a % 2 == 0 ) {
    System . out . println ( N - a ) ;
  }
  else {
    System . out . println ( N - a - 1 ) ;
  }
  return A ;
}
