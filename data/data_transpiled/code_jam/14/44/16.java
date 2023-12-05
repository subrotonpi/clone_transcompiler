static final int MOD = 10 * 9 + 7 ;
{
  return Integer . parseInt ( readLine ( ) . trim ( ) ) ;
}
private static int pre ( String a , String b ) {
  int s = 0 ;
  int z = Math . min ( a . length ( ) , b . length ( ) ) ;
  while ( s < z && a . charAt ( s ) == b . charAt ( s ) ) s ++ ;
  return s ;
}
private static void solve ( ) {
  int m = readLine ( ) ;
  int n = readLine ( ) ;
  s = new int [ n ] ;
  for ( int i = 0 ;
  i < xrange ( m ) ;
  i ++ ) s [ i ] = readLine ( ) . trim ( ) ;
  int r [ ] = {
    0 , 0 }
    ;
    {
      if ( ! Arrays . equals ( b , s ) ) return ;
      int nn = 0 ;
      for ( String s : b ) {
        nn ++ ;
        Collections . sort ( s ) ;
        String last = "" ;
        for ( String w : s ) {
          nn += w . length ( ) - pre ( w , last ) ;
          last = w ;
        }
      }
      if ( nn > r [ 0 ] ) {
        r [ 0 ] = nn ;
        r [ 1 ] = 1 ;
      }
      else if ( nn == r [ 0 ] ) r [ 1 ] ++ ;
    }
    {
      {
        if ( s . length ( ) == 0 ) {
          test ( b ) ;
          return ;
        }
        for ( int i = 0 ;
        i < xrange ( b . length ( ) ) ;
        i ++ ) {
          String [ ] bb = new String [ s . length ( ) ] ;
          System . arraycopy ( s , 0 , bb , 0 , s . length ( ) ) ;
          bb [ s . length ( ) ] = bb [ i ] . concat ( s [ 0 ] ) ;
          rec ( s , new String [ s . length ( ) ] , bb ) ;
        }
      }
    }
    {
      rec ( s , new String [ xrange ( n ) ] ) ;
    }
  }
  