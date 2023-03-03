public static void f ( ) {
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] c = new int [ 10 ] ;
  c [ 0 ] = ( h - 2 ) * ( w - 2 ) ;
  HashMap < Integer , Integer > map = new HashMap < > ( ) ;
  while ( n -- > 0 ) {
    int x = f . nextInt ( ) ;
    int y = f . nextInt ( ) ;
    for ( int i = 0 ;
    i < 9 ;
    i ++ ) {
      int a = ( x + i % 3 ) ;
      if ( h >= a > 2 && h < a && a <= w ) map . put ( a , map . get ( a ) + 1 ) ;
      c [ map . get ( a ) - 1 ] -- ;
      c [ map . get ( a ) ] ++ ;
    }
  }
  System . out . println ( ( int ) c ) ;
}
