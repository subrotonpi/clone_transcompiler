public static int [ ] getDistance ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] a = {
    0 , 0 , 0 , 0 , 0 , 0 }
    ;
    for ( int x = 0 ;
    x < n ;
    x ++ ) {
      double maxx = Double . parseDouble ( input . nextLine ( ) ) ;
      double minn = Double . parseDouble ( input . nextLine ( ) ) ;
      if ( ( maxx >= 35 ) && ( maxx < 35 ) ) {
        a [ 0 ] = a [ 0 ] + 1 ;
      }
      if ( ( maxx >= 30 ) && ( maxx < 35 ) ) {
        a [ 1 ] = a [ 1 ] + 1 ;
      }
    }
    return a ;
  }
  