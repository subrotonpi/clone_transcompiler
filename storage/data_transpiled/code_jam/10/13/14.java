static boolean isWin ( int a , int b ) {
  if ( a < b ) {
    int temp = a ;
    a = b ;
    b = temp ;
  }
  boolean myTurn = true ;
  do {
    if ( a == b ) return ! myTurn ;
    if ( a >= ( 2 * b ) ) return myTurn ;
    myTurn = ! myTurn ;
    int temp = a - b ;
    a = b ;
    b = temp ;
  }
  while ( true ) ;
  return myTurn ;
}
