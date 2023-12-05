public static int N = Integer . parseInt ( input ) {
  int [ ] a = Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int [ ] [ ] num = new int [ a . length ] [ ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    num [ i ] [ 0 ] = i ;
  }
  Arrays . sort ( num , new Comparator < int [ ] > ( ) {
    @ Override public int compare ( int [ ] o1 , int [ ] o2 ) {
      return - o1 [ 1 ] ;
    }
  }
  ) ;
  for ( int i = 0 ;
  i < num . length ;
  i ++ ) {
    System . out . println ( num [ i ] [ 0 ] ) ;
  }
  return num [ 0 ] [ 0 ] ;
}
