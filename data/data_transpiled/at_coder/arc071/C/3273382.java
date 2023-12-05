input ;
s = input . next ( ) ;
t = input . next ( ) ;
q = Integer . parseInt ( input . next ( ) ) ;
sl = s . length ( ) , tl = t . length ( ) ;
int sa [ ] = 0 , sb [ ] = 0 , ta [ ] = 0 , tb [ ] = 0 ;
for ( int i = 0 ;
i < sl ;
i ++ ) {
  if ( s [ i ] == 'A' ) sa [ i + 1 ] = sa [ i ] + 1 ;
  else sa [ i + 1 ] = sa [ i ] ;
  sb [ i + 1 ] = sb [ i ] ;
}
for ( int i = 0 ;
i < tl ;
i ++ ) {
  if ( t [ i ] == 'A' ) ta [ i + 1 ] = ta [ i ] + 1 ;
  else ta [ i + 1 ] = ta [ i ] ;
  else tb [ i + 1 ] = tb [ i ] ;
}
for ( ;
;
) {
  int a = ( Integer . parseInt ( input . next ( ) ) ) ;
  int b = ( Integer . parseInt ( input . next ( ) ) ) ;
  int c = ( Integer . parseInt ( input . next ( ) ) ) ;
  int d = ( Integer . parseInt ( input . next ( ) ) ) ;
  if ( ( sa [ b ] - sa [ a - 1 ] - sb [ b ] + sb [ a - 1 ] - ta [ d ] + ta [ c - 1 ] + tb [ d ] - tb [ c - 1 ] ) % 3 == 0 ) System . out . println ( "NO" ) ;
  else System . out . println ( "YES" ) ;
}
}
