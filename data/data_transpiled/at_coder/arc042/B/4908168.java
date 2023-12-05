public static double x = Integer . parseInt ( input ) {
  int x = Integer . parseInt ( input . readLine ( ) ) ;
  int y = Integer . parseInt ( input . readLine ( ) ) ;
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  List < Integer > info = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    info . add ( Integer . parseInt ( input . readLine ( ) ) ) ;
  }
  info . add ( info . get ( 0 ) ) ;
  /* Distance from p to l */
  double lengthL = ( ( l1 . x - l2 . x ) * ( l1 . x - l2 . x ) + ( l1 . y - l2 . y ) * ( l1 . y - l2 . y ) ) * ( 1 / 2 ) ;
  /* ((l1.x-p.x)*(l2.y-p.y)-(l1.y-p.y)*(l2.x-p.x)) / lengthL */
  Point p = new Point ( x , y ) ;
  double ans = Double . MAX_VALUE ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    Point a = info . get ( i ) ;
    Point b = info . get ( i + 1 ) ;
    ans = Math . min ( ans , distanceFromPToL ( p , a , b ) ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
