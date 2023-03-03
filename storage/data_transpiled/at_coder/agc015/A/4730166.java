public static int n ( int n , int a , int b ) {
  if ( b < a ) {
    System . out . println ( 0 ) ;
  }
  else if ( n == 1 ) {
    if ( a == b ) {
      System . out . println ( 1 ) ;
    }
    else {
      System . out . println ( 0 ) ;
    }
  }
  else {
    System . out . println ( a + b * ( n - 1 ) - ( a * ( n - 1 ) + b ) + 1 ) ;
  }
  return a + b ;
}
