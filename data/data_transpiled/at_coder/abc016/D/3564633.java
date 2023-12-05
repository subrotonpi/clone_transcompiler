public static boolean intersect ( Point p1 , Point p2 , Point p3 , Point p4 ) {
  double tc1 = ( p1 . x - p2 . x ) * ( p3 . y - p1 . y ) + ( p1 . y - p2 . y ) * ( p1 . x - p3 . x ) ;
  double tc2 = ( p1 . x - p2 . x ) * ( p4 . y - p1 . y ) + ( p1 . y - p2 . y ) * ( p1 . x - p4 . x ) ;
  double td1 = ( p3 . x - p4 . x ) * ( p1 . y - p3 . y ) + ( p3 . y - p4 . y ) * ( p3 . x - p1 . x ) ;
  double td2 = ( p3 . x - p4 . x ) * ( p2 . y - p3 . y ) + ( p3 . y - p4 . y ) * ( p3 . x - p2 . x ) ;
  return tc1 * tc2 < 0 && td1 * td2 < 0 ;
}
int [ ] a , b , c , d ;
a = Integer . parseInt ( input . nextLine ( ) ) ;
b = Integer . parseInt ( input . nextLine ( ) ) ;
c = Integer . parseInt ( input . nextLine ( ) ) ;
d = Integer . parseInt ( input . nextLine ( ) ) ;
int n = Integer . parseInt ( input . nextLine ( ) ) ;
int [ ] [ ] x = new int [ n ] [ 2 ] ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  c = Integer . parseInt ( input . nextLine ( ) ) ;
  d = Integer . parseInt ( input . nextLine ( ) ) ;
  x [ i ] [ 0 ] = c ;
  d = Integer . parseInt ( input . nextLine ( ) ) ;
}
int len = x . length ;
int ans = 0 ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  if ( intersect ( a [ 0 ] , a [ 1 ] , x [ i ] , x [ i + 1 ] ) ) ans ++ ;
}
System . out . println ( ans / 2 + 1 ) ;
return true ;
}
