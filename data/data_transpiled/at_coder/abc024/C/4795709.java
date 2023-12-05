public static int [ ] [ ] getN ( ) {
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] LR = new int [ D ] ;
  for ( int i = 0 ;
  i < D ;
  i ++ ) LR [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] SG = new int [ K ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) SG [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] ABG = new int [ K ] [ K ] ;
  for ( int k = 0 ;
  k < K ;
  k ++ ) ABG [ k ] = new int [ K ] [ K ] ;
  for ( int k = 0 ;
  k < K ;
  k ++ ) {
    ABG [ k ] [ 0 ] = SG [ k ] [ 0 ] ;
    ABG [ k ] [ 1 ] = SG [ k ] [ 0 ] ;
    ABG [ k ] [ 2 ] = SG [ k ] [ 1 ] ;
  }
  int [ ] ans = new int [ K ] ;
  for ( int k = 0 ;
  k < K ;
  k ++ ) {
    ans [ k ] = 0 ;
  }
  for ( int d = 0 ;
  d < D ;
  d ++ ) {
    int l = LR [ d ] ;
    int r = LR [ d ] ;
    for ( int k = 0 ;
    k < K ;
    k ++ ) {
      if ( ans [ k ] == 0 ) {
        int a = ABG [ k ] [ 0 ] ;
        int b = ABG [ k ] [ 1 ] ;
        int g = ABG [ k ] [ 2 ] ;
        if ( l <= a && a <= r ) a = l ;
        if ( l <= b && b <= r ) b = r ;
        if ( a <= g && g <= b ) {
          ABG [ k ] = new int [ ] {
            a , b , g }
            ;
            ans [ k ] = d + 1 ;
          }
          else {
            ABG [ k ] = new int [ ] {
              a , b , g }
              ;
            }
          }
        }
      }
      for ( int k = 0 ;
      k < K ;
      k ++ ) {
        System . out . println ( ans [ k ] ) ;
      }
      return ans ;
    }
    