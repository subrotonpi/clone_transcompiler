public static void print ( int n ) {
  int len = n ;
  StringBuilder sb = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    sb . append ( input . nextInt ( ) ) ;
  }
  int left = 0 ;
  int right = 0 ;
  int i = 0 ;
  while ( i < len ) {
    if ( sb . charAt ( i ) == '(' ) {
      left ++ ;
    }
    else {
      right ++ ;
    }
    if ( left < right ) {
      sb . insert ( 0 , '(' ) ;
      left ++ ;
      i ++ ;
    }
    i ++ ;
  }
  for ( ;
  i < left - right ;
  i ++ ) {
    sb . append ( ')' ) ;
  }
  for ( ;
  i < len ;
  i ++ ) {
    if ( i != len - 1 ) {
      System . out . print ( sb . charAt ( i ) ) ;
    }
    else {
      System . out . println ( sb . charAt ( i ) ) ;
    }
  }
}
