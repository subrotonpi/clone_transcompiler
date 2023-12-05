public static void print ( String input ) {
  int a = Integer . parseInt ( input . substring ( 0 , 1 ) ) ;
  int b = Integer . parseInt ( input . substring ( 1 , 2 ) ) ;
  char [ ] ar = new char [ a ] ;
  int i = 0 ;
  int count = 0 ;
  while ( ar . length != 0 ) {
    int c ;
    if ( i + b >= a ) {
      c = a ;
    }
    else {
      c = i + b ;
    }
    if ( ar [ i ] == '.' ) {
      for ( int j = i ;
      j < c ;
      j ++ ) {
        ar [ j ] = 'o' ;
      }
      count ++ ;
    }
    else {
      i ++ ;
      count ++ ;
    }
  }
  System . out . println ( count ) ;
}
