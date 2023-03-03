public static int N = Integer . parseInt ( input ) {
  int [ ] [ ] S = new int [ N ] [ 2 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = input . nextInt ( ) ;
    int l = input . nextInt ( ) ;
    S [ i ] [ 0 ] = a ;
    S [ i ] [ 1 ] = Integer . parseInt ( l ) ;
  }
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    k += S [ i ] [ 0 ] . length * S [ i ] [ 1 ] ;
  }
  /* if (z == 1) {
  return 1;
  } else if (z % 2) {
  double t = Math.pow(y,z/2, b);
  return ((1+t)*f(y,z/2, b)) % b;
  } else {
  return (1+y*f(y,z-1, b)) % b;
  }*/
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int t = S [ i ] [ 0 ] . length ;
    k -= S [ i ] [ 0 ] . length * S [ i ] [ 1 ] ;
    double r = 10 * t ;
    double K = f ( r , S [ i ] [ 1 ] , B ) ;
    double U = Math . pow ( 10 , k , B ) ;
    K *= Integer . parseInt ( S [ i ] [ 0 ] ) ;
    K %= B ;
    K *= U ;
    K %= B ;
    ans += K ;
    ans %= B ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
