public static void dfs ( int N , int M ) {
  int [ ] [ ] G = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) G [ i ] [ 0 ] = new int [ N ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    G [ a - 1 ] [ b ] = b - 1 ;
    G [ b - 1 ] [ a ] = a - 1 ;
  }
  int [ ] [ ] dp = new int [ N ] [ M ] ;
  Map . Mark mark = new HashMap . Mark ( ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] col = new int [ Q + 1 ] ;
  col [ Q ] = 0 ;
  col [ Q ] = 1 ;
  C [ Q ] = 0 ;
}
