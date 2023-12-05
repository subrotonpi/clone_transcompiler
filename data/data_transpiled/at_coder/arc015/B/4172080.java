public static int [ ] getans ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] ans = new int [ 6 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    double t1 = Double . parseDouble ( input . nextLine ( ) ) , t2 = Double . parseDouble ( input . nextLine ( ) ) ;
    if ( t1 >= 35 ) ans [ 0 ] ++ ;
    if ( t2 >= 30 ) ans [ 1 ] ++ ;
  }
  return ans ;
}
