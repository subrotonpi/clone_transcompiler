public static void input ( int N , int M ) {
  Map < Integer , List < Integer >> E = new HashMap < > ( ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    int u = Integer . parseInt ( input . nextLine ( ) ) ;
    int v = Integer . parseInt ( input . nextLine ( ) ) ;
    E . get ( u ) . add ( v ) ;
    E . get ( v ) . add ( u ) ;
  }
  Map < Integer , Boolean > visited = new HashMap < > ( ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    visited . put ( i , false ) ;
  }
  int counter = 0 ;
  while ( false == visited . values ( ) . contains ( false ) ) {
    Stack < Integer > stk = new Stack < > ( ) ;
    stk . push ( new Integer ( Collections . reverseOrder ( visited . values ( ) ) . indexOf ( false ) + 1 ) ) ;
    boolean flag = true ;
    while ( stk . size ( ) > 0 ) {
      int v = stk . pop ( ) ;
      int p = stk . pop ( ) ;
      if ( visited . get ( v ) ) {
        flag = false ;
        continue ;
      }
      visited . put ( v , true ) ;
      for ( int u : E . get ( v ) ) {
        if ( u != p ) {
          stk . push ( new Integer ( u ) ) ;
        }
      }
    }
    counter += flag ;
  }
  System . out . println ( counter ) ;
}
