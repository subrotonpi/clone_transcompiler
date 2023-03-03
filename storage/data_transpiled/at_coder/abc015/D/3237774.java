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
    int a = calc ( i + 1 , Math . min ( maxA , gi0 ) , w , k ) ;
    if ( w + gi0 > W || gi0 > maxA ) {
      return a ;
    }
    int b = G [ i ] [ 1 ] + calc ( i + 1 , maxA , w + gi0 , k + 1 ) ;
    return Math . max ( a , b ) ;
  }
}
