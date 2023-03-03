public static void cards ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) % 30 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int tmp = cards [ i % 5 ] ;
    cards [ i % 5 ] = cards [ i % 5 + 1 ] ;
    cards [ ( i % 5 ) + 1 ] = tmp ;
  }
}
