public static int solution ( int num , List < Integer > list ) {
  String flag = "default" ;
  int count = 1 ;
  for ( int i = 0 ;
  i < num - 1 ;
  i ++ ) {
    int diff = l . get ( i + 1 ) - l . get ( i ) ;
    if ( flag . equals ( "plus" ) ) {
      if ( diff < 0 ) {
        flag = "default" ;
        count ++ ;
      }
    }
    else if ( flag . equals ( "minus" ) ) {
      if ( diff > 0 ) {
        flag = "default" ;
        count ++ ;
      }
    }
    else {
      if ( diff > 0 ) {
        flag = "plus" ;
      }
      else if ( diff < 0 ) {
        flag = "minus" ;
      }
    }
  }
  return count ;
}
if ( getClass ( ) . isEnum ( ) ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > l = list . stream ( ) . map ( Integer :: parseInt ) . collect ( Collectors . toList ( ) ) ;
  System . out . println ( solution ( n , l ) ) ;
}
