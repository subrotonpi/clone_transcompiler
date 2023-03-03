public static int pointnum = Integer . parseInt ( input ) {
  int [ ] points = new int [ pointnum ] ;
  for ( int i = 0 ;
  i < points . length ;
  i ++ ) {
    points [ i ] = i + 1 ;
  }
  ArrayList < Integer > dList = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < points . length ;
  i ++ ) {
    if ( i < points . length ) {
      System . out . println ( "? " + points [ 0 ] + " " + points [ i ] ) ;
      dList . add ( Integer . parseInt ( input ) ) ;
    }
  }
  return 0 ;
}
