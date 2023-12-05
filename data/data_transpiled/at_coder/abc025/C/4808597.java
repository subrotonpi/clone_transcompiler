@ Parameterized . Parameters public static int [ ] [ ] B = new int [ 2 ] [ 3 ] ;
for ( int i = 0 ;
i < 2 ;
i ++ ) {
  B [ i ] = Lists . newArrayList ( ) ;
  C [ i ] = Lists . newArrayList ( ) ;
  for ( int j = 0 ;
  j < 3 ;
  j ++ ) {
    C [ i ] = Lists . newArrayList ( ) ;
  }
}
final int S = Integer . valueOf ( B [ 0 ] [ 0 ] ) + Integer . valueOf ( B [ 1 ] [ 1 ] ) + Integer . valueOf ( C [ 0 ] ) + Integer . valueOf ( C [ 1 ] [ 1 ] ) + Integer . valueOf ( C [ 2 ] [ 2 ] ) ;
final HashMap < String , Integer > memo = new HashMap < > ( ) ;
/* score */
int s = 0 ;
for ( int i = 0 ;
i < 2 ;
i ++ ) {
  for ( int j = 0 ;
  j < 3 ;
  j ++ ) {
    if ( B [ i + 1 ] [ j ] == B [ i ] [ j ] ) {
      s += B [ i ] [ j ] ;
    }
  }
}
for ( int i = 0 ;
i < 3 ;
i ++ ) {
  for ( int j = 0 ;
  j < 2 ;
  j ++ ) {
    if ( C [ i ] [ j + 1 ] == C [ i ] [ j ] ) {
      s += C [ i ] [ j ] ;
    }
  }
}
/* solve */
if ( memo . containsKey ( String . valueOf ( s ) ) ) {
  return memo . get ( String . valueOf ( s ) ) ;
}
if ( turn == 10 ) {
  /* score */
  int bs1 = 0 ;
  int bs2 = Integer . MAX_VALUE ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) {
      if ( t [ i ] [ j ] != null ) {
        continue ;
      }
      t [ i ] [ j ] = turn % 2 ;
      s = solve ( t , turn + 1 ) ;
      t [ i ] [ j ] = null ;
      bs1 = Math . max ( bs1 , s ) ;
      bs2 = Math . min ( bs2 , s ) ;
    }
  }
  int ret = turn % 2 ? bs1 : bs2 ;
  memo . put ( String . valueOf ( s ) , ret ) ;
  return ret ;
}
