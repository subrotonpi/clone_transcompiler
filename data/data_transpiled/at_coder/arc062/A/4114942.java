public static int floor ( int a , int b ) {
  return ( ( - a ) / b ) * - 1 ;
}
int N = Integer . parseInt ( input . nextLine ( ) ) ;
int [ ] [ ] ratio = new int [ N ] [ ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  ratio [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
}
int vT = ratio [ 0 ] [ 0 ] ;
int vA = ratio [ 0 ] [ 1 ] ;
for ( int i = 1 ;
i < ratio . length ;
i ++ ) {
  int t = ratio [ i ] [ 0 ] ;
  int a = ratio [ i ] [ 1 ] ;
  int diff_t = t - v_T ;
  int diff_a = a - v_A ;
  int d = Math . max ( floor ( vT , t ) , floor ( v_A , a ) ) ;
  vT = d * t ;
  vA = d * a ;
}
System . out . println ( vT + vA ) ;
}
