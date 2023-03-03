public static String calc ( int n ) {
  String s = "b" ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    switch ( i % 3 ) {
      case 1 : s = "a" + s + "c" ;
      break ;
      case 2 : s = "c" + s + "a" ;
      break ;
      default : s = "b" + s + "b" ;
      break ;
    }
  }
  return s ;
}
