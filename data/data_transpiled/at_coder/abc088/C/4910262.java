public static void main ( String [ ] args ) {
  int c1 = Integer . parseInt ( input . nextLine ( ) ) ;
  int c2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int c3 = Integer . parseInt ( input . nextLine ( ) ) ;
  String flag = "No" ;
  for ( int i = 0 ;
  i < c1 [ 0 ] + 1 ;
  i ++ ) {
    int a1 = i ;
    int b1 = c1 [ 0 ] - a1 ;
    int b2 = c1 [ 1 ] - a1 ;
    int b3 = c1 [ 2 ] - a1 ;
    int a2 = c2 [ 0 ] - b1 ;
    int a3 = c3 [ 0 ] - b1 ;
    int c22 = a2 + b2 ;
    int c23 = a2 + b3 ;
    int c32 = a3 + b2 ;
    int c33 = a3 + b3 ;
    if ( ( c2 [ 1 ] - c22 ) * ( c2 [ 2 ] - c23 ) * ( c3 [ 1 ] - c32 ) * ( c3 [ 2 ] - c33 ) * ( c3 [ 2 ] - c33 ) == 0 ) {
      flag = "Yes" ;
    }
  }
  System . out . println ( flag ) ;
}
