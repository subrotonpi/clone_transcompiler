static int n ( int m , int ... A ) {
  int l = 3 * m ;
  int [ ] D = new int [ l ] ;
  int S = 0 ;
  for ( int a = 0 , b = 0 ;
  a < A . length ;
  a += m ) {
    b += m * ( b < a ) ;
    int k = b - a ;
    S += k ;
    if ( k > 1 ) D [ a + 2 ] ++ ;
    D [ b + 1 ] -= k ;
    D [ b + 2 ] += k - 1 ;
  }
  exec ( "for (int i=1;i<l;i++)\n" ) ;
  System . out . println ( S - Math . max ( D [ a ] + D [ a + m ] , 2 ) ) ;
}
