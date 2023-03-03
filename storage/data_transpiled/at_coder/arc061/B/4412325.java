public static void f ( ) {
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] c = new int [ 9 ] ;
  int [ ] d = new int [ 9 ] ;
  while ( n -- > 0 ) {
    int x = f . nextInt ( ) ;
    int y = f . nextInt ( ) ;
    for ( int i = 0 ;
    i < 9 ;
    i ++ ) {
      int a = x + i % 3 ;
      int a = y + i / 3 ;
      if ( h >= a > 2 && h < a && a <= w ) t = d [ a ] = d [ a ] + 1 ;
      c [ t - 1 ] -- ;
      c [ t ] ++ ;
    }
  }
  System . out . println ( ( int ) c ) ;
}
