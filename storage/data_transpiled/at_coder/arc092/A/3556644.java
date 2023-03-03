static final int [ ] [ ] getPoints ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> rs = new ArrayList < > ( ) ;
  List < List < Integer >> bs = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    rs . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  List < Point > points = new ArrayList < > ( ) ;
  for ( List < Integer > r : rs ) {
    points . add ( new Point ( r . get ( 0 ) , r . get ( 1 ) , Color . RED ) ) ;
  }
  for ( List < Integer > b : bs ) {
    points . add ( new Point ( b . get ( 0 ) , b . get ( 1 ) , Color . BLUE ) ) ;
  }
  Collections . sort ( points ) ;
  List < Point > rys = new ArrayList < > ( ) ;
  int cnt = 0 ;
  for ( Point p : points ) {
    if ( p . get ( 2 ) == Color . RED ) {
      Collections . sort ( rys ) ;
    }
    else {
      int idx = rys . indexOf ( p . get ( 1 ) ) - 1 ;
      if ( idx == - 1 ) {
        continue ;
      }
      else {
        rys . remove ( idx ) ;
        cnt ++ ;
      }
    }
  }
  System . out . println ( cnt ) ;
  return rys ;
}
