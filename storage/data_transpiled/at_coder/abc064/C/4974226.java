static final String getStdOut ( ) {
  final Supplier < String > ns = ( ) -> System . in . nextLine ( ) . replaceAll ( " " , "" ) ;
  final Supplier < Integer > ni = ( ) -> Integer . parseInt ( ns . get ( ) ) ;
  final Supplier < String > nm = ( ) -> map ( Integer :: parseInt , System . in ) ;
  final Supplier < List < Integer >> nl = ( ) -> Collections . singletonList ( nm . get ( ) ) ;
  final Supplier < String > nsl = ( ) -> map ( String :: valueOf , System . in ) ;
  final int n = ni . get ( ) ;
  final int [ ] a = nl . get ( ) ;
  final int [ ] l = new int [ 9 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] <= 399 ) {
      l [ 0 ] ++ ;
    }
    else if ( 400 <= a [ i ] <= 799 ) {
      l [ 1 ] ++ ;
    }
    else if ( 800 <= a [ i ] <= 1199 ) {
      l [ 2 ] ++ ;
    }
    else if ( 1200 <= a [ i ] <= 1599 ) {
      l [ 3 ] ++ ;
    }
    else if ( 1600 <= a [ i ] <= 1999 ) {
      l [ 4 ] ++ ;
    }
    else if ( 2000 <= a [ i ] <= 2399 ) {
      l [ 5 ] ++ ;
    }
    else if ( 2400 <= a [ i ] <= 2799 ) {
      l [ 6 ] ++ ;
    }
    else if ( 2800 <= a [ i ] <= 3199 ) {
      l [ 7 ] ++ ;
    }
    else if ( 3200 <= a [ i ] ) {
      l [ 8 ] ++ ;
    }
  }
  if ( l [ 8 ] == 0 ) {
    System . out . println ( 9 - l [ 0 ] + " " + 9 - l [ 0 ] ) ;
  }
  else {
    if ( l [ 0 ] == 8 ) {
      System . out . println ( 1 + " " + l [ 8 ] ) ;
    }
    else {
      System . out . println ( 8 - l [ 0 ] + " " + 8 - l [ 0 ] + l [ 8 ] ) ;
    }
  }
  return l [ 8 ] ;
}
