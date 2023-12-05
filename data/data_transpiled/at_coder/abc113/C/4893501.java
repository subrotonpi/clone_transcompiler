public static int N ( Scanner input ) {
  int M = input . nextInt ( ) ;
  List < Integer > pyList = new ArrayList < > ( ) ;
  Map < Integer , Integer > map = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int p = input . nextInt ( ) ;
    int y = input . nextInt ( ) ;
    pyList . add ( p ) ;
    pyList . add ( y ) ;
  }
  List < Integer > pySorted = new ArrayList < > ( pyList ) ;
  int pTemp = pySorted . get ( 0 ) . intValue ( ) ;
  int count = 1 ;
  for ( int i = 0 ;
  i < pySorted . size ( ) ;
  i ++ ) {
    int p = pySorted . get ( i ) . intValue ( ) ;
    int y = pySorted . get ( i ) . intValue ( ) ;
    if ( pTemp != p ) {
      pTemp = p ;
      count = 1 ;
    }
    map . put ( new Integer ( p ) , count ) ;
    count ++ ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    Integer s = map . get ( new Integer ( pyList . get ( i ) . intValue ( ) ) ) ;
    s = s . toString ( ) ;
    String ss = String . valueOf ( pyList . get ( i ) . intValue ( ) ) . replaceAll ( " " , "" ) + s . replaceAll ( " " , "" ) ;
    System . out . println ( ss . trim ( ) ) ;
  }
  return M ;
}
