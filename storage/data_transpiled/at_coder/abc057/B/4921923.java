public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> st = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) st . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  List < Integer > ch = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) ch . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  for ( List < Integer > s : st ) {
    int Min = 1000000000 ;
    int Mindex = - 1 ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      if ( Math . abs ( ch . get ( i ) . x - s . x ) + Math . abs ( ch . get ( i ) . y - s . y ) < Min ) {
        Min = Math . abs ( ch . get ( i ) . x - s . x ) + Math . abs ( ch . get ( i ) . y - s . y ) ;
        Mindex = i + 1 ;
      }
    }
    System . out . println ( Mindex ) ;
  }
  return Mindex ;
}
