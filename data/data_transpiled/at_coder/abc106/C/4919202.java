public static void input ( ) {
  S = input . nextLine ( ) ;
  K = Integer . parseInt ( input . nextLine ( ) ) ;
  int count1 = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) == '1' ) {
      count1 ++ ;
      if ( K == count1 ) {
        System . out . println ( S . charAt ( i ) ) ;
        quit ( ) ;
      }
    }
    else {
      System . out . println ( S . charAt ( i ) ) ;
      quit ( ) ;
    }
  }
}
