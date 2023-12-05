public static void f ( ) {
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  Map < Point , Integer > map = new HashMap < Point , Integer > ( ) ;
  while ( n -- > 0 ) {
    int x = f . nextInt ( ) ;
    int y = f . nextInt ( ) ;
    for ( int i = 0 ;
    i < 9 ;
    i ++ ) {
      Point a = new Point ( x + i % 3 , y + i ) ;
      if ( h >= a . x && h <= a . y ) {
        a = a ;
      }
    }
  }
}
