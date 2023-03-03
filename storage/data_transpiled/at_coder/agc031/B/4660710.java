public static int [ ] getDayList ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List l = new ArrayList ( ) ;
  int [ ] l_value = new int [ N ] ;
  int i = 0 ;
  int stack = - 1 ;
  for ( i = 0 ;
  i < N ;
  i ++ ) {
    if ( i < N ) {
      l . add ( input . nextInt ( ) ) ;
    }
  }
  List listSimple = new ArrayList ( ) ;
  for ( i = 0 ;
  i < l . size ( ) ;
  i ++ ) {
    if ( stack != i ) {
      listSimple . add ( l . get ( i ) ) ;
    }
    stack = i ;
  }
  return listSimple . toArray ( ) ;
}
