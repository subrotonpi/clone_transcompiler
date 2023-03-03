public static void print ( int n ) {
  int [ ] nums = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    nums [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  ArrayList < Integer > operation = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < nums . length ;
    j ++ ) {
      if ( nums [ nums . length - j - 1 ] == nums . length - j ) {
        operation . add ( nums [ nums . length - j - 1 ] ) ;
        -- j ;
        break ;
      }
    }
  }
  if ( nums . length == 0 ) {
    for ( int elem : new ArrayList < > ( operation ) ) {
      System . out . println ( elem ) ;
    }
  }
  else {
    System . out . println ( - 1 ) ;
  }
}
