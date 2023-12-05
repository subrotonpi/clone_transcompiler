public static void print ( int [ ] a ) {
  int i = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = 0 ;
  int c = a [ 3 ] ;
  for ( i = 0 ;
  i < a [ 0 ] ;
  i ++ ) {
    int k = ( c - b ) / a [ 1 ] ;
    b = c ;
    c += k * a [ 2 ] ;
  }
  System . out . println ( c - b ) ;
}
