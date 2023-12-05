public static void print ( int n ) {
  int [ ] a = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] l = new int [ 8 ] ;
  int red = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( a [ i ] <= 399 ) {
      l [ 0 ] ++ ;
    }
    else if ( a [ i ] <= 799 ) {
      l [ 1 ] ++ ;
    }
    else if ( a [ i ] <= 1199 ) {
      l [ 2 ] ++ ;
    }
    else if ( a [ i ] <= 1599 ) {
      l [ 3 ] ++ ;
    }
    else if ( a [ i ] <= 1999 ) {
      l [ 4 ] ++ ;
    }
    else if ( a [ i ] <= 2399 ) {
      l [ 5 ] ++ ;
    }
    else if ( a [ i ] <= 2799 ) {
      l [ 6 ] ++ ;
    }
    else if ( a [ i ] <= 3199 ) {
      l [ 7 ] ++ ;
    }
    else {
      red ++ ;
    }
  }
  int k = 8 - l [ 0 ] ;
  if ( k >= 1 ) {
    System . out . println ( k + " " + red + k ) ;
  }
  else {
    System . out . println ( 1 + red + k ) ;
  }
}
