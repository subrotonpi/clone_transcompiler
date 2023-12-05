public static void print ( int N ) {
  int [ ] a = map . get ( N ) ;
  Set < Integer > colorSet = new HashSet < Integer > ( ) ;
  int originalCnt = 0 ;
  boolean redFlag = false ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int val = a [ i ] ;
    if ( val >= 3200 ) {
      originalCnt ++ ;
    }
    else {
      if ( val >= 2800 ) {
        redFlag = true ;
      }
      colorSet . add ( ( int ) ( val / 400 ) ) ;
    }
  }
  if ( redFlag == true ) {
    System . out . println ( colorSet . size ( ) + " " + ( colorSet . size ( ) + originalCnt ) ) ;
  }
  else {
    if ( originalCnt > 0 ) {
      System . out . println ( colorSet . size ( ) + 1 + " " + ( colorSet . size ( ) + originalCnt ) ) ;
    }
    else {
      System . out . println ( colorSet . size ( ) + " " + colorSet . size ( ) ) ;
    }
  }
}
