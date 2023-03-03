public static int N = Integer . parseInt ( input . nextLine ( ) ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> ab = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    ab . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int [ ] [ ] count = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( List < Integer > road : ab ) {
      count [ road . get ( 0 ) - 1 ] [ road . get ( 1 ) - 1 ] ++ ;
      count [ road . get ( 1 ) - 1 ] [ road . get ( 0 ) - 1 ] ++ ;
    }
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( Arrays . toString ( count [ i ] ) ) ;
  }
  return N ;
}
