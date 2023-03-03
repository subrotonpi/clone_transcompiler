public static boolean isAreaInteger ( Point p1 , Point p2 , Point p3 ) {
  Point p12 = new Point ( p2 . x - p1 . x , p2 . y - p1 . y ) ;
  Point p13 = new Point ( p3 . x - p1 . x , p3 . y - p1 . y ) ;
  int area = Math . abs ( p12 . x * p13 . y - p12 . y * p13 . x ) ;
  if ( 0 == area ) {
    return false ;
  }
  return 0 == area % 2 ;
}
int n = Integer . parseInt ( input ( ) ) ;
List < List < Integer >> grid = new ArrayList < > ( ) ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  grid . add ( Collections . singletonList ( Integer . parseInt ( input ( ) ) ) ) ;
}
int count = 0 ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  for ( int j = i ;
  j < n ;
  j ++ ) {
    for ( int k = j ;
    k < n ;
    k ++ ) {
      if ( isAreaInteger ( grid . get ( i ) , grid . get ( j ) , grid . get ( k ) ) ) {
        count ++ ;
      }
    }
  }
}
System . out . println ( count ) ;
return true ;
}
