static final int getDayOfMonth ( ) {
  int y , m , d ;
  Date t = new Date ( ) ;
  do {
    y = t . getYear ( ) ;
    m = t . getMonth ( ) ;
    d = t . getDay ( ) ;
  }
  while ( y / m / d % 1 == 0 ) ;
  System . out . println ( y + " / {1:02 }