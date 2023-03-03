public static int [ ] [ ] s , t , q = Integer . parseInt ( input ) {
  int ssum [ ] = new int [ s . length ] , tsum [ ] = new int [ t . length ] ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) if ( s [ i ] == 'A' ) ssum [ i ] = ssum [ ssum . length - 1 ] + 1 ;
  else ssum [ i ] = ssum [ i ] + 2 ;
  for ( int i = 0 ;
  i < t . length ;
  i ++ ) if ( t [ i ] == 'A' ) tsum [ i ] = tsum [ tsum . length - 1 ] + 1 ;
  else tsum [ i ] = tsum [ tsum . length - 1 ] + 2 ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    int d = Integer . parseInt ( input . nextLine ( ) ) ;
    int sa = ( ssum [ b ] - ssum [ a - 1 ] ) - ( tsum [ d ] - tsum [ c - 1 ] ) ;
    if ( Math . abs ( sa ) % 3 == 0 ) System . out . println ( "YES" ) ;
    else System . out . println ( "NO" ) ;
  }
  return ssum ;
}
