static Runnable r = new Runnable ( ) {
  @ Override public void run ( ) {
    int [ ] a = map ( Integer :: parseInt , input ) ;
    int h = f . nextInt ( ) ;
    int w = f . nextInt ( ) ;
    int n = f . nextInt ( ) ;
    int [ ] c = new int [ 9 ] ;
    Arrays . fill ( c , ( h - 2 ) * ( w - 2 ) ) ;
    Map < Integer , Integer > map = new HashMap < > ( ) ;
    while ( n -- > 0 ) {
      int x = f . nextInt ( ) ;
      int y = f . nextInt ( ) ;
      for ( int i = 0 ;
      i < 9 ;
      i ++ ) {
        int a = x + i % 3 ;
        int a = y + i / 3 ;
        int g = h >= a && a <= 2 && a <= w ;
        int t = map . get ( a ) + g ;
        c [ t - g ] -- ;
        c [ t ] ++ ;
      }
    }
    System . out . println ( ( int ) c ) ;
  }
}
