public static int lower_bound ( int [ ] l , int x ) {
  int imin = - 1 ;
  int imax = l . length ;
  while ( imax - imin > 1 ) {
    int imid = ( imax + imin ) / 2 ;
    if ( l [ imid ] >= x ) {
      imax = imid ;
    }
    else {
      imin = imid ;
    }
  }
  if ( imax == l . length ) {
    return - 1 ;
  }
  return l [ imax ] ;
}
int NA = Integer . parseInt ( input ( ) ) ;
int NB = Integer . parseInt ( input ( ) ) ;
List < Integer > A = new LinkedList < Integer > ( ) ;
List < Integer > B = new LinkedList < Integer > ( ) ;
for ( int i = 0 ;
i < A . size ( ) ;
i ++ ) {
  if ( lower_bound ( B , A . get ( i ) ) == i ) {
    AB ++ ;
  }
}
