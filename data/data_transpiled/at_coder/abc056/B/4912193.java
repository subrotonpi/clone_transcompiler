public static int W ( int a , int b ) {
  if ( Math . abs ( a - b ) <= W ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( Math . abs ( a - b ) - W ) ;
  }
  return a ;
}
