static void initLoop ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int [ ] [ ] mat = new int [ 4 ] [ 4 ] ;
  for ( int i = 0 ;
  i < mat . length ;
  i ++ ) {
    final List < Integer > l = Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    for ( int j = 0 ;
    j < 4 ;
    j ++ ) {
      mat [ i ] [ j ] = l . get ( j ) ;
    }
  }
  boolean f = false ;
  for ( int i = 0 ;
  i < mat . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < mat [ i ] . length ;
    j ++ ) {
      if ( mat [ i ] [ j ] == mat [ i ] [ j + 1 ] ) {
        f = true ;
        break ;
      }
    }
  }
  if ( ! f ) {
    for ( int i = 0 ;
    i < mat . length ;
    i ++ ) {
      for ( int j = 0 ;
      j < mat [ i ] . length ;
      j ++ ) {
        if ( mat [ j ] [ i ] == mat [ j + 1 ] [ i ] ) {
          f = true ;
          break ;
        }
      }
    }
  }
  if ( f ) {
    System . out . println ( "CONTINUE" ) ;
  }
  else {
    System . out . println ( "GAMEOVER" ) ;
  }
}
