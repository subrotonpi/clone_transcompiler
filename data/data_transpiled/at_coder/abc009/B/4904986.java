public static void input ( ) {
  int n = input . nextInt ( ) ;
  int [ ] list = new int [ n ] ;
  for ( int i = 0 ;
  i < list . length ;
  i ++ ) {
    String temp = input . next ( ) ;
    list [ i ] = Integer . parseInt ( temp ) ;
  }
  Arrays . sort ( list ) ;
  for ( int i = 0 ;
  i < list . length ;
  i ++ ) {
    if ( list [ i ] == list [ i - 1 ] ) {
      continue ;
    }
    else {
      System . out . println ( list [ i - 1 ] ) ;
      break ;
    }
  }
}
