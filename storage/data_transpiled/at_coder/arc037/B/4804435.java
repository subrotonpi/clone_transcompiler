public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  Map < Integer , List < Integer >> E = new HashMap < > ( N ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int u = Integer . parseInt ( input ) ;
    int v = Integer . parseInt ( input ) ;
    u = u - 1 ;
    v = v - 1 ;
    E . get ( u ) . add ( v ) ;
    E . get ( v ) . add ( u ) ;
  }
  Map < Integer , Boolean > visited = new HashMap < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    visited . put ( i , false ) ;
  }
  int counter = 0 ;
  while ( false == visited . values ( ) . contains ( false ) ) {
    Stack < Integer > stk = new Stack < > ( ) ;
    stk . push ( new Integer ( Collections . reverseOrder ( visited . values ( ) ) . indexOf ( false ) ) ) ;
    int flag = 1 ;
    while ( stk . size ( ) > 0 ) {
      int v = stk . pop ( ) ;
      int p = E . get ( v ) ;
      if ( visited . get ( v ) ) {
        flag = 0 ;
        continue ;
      }
      visited . put ( v , true ) ;
      for ( int u : E . get ( v ) ) {
        if ( u != p ) stk . push ( new Integer ( u ) ) ;
      }
    }
    counter += flag ;
  }
  System . out . println ( counter ) ;
}
