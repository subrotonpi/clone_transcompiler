public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] TOT = new int [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    List = new ArrayList < Integer > ( ) ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      List . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    }
    List . remove ( 0 ) ;
    int [ ] List_N = new int [ M ] ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      if ( List . contains ( j + 1 ) ) List_N [ j ] = 1 ;
      else List_N [ j ] = 0 ;
    }
    int [ ] TOTAL = new int [ M ] ;
    for ( int k = 0 ;
    k < M ;
    k ++ ) {
      TOTAL [ k ] = TOT [ k ] + List_N [ k ] ;
    }
    TOT = TOTAL ;
  }
  System . out . println ( TOT . length / N ) ;
  return TOT ;
}
