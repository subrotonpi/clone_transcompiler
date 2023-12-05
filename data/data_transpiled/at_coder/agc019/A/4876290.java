static final double [ ] getMath ( ) {
  List < Integer > l = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) l . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  N *= 4 ;
  int [ ] dp = new int [ 9 ] ;
  for ( int i = 0 ;
  i < dp . length ;
  i ++ ) dp [ i ] = 0 ;
  for ( int i = 1 ;
  i < dp . length ;
  i ++ ) dp [ i ] = Math . min ( dp [ i - 2 * i ] + l . get ( i ) ) ;
  double ans = Double . POSITIVE_INFINITY ;
  for ( int i = 1 ;
  i < dp . length ;
  i ++ ) ans = Math . min ( ans , N / i * dp [ i ] + dp [ N - N / i * i ] ) ;
  System . out . println ( ans ) ;
}
