public static void main ( String input ) {
  int h = Integer . parseInt ( input . split ( " " ) [ 0 ] ) , k = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  List < String > mat = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    mat . add ( input . split ( " " ) [ 0 ] ) ;
  }
  for ( int i = 0 ;
  i < 2 ;
  i ++ ) {
    List < Integer > popList = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < mat . size ( ) ;
    i ++ ) {
      for ( int x = 0 ;
      x < mat . get ( i ) ;
      x ++ ) {
        if ( mat . get ( i ) . equals ( "#" ) ) {
          break ;
        }
      }
      else {
        popList . add ( i ) ;
      }
    }
    Collections . reverse ( popList ) ;
    for ( int i : popList ) {
      mat . remove ( i ) ;
    }
    popList . clear ( ) ;
    mat . clear ( ) ;
    mat . add ( mat . get ( i ) ) ;
  }
  for ( String row : mat ) {
    System . out . println ( StringUtils . join ( row ) ) ;
  }
}
