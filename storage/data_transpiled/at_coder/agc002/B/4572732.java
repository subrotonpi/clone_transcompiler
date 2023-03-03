public static int N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > items = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    items . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  boolean [ ] red = new boolean [ N ] ;
  int [ ] box = new int [ N ] ;
  Arrays . fill ( box , 1 ) ;
  red [ 0 ] = true ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int x = items . get ( i ) ;
    x = x - 1 ;
    y = y - 1 ;
    if ( box [ x ] && red [ x ] ) red [ y ] = true ;
    if ( box [ x ] == 1 && red [ x ] ) red [ x ] = false ;
    box [ x ] -- ;
    box [ y ] ++ ;
  }
  System . out . println ( red . count ( true ) ) ;
  return 0 ;
}
