public static int mod = 10 * * 9 + 7 ;
String S = input . nextLine ( ) ;
int [ ] [ ] dp = new int [ S . length ( ) + 1 ] [ 4 ] ;
dp [ 0 ] [ 0 ] = 1 ;
for ( int i = 0 ;
i < S . length ( ) ;
i ++ ) {
  for ( int j = 0 ;
  j < 4 ;
  j ++ ) {
    if ( S . charAt ( i ) == '?' ) {
      dp [ i + 1 ] [ j ] = dp [ i ] [ j ] * 3 % mod ;
    }
    else {
      dp [ i + 1 ] [ j ] = dp [ i ] [ j ] ;
    }
  }
  if ( S . charAt ( i ) == 'A' || S . charAt ( i ) == '?' ) {
    dp [ i + 1 ] [ 1 ] += dp [ i ] [ 0 ] ;
  }
  if ( S . charAt ( i ) == 'B' || S . charAt ( i ) == '?' ) {
    dp [ i + 1 ] [ 2 ] += dp [ i ] [ 1 ] ;
  }
  if ( S . charAt ( i ) == 'C' || S . charAt ( i ) == '?' ) {
    dp [ i + 1 ] [ 3 ] += dp [ i ] [ 2 ] ;
  }
}
System . out . println ( dp [ S . length ( ) ] [ 3 ] % mod ) ;
return dp [ S . length ( ) ] [ 3 ] ;
}
