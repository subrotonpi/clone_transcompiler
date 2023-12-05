public static String win ( int n , int a , int b ) {
  if ( n == 2 ) {
    win = "Borys" ;
  }
  else {
    if ( Math . abs ( a - b ) % 2 == 0 ) {
      win = "Alice" ;
    }
    else {
      win = "Borys" ;
    }
  }
  System . out . println ( win ) ;
  return win ;
}
