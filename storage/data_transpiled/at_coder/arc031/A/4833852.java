public static void input ( String name ) {
  int count = 0 ;
  for ( String s : name . toCharArray ( ) ) {
    if ( s == name . charAt ( name . length ( ) - 1 - count ) ) {
      count ++ ;
    }
    else {
      System . out . println ( "NO" ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "YES" ) ;
}
