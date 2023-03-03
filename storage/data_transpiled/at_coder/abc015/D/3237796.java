public static int W = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] G = new int [ N ] [ K ] ;
  {
    int i = 0 ;
    int maxA = Integer . parseInt ( input . nextLine ( ) ) ;
    int w = Integer . parseInt ( input . nextLine ( ) ) ;
    int k = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( i >= N || k >= K ) {
      return 0 ;
    }
    int gi0 = G [ i ] [ 0 ] ;
    int a = calc ( i + 1 , maxA < gi0 ? maxA : gi0 , w , k ) ;
    int wNew = w + gi0 ;
    if ( wNew > W || gi0 > maxA ) {
      return a ;
    }
    int b = G [ i ] [ 1 ] + calc ( i + 1 , maxA , wNew , k + 1 ) ;
    return a > b ? a : b ;
  }
}
