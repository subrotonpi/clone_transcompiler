public static void update ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int M = Integer . parseInt ( input . readLine ( ) ) ;
  List < Edge > edges = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    int c = Integer . parseInt ( input . readLine ( ) ) ;
    edges . add ( new Edge ( a , b , - c ) ) ;
  }
  final int INF = 10 * 9 * M * 10 * 2 ;
  int [ ] d = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    d [ i ] = INF ;
  }
  d [ 1 ] = INF ;
  /*update*/
  for ( Edge edge : edges ) {
    int a = edge . a ;
    int b = edge . b ;
    int c = edge . c ;
    d [ b ] = Math . min ( d [ a ] , d [ a ] + c ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = edge . a ;
    int b = edge . b ;
    d [ a ] = edge . c ;
    d [ a ] = d [ a ] ;
    d [ b ] = d [ a ] ;
    d [ a ] = d [ a ] ;
    d [ a ] = d [ a ] ;
    d [ a ] = d [ a ] ;
    d [ a ] = d [ a ] ;
    d [ a ] = d [ a ] ;
  }
}
