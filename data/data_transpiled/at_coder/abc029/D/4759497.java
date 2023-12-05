input ;
int [ ] [ ] memo = new int [ 2 ] [ 2 ] ;
for ( int i = 0 ;
i < memo . length ;
i ++ ) memo [ i ] [ 0 ] = null ;
for ( int i = 0 ;
i < memo . length ;
i ++ ) memo [ i ] [ 0 ] = memo [ i ] [ threshold ] [ i ] ;
/* record the threshold */
if ( i == memo . length ) return memo [ i ] [ threshold ] [ i ] ;
int ret = 0 ;
int limit = threshold == 1 ? Integer . parseInt ( n [ i ] ) : 9 ;
for ( int j = 0 ;
j < limit + 1 ;
j ++ ) {
  int nexThreshold = ( j == limit && threshold == 1 ) ? 1 : 0 ;
  if ( j == 1 ) ret += rec ( i + 1 , nexThreshold , s + 1 ) ;
  else ret += rec ( i + 1 , nexThreshold , s ) ;
  memo [ i ] [ threshold ] [ i ] = ret ;
}
System . out . println ( rec ( 0 , 1 , 0 ) ) ;
}
