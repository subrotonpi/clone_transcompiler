public static int n ( ) {
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] lef = new int [ n + 1 ] ;
  int [ ] ran = new int [ n + 1 ] ;
  {
    if ( lef [ 0 ] == 0 ) return 0 ;
  }
  {
    lef [ 0 ] = f ( lef [ 0 ] ) ;
    ran [ 0 ] = ran [ 0 ] + ran [ lef [ 0 ] ] ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    int d = Integer . parseInt ( input . nextLine ( ) ) ;
    int a = f ( l ) ;
    int b = f ( r ) ;
    if ( a == b && ran [ r ] - ran [ l ] != d ) {
      System . out . println ( "No" ) ;
      exit ( ) ;
    }
    else {
      lef [ b ] = a ;
      ran [ b ] = ran [ l ] + d - ran [ r ] ;
    }
  }
  System . out . println ( "Yes" ) ;
}
