public static int dul ( int n , int p ) {
  p ++ ;
  int ad = 2 * ( n - 1 ) ;
  int a = 0 ;
  int kor = 1 ;
  int su = 1 ;
  while ( p > kor ) {
    a += ad ;
    ad >>>= 1 ;
    su <<= 1 ;
    kor += su ;
  }
  return a ;
  /*should be the same number*/
  if ( p == 2 * n - 1 ) return p ;
  p ++ ;
  int ad = 2 * ( n - 1 ) ;
  int a = 0 ;
  int kor = 0 ;
  int su = 1 ;
  int pkor = 0 ;
  while ( p > a ) {
    a += ad ;
    ad >>>= 1 ;
    su <<= 1 ;
    pkor = kor ;
    kor += su ;
  }
  /*pkor = */
  int z = input . nextInt ( ) ;
  for ( int cas : xrange ( 1 , z + 1 ) ) {
    n = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
    p -- ;
    System . out . println ( "Case #" + cas + ": " + should ( n , p ) + " " + dul ( n , p ) ) ;
  }
  return p ;
}
