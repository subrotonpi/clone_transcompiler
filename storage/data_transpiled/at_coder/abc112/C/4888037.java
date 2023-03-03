public static int high ( int i ) {
  return Math . max ( H - Math . abs ( x [ i ] - Cx ) - Math . abs ( y [ i ] - Cy ) , 0 ) ;
}
int N = Integer . parseInt ( input . nextLine ( ) ) ;
int [ ] x = new int [ N ] ;
int [ ] y = new int [ N ] ;
int [ ] h = new int [ N ] ;
for ( ;
;
) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  x [ i ] = a ;
  y [ i ] = b ;
  h [ i ] = c ;
}
for ( int i = 0 ;
i < N ;
i ++ ) {
  if ( h [ i ] != 0 ) {
    int nonZero = i ;
    break ;
  }
}
boolean found = false ;
for ( int Cx = 0 ;
Cx <= 101 ;
Cx ++ ) {
  for ( int Cy = 0 ;
  Cy <= 101 ;
  Cy ++ ) {
    int H = h [ nonZero ] + Math . abs ( x [ nonZero ] - Cx ) + Math . abs ( y [ nonZero ] - Cy ) ;
    if ( Arrays . equals ( h , high ( i ) ) ) {
      System . out . println ( Cx + " " + Cy + " " + H ) ;
      found = true ;
      break ;
    }
  }
  if ( found ) {
    break ;
  }
}
