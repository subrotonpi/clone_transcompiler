public static String input ( ) {
  int xx = input . nextInt ( ) , yy = input . nextInt ( ) , W = input . nextInt ( ) ;
  int x = Integer . parseInt ( xx ) - 1 , y = Integer . parseInt ( yy ) - 1 ;
  String [ ] [ ] ps = new String [ 9 ] [ 9 ] ;
  for ( int i = 0 ;
  i < ps . length ;
  i ++ ) ps [ i ] = input . nextLine ( ) ;
  HashMap < Integer , Integer > dic_dx = new HashMap < Integer , Integer > ( ) ;
  dic_dx . put ( 'R' , 1 ) ;
  dic_dx . put ( 'L' , - 1 ) ;
  dic_dx . put ( 'U' , 0 ) ;
  dic_dx . put ( 'D' , 0 ) ;
  dic_dx . put ( 'RU' , 1 ) ;
  dic_dx . put ( 'RD' , 1 ) ;
  dic_dx . put ( 'LU' , - 1 ) ;
  dic_dx . put ( 'LD' , - 1 ) ;
  int dx = dic_dx . get ( W ) ;
  int dy = dic_dy . get ( W ) ;
  String s = ps [ y ] [ x ] ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    if ( ( x == 0 ) && ( dx == - 1 ) ) {
      x = 1 ;
      dx = 1 ;
    }
    else if ( ( x == 8 ) && ( dx == 1 ) ) {
      x = 7 ;
      dx = - 1 ;
    }
    else {
      x += dx ;
    }
    if ( ( y == 0 ) && ( dy == - 1 ) ) {
      y = 1 ;
      dy = 1 ;
    }
    else if ( ( y == 8 ) && ( dy == 1 ) ) {
      y = 7 ;
      dy = - 1 ;
    }
    else {
      y += dy ;
    }
    s += ps [ y ] [ x ] ;
  }
  System . out . println ( s ) ;
  return s ;
}
