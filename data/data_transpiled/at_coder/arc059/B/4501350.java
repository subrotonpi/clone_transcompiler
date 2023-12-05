public static void input ( Scanner in ) {
  int flag = 0 ;
  for ( int i = 0 ;
  i < a . length ( ) - 1 ;
  i ++ ) {
    if ( flag == 0 ) {
      if ( a . charAt ( i ) == a . charAt ( i + 1 ) ) {
        System . out . println ( "" + ( i + 1 ) + " " + ( i + 2 ) ) ;
        flag = 1 ;
      }
      else if ( i + 2 != a . length ( ) && a . charAt ( i ) == a . charAt ( i + 2 ) ) {
        System . out . println ( "" + ( i + 1 ) + " " + ( i + 3 ) ) ;
        flag = 1 ;
      }
    }
  }
  if ( flag == 0 ) {
    System . out . println ( "-1 -1" ) ;
  }
}
