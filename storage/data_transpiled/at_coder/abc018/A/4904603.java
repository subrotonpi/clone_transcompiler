public static int [ ] ls ( ) {
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    ls [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Map < Integer , Integer > rank = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < ls . length ;
  i ++ ) {
    if ( ls [ i ] == Math . max ( ls [ i ] ) ) {
      rank . put ( i , 1 ) ;
    }
    else if ( ls [ i ] == Math . min ( ls [ i ] ) ) {
      rank . put ( i , 3 ) ;
    }
    else {
      rank . put ( i , 2 ) ;
    }
  }
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    System . out . println ( rank . get ( i ) ) ;
  }
  return ls . values ( ) ;
}
