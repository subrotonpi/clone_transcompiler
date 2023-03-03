public static boolean crosscheck ( Point p1 , Point p2 , Point p3 , Point p4 ) {
  float tc1 = ( p1 . x - p2 . x ) * ( p3 . y - p1 . y ) + ( p1 . y - p2 . y ) * ( p1 . x - p3 . x ) ;
  float tc2 = ( p1 . x - p2 . x ) * ( p4 . y - p1 . y ) + ( p1 . y - p2 . y ) * ( p1 . x - p4 . x ) ;
  float td1 = ( p3 . x - p4 . x ) * ( p1 . y - p3 . y ) + ( p3 . y - p4 . y ) * ( p3 . x - p1 . x ) ;
  float td2 = ( p3 . x - p4 . x ) * ( p2 . y - p3 . y ) + ( p3 . y - p4 . y ) * ( p3 . x - p2 . x ) ;
  if ( tc1 * tc2 < 0 && td1 * td2 < 0 ) return true ;
  else return false ;
  int ax = Integer . parseInt ( input . readLine ( ) ) ;
  int ay = Integer . parseInt ( input . readLine ( ) ) ;
  int bx = Integer . parseInt ( input . readLine ( ) ) ;
  int by = Integer . parseInt ( input . readLine ( ) ) ;
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  ArrayList < Integer > xlist = new ArrayList < Integer > ( ) ;
  ArrayList < Integer > ylist = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = Integer . parseInt ( input . readLine ( ) ) ;
    int y = Integer . parseInt ( input . readLine ( ) ) ;
    xlist . add ( x ) ;
    ylist . add ( y ) ;
  }
  int x1 = xlist . remove ( 0 ) ;
  int y1 = ylist . remove ( 0 ) ;
  xlist . add ( x1 ) ;
  ylist . add ( y1 ) ;
  p1 = new Point [ ] {
    ax , ay }
    ;
    p2 = new Point [ ] {
      bx , by }
      ;
      p3 = new Point [ ] {
        x1 , y1 }
        ;
        int cnt = 0 ;
        for ( int i = 0 ;
        i < xlist . size ( ) ;
        i ++ ) {
          int x2 = xlist . get ( i ) ;
          int y2 = ylist . get ( i ) ;
          p3 = p4 ;
        }
        System . out .