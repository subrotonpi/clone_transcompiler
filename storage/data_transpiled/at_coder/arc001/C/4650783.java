public static int [ ] getA ( int [ ] input ) {
  int A = input [ 0 ] , B = input [ 1 ] ;
  int result = 0 ;
  if ( A > B ) {
    A = B ;
    B = A ;
  }
  while ( A != B ) {
    if ( B >= A + 10 ) {
      A += 10 ;
    }
    else if ( B == A + 9 ) {
      A -- ;
    }
    else if ( B == A + 8 ) {
      A -- ;
    }
    else if ( B == A + 7 ) {
      A += 5 ;
    }
    else if ( B == A + 6 ) {
      A -- ;
    }
    else if ( B == A + 3 ) {
      A ++ ;
    }
    else if ( B == A + 2 ) {
      A ++ ;
    }
    else if ( B == A + 1 ) {
      A ++ ;
    }
    result ++ ;
  }
  return result ;
}
