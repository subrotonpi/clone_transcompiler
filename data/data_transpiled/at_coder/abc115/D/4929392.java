static int f ( int N , int X ) {
  final Scanner input = new Scanner ( System . in ) ;
  final double INF = Double . MAX_VALUE ;
  final int MOD = 10 * 9 + 7 ;
  double [ ] dy = {
    0 , 1 , 0 , - 1 }
    ;
    double [ ] dx = {
      1 , 0 , - 1 , 0 }
      ;
      double [ ] ddy = {
        0 , 1 , 1 , 1 , 0 , - 1 , - 1 , - 1 }
        ;
        double [ ] ddx = {
          1 , 1 , 0 , - 1 , - 1 , - 1 , 0 , 1 }
          ;
          int n = Integer . parseInt ( input . nextLine ( ) ) ;
          int x = Integer . parseInt ( input . nextLine ( ) ) ;
          int [ ] P = new int [ n ] ;
          int [ ] L = new int [ n ] ;
          for ( int i = 0 ;
          i < n ;
          i ++ ) {
            P [ i ] = 1 ;
            L [ i ] = 1 ;
          }
          /* f(N,X)*/
          return x ;
        }
        