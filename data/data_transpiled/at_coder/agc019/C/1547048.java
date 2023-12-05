static final double getlis ( List < Pair < Integer , Integer >> S ) {
  final double [ ] dp = new double [ S . size ( ) ] ;
  for ( int i = 0 ;
  i < dp . length ;
  i ++ ) {
    final Pair < Integer , Integer > pair = S . get ( i ) ;
    final int a = pair . getSecond ( ) ;
    final int j = Math . min ( dp [ j ] , a ) ;
    dp [ j ] = a ;
  }
  return getlis ( dp ) ;
}
