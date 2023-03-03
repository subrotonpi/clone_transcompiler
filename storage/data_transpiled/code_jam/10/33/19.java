static int i = 1 ;
HashMap < Integer , Integer > chess = new HashMap < Integer , Integer > ( ) ;
while ( i <= 512 ) {
  int res0 = 0 ;
  int res1 = 0 ;
  for ( int place = 0 ;
  place < i ;
  place ++ ) {
    if ( place % 2 == 0 ) {
      res0 += 2 * place ;
    }
    else {
      res1 += 2 * place ;
    }
  }
  chess . put ( i , new Integer ( res0 ) ) ;
  i ++ ;
}
{
  int count = 0 ;
  int lastx = M + 1 ;
  for ( int y = M - size + 1 ;
  y < N ;
  y ++ ) {
    for ( int x = 0 ;
    x < N - size + 1 ;
    x ++ ) {
      if ( ( isChessboard ( arr , used , x , y , size , N ) ) ) {
        setUsed ( used , x , y , size , N ) ;
        count ++ ;
        lastx = x ;
        lasty = y ;
        if ( ! counted ) {
          sizes ++ ;
        }
      }
    }
  }
  if ( ( count > 0 ) && ( results . size ( ) > 0 ) ) {
    results . add ( new Integer ( size ) ) ;
  }
  System . out . println ( "Case #" + ( t + 1 ) + ": " + sizes ) ;
  for ( int row = y ;
  row < N ;
  row ++ ) {
    if ( ( used [ row ] & ( Math . pow ( 2 , Integer . MAX_VALUE - x ) - 1 - ( Math . pow ( 2 , Integer . MAX_VALUE - x - size ) - 1 ) ) ) != 0 ) {
      return true ;
    }
  }
  return false ;
}
