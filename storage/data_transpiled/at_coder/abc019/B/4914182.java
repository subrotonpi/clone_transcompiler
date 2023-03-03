public static String print ( String s ) {
  s = list ( input ) ;
  StringBuffer ans = new StringBuffer ( ) ;
  int i = 0 ;
  while ( i < s . length ( ) ) {
    int j = i + 1 ;
    while ( j < s . length ( ) ) {
      if ( s . charAt ( j ) != s . charAt ( j - 1 ) ) break ;
      j ++ ;
    }
    else {
      ans . append ( s . charAt ( i ) ) ;
      ans . append ( s . charAt ( j - i ) ) ;
      System . out . println ( ans ) ;
      exit ( ) ;
    }
    ans . append ( s . charAt ( i ) ) ;
    ans . append ( s . charAt ( j - i ) ) ;
    i = j ;
  }
  return ans . toString ( ) ;
}
