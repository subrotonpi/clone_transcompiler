public static boolean c ( int p , int g , int [ ] lis ) {
  for ( int e : lis ) {
    if ( p <= g ) {
      p += e ;
    }
    else {
      p -= e ;
    }
  }
  return p == g ;
}
if ( getClass ( ) . isEnum ( ) ) {
  String s = input . next ( ) ;
  int gx = Integer . parseInt ( input . next ( ) ) ;
  int gy = Integer . parseInt ( input . next ( ) ) ;
  StringTokenizer st = new StringTokenizer ( s , "T" ) ;
  int len = st . countTokens ( ) ;
  int [ ] xMove = new int [ len ] ;
  int [ ] yMove = new int [ len ] ;
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    xMove [ i ] = st . nextToken ( ) ;
    yMove [ i ] = st . nextToken ( ) ;
  }
  int x = xMove [ 0 ] ;
  int y = 0 ;
  Arrays . sort ( xMove , Collections . reverseOrder ( ) ) ;
  Arrays . sort ( yMove , Collections . reverseOrder ( ) ) ;
  if ( c ( x , gx , xMove ) && c ( y , gy , yMove ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return false ;
}
