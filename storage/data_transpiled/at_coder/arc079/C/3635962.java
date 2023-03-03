public static int [ ] inpl ( ) {
  return Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = inpl ( ) ;
  int [ ] a1 = a ;
  int [ ] c = new int [ N ] ;
  while ( c != a . length ) {
    c = a [ 0 ] ;
  }
  return a ;
}
