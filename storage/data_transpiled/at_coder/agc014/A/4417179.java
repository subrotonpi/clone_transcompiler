public static void cookie ( List < Integer > list ) {
  list . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  Collections . sort ( list ) ;
  int count = 0 ;
  if ( list . get ( 0 ) == list . get ( 2 ) && list . get ( 0 ) % 2 == 0 ) {
    System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  while ( list . get ( 2 ) - list . get ( 0 ) > 0 ) {
    if ( list . get ( 0 ) % 2 == 1 || list . get ( 1 ) % 2 == 1 || list . get ( 2 ) % 2 == 1 ) {
      System . out . println ( count ) ;
      exit ( ) ;
    }
    if ( list . get ( 0 ) == list . get ( 2 ) ) {
      System . out . println ( - 1 ) ;
      exit ( ) ;
    }
    count ++ ;
    int a = ( list . get ( 1 ) + list . get ( 2 ) ) / 2 ;
    int b = ( list . get ( 2 ) + list . get ( 0 ) ) / 2 ;
    int c = ( list . get ( 2 ) + list . get ( 0 ) ) / 2 ;
    list . set ( 0 , a ) ;
    list . set ( 1 , b ) ;
    list . set ( 2 , c ) ;
    list . set ( 2 , c ) ;
  }
  System . out . println ( count ) ;
}
