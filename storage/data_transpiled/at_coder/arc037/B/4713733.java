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
  Map < Integer , Integer > visited = new HashMap < > ( ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    visited . put ( i , - 1 ) ;
  }
  int counter = 0 ;
  while ( visited . values ( ) . contains ( - 1 ) ) {
    Stack < Integer > stk = new Stack < > ( ) ;
    stk . push ( new Integer ( Collections . reverseOrder ( visited . values ( ) ) . indexOf ( - 1 ) + 1 ) ) ;
    boolean flag = true ;
    while ( stk . size ( ) > 0 ) {
      int v = stk . pop ( ) ;
      int depth = stk . pop ( ) ;
      if ( visited . get ( v ) != - 1 ) {
        if ( depth - visited . get ( v ) >= 3 ) {
          flag = false ;
        }
        continue ;
      }
      visited . put ( v , depth ) ;
      for ( int u : E . get ( v ) ) {
        stk . push ( new Integer ( u ) ) ;
      }
    }
    counter += flag ;
  }
  System . out . println ( counter ) ;
}
