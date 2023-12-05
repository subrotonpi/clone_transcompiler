private static int check ( int xx , int yy ) {
  Set < Point > points = new HashSet < Point > ( ) ;
  points . add ( new Point ( 0 , 0 ) ) ;
  for ( int step = 0 ;
  step < 30 ;
  step ++ ) {
    boolean t1 = points . contains ( new Point ( 0 , 0 ) ) ;
    boolean t2 = step % 4 == 0 || step % 3 == 0 ;
    int d = step + 1 ;
    if ( points . contains ( new Point ( xx , yy ) ) ) {
      return step ;
    }
    points . clear ( ) ;
    for ( Point b : points ) {
      for ( Point a : b ) {
        points . add ( a ) ;
      }
    }
  }
  /* calc */
  int d = 0 ;
  int s = 0 ;
  while ( s < Math . abs ( x ) + Math . abs ( y ) ) {
    d ++ ;
    s += d ;
  }
  boolean addZero = d % 4 == 0 || d % 3 == 0 ;
  while ( ( ( Math . abs ( x ) + Math . abs ( y ) ) % 2 ) != 0 ) {
    d ++ ;
    s += d ;
  }
  String res = "" ;
  for ( int i = d ;
  i > 0 ;
  i -- ) {
    if ( Math . abs ( x ) > Math . abs ( y ) && x > 0 ) {
      x -= i ;
      res = "E" + res ;
    }
    else if ( Math . abs ( x ) > Math . abs ( y ) ) {
      x += i ;
      res = "W" + res ;
    }
    else if ( y > 0 ) {
      y -= i ;
      res = "N" + res ;
    }
    else {
      y += i ;
      res = "S" + res ;
    }
  }
  assert ( x == 0 || y == 0 ) : x + " " + y + " " + d ;
  return res . length ( ) ;
}
