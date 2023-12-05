public static int [ ] [ ] input ( ) {
  int [ ] X = list ( input ) ;
  int qNum = X [ 0 ] . length ;
  int aNum = 0 ;
  int cNum = X [ 1 ] . length ;
  int leftQNum = 0 ;
  int rightQNum = qNum ;
  int ans = 0 ;
  int lenX = X . length ;
  int [ ] [ ] qMap ;
  int bAns = 0 ;
  int qAns = 0 ;
  qMap = new HashMap < > ( ) ;
  qMap . put ( qNum - 1 , ( 3 * ( qNum - 1 ) ) % ( 10 * 9 + 7 ) ) ;
  qMap . put ( qNum - 2 , ( 3 * ( qNum - 2 ) ) % ( 10 * 9 + 7 ) ) ;
  qMap . put ( qNum - 3 , ( 3 * ( qNum - 3 ) ) % ( 10 * 9 + 7 ) ) ;
  qMap . put ( qNum , ( 3 * ( qNum ) ) % ( 10 * 9 + 7 ) ) ;
  if ( X [ 0 ] . equals ( "?" ) ) {
    rightQNum -- ;
  }
  else if ( X [ 0 ] . equals ( "C" ) ) {
    cNum -- ;
  }
  for ( int i = 0 ;
  i < X . length ;
  i ++ ) {
    if ( X [ i ] . equals ( "B" ) || X [ i ] . equals ( "?" ) ) {
      ans += ( aNum * cNum ) * ( qMap [ ( leftQNum + rightQNum ) ] ) ;
      if ( leftQNum + rightQNum >= 2 ) {
        ans += ( rightQNum * leftQNum + 3 * ( leftQNum * cNum ) + 3 * ( rightQNum * aNum ) ) * ( qMap [ ( leftQNum + rightQNum - 2 ) ] ) ;
      }
      else if ( leftQNum + rightQNum == 1 ) {
        ans += ( ( leftQNum * cNum ) + ( rightQNum * aNum ) ) * ( qMap [ ( leftQNum + rightQNum - 1 ) ] ) ;
      }
      ans = ans % ( 10 * 9 + 7 ) ;
    }
    if ( i == lenX - 1 ) {
      break ;
    }
    if ( X [ i ] . equals ( "A" ) ) {
      aNum ++ ;
    }
    else if ( X [ i