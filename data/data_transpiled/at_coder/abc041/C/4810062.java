public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] a = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] [ 0 ] = i + 1 ;
    a [ i ] [ 1 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( a , Collections . reverseOrder ( ) ) ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    System . out . println ( a [ i ] [ 0 ] ) ;
  }
  return a . length ;
}
