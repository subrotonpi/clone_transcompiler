public static int x , int y , int w ;
int x = input . nextInt ( ) , y = input . nextInt ( ) , w = input . nextInt ( ) ;
String [ ] dire = {
  "R" , "L" , "U" , "D" , "RU" , "RD" , "LU" , "LD" }
  ;
  Point [ ] dxy = {
    new Point ( 1 , 0 ) , new Point ( - 1 , 0 ) , new Point ( 0 , - 1 ) , new Point ( 0 , 1 ) , new Point ( 1 , - 1 ) , new Point ( 1 , 1 ) , new Point ( - 1 , - 1 ) , new Point ( - 1 , 1 ) }
    ;
    Map < String , Integer > map = Maps . newHashMap ( ) ;
    map . put ( dire , dxy ) ;
    int dx = map . get ( w ) ;
    int dy = map . get ( w ) ;
    String s = "" ;
    char [ ] [ ] c = new char [ 9 ] [ 4 ] ;
    for ( int i = 0 ;
    i < 9 ;
    i ++ ) {
      s += c [ y ] [ x ] ;
      x += dx ;
      y += dy ;
      if ( x == 9 ) {
        x = 7 ;
        dx *= - 1 ;
      }
      else if ( x == - 1 ) {
        x = 1 ;
        dx *= - 1 ;
      }
      if ( y == 9 ) {
        y = 7 ;
        dy *= - 1 ;
      }
      else if ( y == - 1 ) {
        y = 1 ;
        dy *= - 1 ;
      }
    }
    System . out . println ( s ) ;
    return x ;
  }
  