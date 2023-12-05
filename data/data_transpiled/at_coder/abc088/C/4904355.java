public static void main ( String [ ] input ) {
  int c1 = Integer . parseInt ( input [ 0 ] ) ;
  int c2 = Integer . parseInt ( input [ 1 ] ) ;
  int c3 = Integer . parseInt ( input [ 2 ] ) ;
  String answer = "No" ;
  for ( int i = 0 ;
  i < 101 ;
  i ++ ) {
    int a1 = i ;
    int b1 = c1 [ 0 ] - a1 ;
    int b2 = c1 [ 1 ] - a1 ;
    int b3 = c1 [ 2 ] - a1 ;
    int a2 = c2 [ 0 ] - b1 ;
    int a3 = c3 [ 0 ] - b1 ;
    int c2_2 = a2 + b2 ;
    int c2_3 = a2 + b3 ;
    int c3_2 = a3 + b2 ;
    int c3_3 = a3 + b3 ;
    if ( c2_2 == c2 [ 1 ] && c2_3 == c2 [ 2 ] && c3_2 == c3 [ 1 ] && c3_3 == c3 [ 2 ] ) {
      answer = "Yes" ;
      break ;
    }
  }
  System . out . println ( answer ) ;
}
