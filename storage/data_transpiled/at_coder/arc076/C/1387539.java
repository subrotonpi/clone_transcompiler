public static int R = Integer . parseInt ( input ) {
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = input . nextInt ( ) ;
  List < Integer > edges = new ArrayList < > ( ) ;
  {
    int a , b , c , d ;
    int p , q ;
    int i ;
    int a , b , a , c , d ;
    a = R + R + R - R ;
    b = R + C + R - R ;
    c = R + C + R - C ;
    d = R + C + R - C ;
    a = R + R + R + C ;
    b = R + C + R - R ;
    c = R + C + R + C ;
    d = R + R + C ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a = R + R + R + C ;
    b = C + R + C ;
    int flag = Integer . YES ;
    for ( int a = 0 ;
    a < b ;
    a ++ ) {
      int b = edges . get ( a ) ;
      while ( a >= stack . get ( stack . size ( ) - 1 ) ) {
        stack . pop ( ) ;
      }
      if ( b > stack . get ( stack . size ( ) - 1 ) ) {
        flag = Integer . NO ;
        break ;
      }
      else {
        stack . push ( b ) ;
      }
    }
  }
  System . out . println ( flag ) ;
  return 0 ;
}
