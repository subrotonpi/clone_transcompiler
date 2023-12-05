public static String [ ] [ ] getStrings ( ) {
  int h = Integer . parseInt ( input . readLine ( ) ) ;
  int w = Integer . parseInt ( input . readLine ( ) ) ;
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int [ ] l = new int [ h ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < a [ i ] ;
    j ++ ) {
      l [ i ] = a [ i ] + 1 ;
    }
  }
  String [ ] [ ] ans = new String [ h ] [ h ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    if ( i % 2 == 1 ) {
      String [ ] array = Arrays . copyOfRange ( l , i * w , ( i + 1 ) * w ) ;
      ans [ i ] = array . clone ( ) ;
    }
    else {
      ans [ i ] = Arrays . copyOfRange ( l , i * w , ( i + 1 ) * w ) ;
    }
  }
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    System . out . println ( ( String [ ] [ ] ) ans [ i ] ) ;
  }
  return ans ;
}
