public static void main ( String input ) {
  int K = Integer . parseInt ( input ) ;
  int n = 0 ;
  int n1 = 0 ;
  int n2 = 0 ;
  int n3 = 0 ;
  int n4 = 0 ;
  int n5 = 0 ;
  String out ;
  if ( K <= 499 ) {
    n = K ;
    mat = new int [ K ] [ K ] ;
    for ( n1 = 0 ;
    n1 < K ;
    n1 ++ ) for ( n2 = 0 ;
    n2 < K - n1 ;
    n2 ++ ) mat [ n1 ] [ n1 + n2 ] = n2 + 1 ;
    for ( n1 = 0 ;
    n1 < K ;
    n1 ++ ) for ( n2 = 0 ;
    n2 < n1 ;
    n2 ++ ) mat [ n1 ] [ n2 ] = K + n2 - n1 + 1 ;
  }
  else {
    n = 500 ;
    mat = new int [ 500 ] [ K ] ;
    for ( n1 = 0 ;
    n1 < 500 ;
    n1 ++ ) for ( n2 = 0 ;
    n2 < 500 - n1 ;
    n2 ++ ) mat [ n1 ] [ n1 + n2 ] = n2 + 1 ;
    for ( n1 = 0 ;
    n1 < 500 ;
    n1 ++ ) for ( n2 = 0 ;
    n2 < n1 ;
    n2 ++ ) mat [ n1 ] [ n2 ] = 500 + n2 - n1 + 1 ;
    for ( n2 = 0 ;
    n2 < K - 500 ;
    n2 ++ ) for ( n1 = 0 ;
    n1 < 250 ;
    n1 ++ ) {
      int kari = n1 * 2 + n2 ;
      if ( kari >= 500 ) kari = kari - 500 ;
      mat [ n1 * 2 ] [ kari ] = n2 + 501 ;
    }
  }
  System . out . println ( n ) ;
  if ( K <= 500 ) {
    out = "" ;
    for ( n1 = 0 ;
    n1 < K ;
    n1 ++ ) {
      out = "" ;
      for ( n2 = 0 ;
      n2 < K ;
      n2 ++ ) out = out + " " + mat [ n1 ] [ n2 ] ;
      System . out . println ( out ) ;
    }
  }
  else {
    out = "" ;
    for ( n1 = 0 ;
    n1 < 500 ;
    n1 ++ ) {
      out = "" ;
      for ( n2 = 0 ;
      n2 < 500 ;
      n2 ++ ) out = out + " " + mat [ n1 ] [ n2 ] ;
      System . out . println ( out ) ;
    }
  }
}
