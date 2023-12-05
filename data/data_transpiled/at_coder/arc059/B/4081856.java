public static String input ( ) {
  String S = input ( ) ;
  String one = S . substring ( 0 , 1 ) ;
  String two = S . substring ( 1 , 2 ) ;
  String ans = "-1 -1" ;
  int l = S . length ( ) ;
  for ( int i = 2 ;
  i < l ;
  i ++ ) {
    String s = S . substring ( i ) ;
    if ( s . equals ( one ) ) {
      ans = Integer . toString ( i - 1 ) + " " + Integer . toString ( i + 1 ) ;
      break ;
    }
    else if ( s . equals ( two ) ) {
      ans = Integer . toString ( i ) ;
      break ;
    }
    one = two ;
    two = s ;
  }
  if ( l == 2 ) {
    if ( one . equals ( two ) ) {
      ans = "1 2" ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
