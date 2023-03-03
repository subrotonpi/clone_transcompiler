public static int sumbc = 0 ;
int [ ] b = new int [ 3 ] ;
for ( int i = 0 ;
i < 2 ;
i ++ ) {
  int [ ] vals = map . get ( input . nextLine ( ) ) . split ( " " ) ;
  for ( int val : vals ) {
    b [ i ] = val ;
    sumbc += val ;
  }
}
int [ ] c = new int [ 3 ] ;
for ( int i = 0 ;
i < 3 ;
i ++ ) {
  int [ ] vals = map . get ( input . nextLine ( ) ) . split ( " " ) ;
  for ( int val : vals ) {
    c [ i ] = val ;
    sumbc += val ;
  }
}
final int [ ] memo = new int [ 3 * 9 ] ;
/* idx */
for ( int i = 0 ;
i < 3 ;
i ++ ) {
  int vi = Integer . parseInt ( input . nextLine ( ) ) ;
}
/* play the turn */
int [ ] [ ] rets = new int [ 9 ] [ 9 ] ;
for ( int i = 0 ;
i < 9 ;
i ++ ) {
  int idxTmp = idx [ i ] ;
  if ( memo [ idxTmp ] != 0 ) return memo [ idxTmp ] ;
}
if ( turn >= 9 ) {
  int ret = 0 ;
  for ( int i = 0 ;
  i < 2 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) {
      if ( field [ 3 * i + j ] == field [ 3 * ( i + 1 ) + j ] ) ret += b [ 3 * i + j ] ;
      else ret -= b [ 3 * i + j ] ;
    }
  }
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 2 ;
    j ++ ) {
      if ( field [ 3 * i + j ] == field [ 3 * i + ( j + 1 ) ] ) ret += c [ 2 * i + j ] ;
      else ret -= c [ 2 * i + j ] ;
    }
  }
}
else {
  int [ ] rets = new int [ 9 ] ;
  for ( int i = 0 ;
  i < 9 ;
  i ++ ) {
    if ( rets [ i ] > 0 ) continue ;
    if ( turn % 2 ) {
      int [ ] fieldTmp = new int [ 3 ] ;
      fieldTmp [ i ] = 2 ;
      rets [ i