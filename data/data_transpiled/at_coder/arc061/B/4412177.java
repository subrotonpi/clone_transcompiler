public static void f ( ) {
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] c = new int [ 10 ] ;
  c [ 0 ] = ( h - 2 ) * ( w - 2 ) ;
  HashMap < Integer , Integer > map = new HashMap < > ( ) ;
  while ( n -- > 0 ) {
    int x = f ( ) ;
    int y = f ( ) ;
    for ( int i = 0 ;
    i < 9 ;
    i ++ ) {
      int a = ( x + i % 3 ) ;
      if ( h >= x + i % 3 > 2 && w < y + i / 3 && w <= 3 ) map . put ( a , map . getOrDefault ( a , 0 ) + 1 ) ;
      c [ map . get ( a ) - 1 ] -- ;
      c [ map . get ( a ) ] ++ ;
    }
  }
  System . out . println ( ( int ) c ) ;
}
