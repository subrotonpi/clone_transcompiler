public static int [ ] [ ] x , int [ ] y , int [ ] [ ] h = new int [ n ] [ n ] ;
int a , b , c ;
int H ;
int [ ] [ ] x = new int [ 101 ] [ 101 ] , h = new int [ 101 ] [ 101 ] ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  a = Integer . parseInt ( input . readLine ( ) ) ;
  b = Integer . parseInt ( input . readLine ( ) ) ;
  c = Integer . parseInt ( input . readLine ( ) ) ;
  x [ i ] = a ;
  y [ i ] = b ;
  h [ i ] = c ;
}
for ( int i = 0 ;
i < n ;
i ++ ) {
  if ( h [ i ] != 0 ) s = i ;
  break ;
}
for ( int cx = 0 ;
cx < 101 ;
cx ++ ) for ( int cy = 0 ;
cy < 101 ;
cy ++ ) {
  H = h [ s ] + Math . abs ( x [ s ] - cx ) + Math . abs ( y [ s ] - cy ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( h [ i ] != Math . max ( 0 , H - Math . abs ( x [ i ] - cx ) - Math . abs ( y [ i ] - cy ) ) ) break ;
    if ( i == n - 1 ) System . out . println ( cx + " " + cy + " " + H ) ;
    exit ( ) ;
  }
}
return x ;
}
