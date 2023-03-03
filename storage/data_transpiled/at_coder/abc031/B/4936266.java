public static int [ ] getDistance ( String input ) {
  int l = Integer . parseInt ( input . nextLine ( ) ) ;
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ Integer . parseInt ( input . nextLine ( ) ) ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    if ( a [ i ] > h ) {
      System . out . println ( - 1 ) ;
    }
    else {
      System . out . println ( Math . max ( 0 , l - a [ i ] ) ) ;
    }
  }
  return a ;
}
