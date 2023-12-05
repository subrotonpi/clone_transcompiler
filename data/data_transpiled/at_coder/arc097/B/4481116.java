public static int [ ] [ ] read ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] par = new int [ n ] , rank = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    par [ i ] = i ;
    rank [ i ] = 0 ;
  }
  /* find the first element */
  if ( par [ n ] == 0 ) return par ;
  else {
    par [ n ] = find ( par [ n ] ) ;
    return par ;
  }
  /* unite the first element */
  int x = find ( input ) ;
  int y = find ( input ) ;
  if ( ( x != y ) && ( rank [ x ] < rank [ y ] ) ) par [ x ] = y ;
  else {
    par [ y ] = x ;
    if ( ( rank [ x ] == rank [ y ] ) && ( rank [ y ] == 0 ) ) rank [ x ] ++ ;
  }
  /* same */
  int [ ] p = new int [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int x = Integer . parseInt ( input ) ;
    int y = Integer . parseInt ( input ) ;
    unite ( x - 1 , y - 1 ) ;
  }
  HashMap < Integer , List < Integer >> dic = new HashMap < Integer , List < Integer >> ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int i1 = find ( i ) ;
    if ( dic . containsKey ( i1 ) ) dic . get ( i1 ) . add ( i ) ;
    else dic . put ( i1 , new ArrayList < Integer > ( ) ) ;
  }
  int cnt = 0 ;
  for ( Integer pp : Collections . reverseOrder ( dic ) ) {
    List < Integer > l = dic . get ( pp ) ;
    List < Integer > ll = new ArrayList < Integer > ( ) ;
    for ( int i : l ) ll . add ( p [ i ] - 1 ) ;
    for ( int q : ll ) if ( ( par [ q ] == pp ) ++ cnt ) }
    System . out . println ( cnt ) ;
    return p ;
  }
  