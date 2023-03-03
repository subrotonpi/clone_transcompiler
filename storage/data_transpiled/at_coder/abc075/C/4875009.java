public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  List < LinkedList < Integer >> D = new ArrayList < LinkedList < Integer >> ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    D . add ( new LinkedList < Integer > ( ) ) ;
  }
  int [ ] A = new int [ M ] ;
  int [ ] B = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    A [ i ] = a ;
    B [ i ] = b ;
    D . get ( a - 1 ) . add ( b - 1 ) ;
    D . get ( b - 1 ) . add ( a - 1 ) ;
  }
  int [ ] d = new int [ N ] ;
  Arrays . fill ( d , 1 ) ;
  int cnt = 0 ;
  /*for(int i : D.get(i)) {
  if(d[i]==0) {
  d[i]=1;
  dfs(i);
  }
  }*/
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    D . get ( A [ i ] - 1 ) . remove ( B [ i ] - 1 ) ;
    D . get ( B [ i ] - 1 ) . remove ( A [ i ] - 1 ) ;
  }
  System . out . println ( cnt ) ;
}
