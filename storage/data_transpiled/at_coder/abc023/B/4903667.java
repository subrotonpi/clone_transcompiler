public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  String S = input ;
  String s = "b" ;
  int res = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . equals ( S ) ) {
      System . out . println ( n / 2 ) ;
      break ;
    }
    s = new String [ ] {
      "b" , "a" , "c" }
      [ ( i + 1 ) % 3 ] + s + new String [ ] {
        "b" , "c" , "a" }
        [ ( i + 1 ) % 3 ] ;
        res ++ ;
      }
      else {
        System . out . println ( - 1 ) ;
      }
    }
    