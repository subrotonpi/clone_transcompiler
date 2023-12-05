public static int [ ] inpl ( ) {
  return Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] X = inpl ( ) ;
  int [ ] Y = new int [ N ] ;
  Arrays . sort ( X ) ;
  int a = Y [ N / 2 - 1 ] ;
  int b = Y [ N / 2 ] ;
  for ( int i = 0 ;
  i < X . length ;
  i ++ ) {
    if ( X [ i ] <= a ) {
      System . out . println ( b ) ;
    }
    else {
      System . out . println ( a ) ;
    }
  }
  return X ;
}
