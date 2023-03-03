public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] city = new int [ M ] [ 2 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int P = Integer . parseInt ( input . nextLine ( ) ) ;
    int Y = Integer . parseInt ( input . nextLine ( ) ) ;
    city [ i ] [ 0 ] = P ;
    city [ i ] [ 1 ] = Y ;
    city [ i ] [ 2 ] = i ;
  }
  String [ ] id = new String [ M ] ;
  Arrays . sort ( city , new Comparator < int [ ] > ( ) {
    public int compare ( int [ ] o1 , int [ ] o2 ) {
      int prevP = 0 ;
      int count = 0 ;
      for ( int j = 0 ;
      j < o2 . length ;
      j ++ ) {
        if ( prevP == o1 [ j ] ) {
          count ++ ;
        }
        else {
          count = 1 ;
        }
        id [ o1 [ j ] ] = String . valueOf ( o1 [ j ] ) . replaceAll ( " " , "" ) + Integer . toString ( count ) . replaceAll ( " " , "" ) ;
        prevP = o1 [ j ] ;
      }
      return 0 ;
    }
  }
  ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    System . out . println ( id [ i ] ) ;
  }
  return M ;
}
