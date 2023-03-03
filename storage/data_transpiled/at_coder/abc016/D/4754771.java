public static boolean intersect ( Point p1 , Point p2 , Point p3 , Point p4 ) {
  double t1 = ( p1 . x - p2 . x ) * ( p3 . y - p1 . y ) + ( p1 . y - p2 . y ) * ( p1 . x - p3 . x ) ;
  double t2 = ( p1 . x - p2 . x ) * ( p4 . y - p1 . y ) + ( p1 . y - p2 . y ) * ( p1 . x - p4 . x ) ;
  double t3 = ( p3 . x - p4 . x ) * ( p1 . y - p3 . y ) + ( p3 . y - p4 . y ) * ( p3 . x - p1 . x ) ;
  double t4 = ( p3 . x - p4 . x ) * ( p2 . y - p3 . y ) + ( p3 . y - p4 . y ) * ( p3 . x - p2 . x ) ;
  return t1 * t2 < 0 && t3 * t4 < 0 ;
}
int ax = Integer . parseInt ( input . readLine ( ) ) ;
int ay = Integer . parseInt ( input . readLine ( ) ) ;
int bx = Integer . parseInt ( input . readLine ( ) ) ;
int by = Integer . parseInt ( input . readLine ( ) ) ;
int [ ] point1 = {
  ax , ay }
  ;
  int [ ] point2 = {
    bx , by }
    ;
    int n = Integer . parseInt ( input . readLine ( ) ) ;
    List < Integer > info = new ArrayList < Integer > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( intersect ( point1 , point2 , info . get ( i ) , info . get ( i + 1 ) ) ) {
        count ++ ;
      }
    }
    System . out . println ( count / 2 + 1 ) ;
    return true ;
  }
  