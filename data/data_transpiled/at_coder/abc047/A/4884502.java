public static void print ( String a , String b , String c ) {
  int [ ] candy = new int [ 3 ] ;
  candy [ 0 ] = a ;
  candy [ 1 ] = b ;
  candy [ 2 ] = c ;
  Arrays . sort ( candy ) ;
  int maxCandy = candy [ 2 ] ;
  int middleCandy = candy [ 1 ] ;
  int minCandy = candy [ 0 ] ;
  if ( maxCandy == middleCandy + minCandy ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
