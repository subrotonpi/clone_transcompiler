static final int [ ] getPairs ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> ps = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ps . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  int g = 0 ;
  for ( int i = 0 ;
  i < N - 2 ;
  i ++ ) {
    List < Integer > p1 = ps . get ( i ) ;
    Iterator < Integer > it = ps . subList ( i + 1 , i ) . iterator ( ) ;
    while ( it . hasNext ( ) ) {
      List < Integer > p2 = it . next ( ) ;
      List < Integer > p3 = p2 . get ( i + 1 ) ;
      int s = Math . abs ( ( p1 . get ( 0 ) - p3 . get ( 0 ) ) * ( p2 . get ( 1 ) - p3 . get ( 1 ) ) - ( p2 . get ( 0 ) - p3 . get ( 0 ) ) * ( p1 . get ( 1 ) - p3 . get ( 1 ) ) ) ;
      if ( s % 2 == 0 && s != 0 ) g ++ ;
    }
  }
  System . out . println ( g ) ;
  return ps . toArray ( ) ;
}
