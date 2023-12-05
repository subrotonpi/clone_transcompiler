public static int N = Integer . parseInt ( input ) {
  Stack < Integer > L = new Stack < > ( ) ;
  for ( int n : Arrays . asList ( input . split ( " " ) ) ) {
    L . push ( n ) ;
  }
  Collections . sort ( L ) ;
  int SUM = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = L . pop ( ) ;
    int y = L . pop ( ) ;
    if ( x < y ) {
      SUM = SUM + x ;
    }
    else if ( x >= y ) {
      SUM = SUM + y ;
    }
  }
  System . out . println ( SUM ) ;
  return SUM ;
}
