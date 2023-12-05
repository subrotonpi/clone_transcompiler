public static void input ( ) {
  int ax = Integer . parseInt ( input . readLine ( ) ) ;
  int ay = Integer . parseInt ( input . readLine ( ) ) ;
  int bx = Integer . parseInt ( input . readLine ( ) ) ;
  int by = Integer . parseInt ( input . readLine ( ) ) ;
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  List < Integer > pos = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    pos . add ( Integer . parseInt ( input . readLine ( ) ) ) ;
  }
  pos . add ( pos . get ( 0 ) ) ;
  int a = by - ay ;
  int b = ax - bx ;
  int c = - ax * ( by - ay ) - ay * ( ax - bx ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ( a * pos . get ( i + 1 ) . intValue ( ) + b * pos . get ( i + 1 ) . intValue ( ) + c ) * ( a * pos . get ( i ) . intValue ( ) + b * pos . get ( i ) . intValue ( ) + c ) < 0 ) {
      ans ++ ;
    }
  }
  System . out . println ( ans / 2 + 1 ) ;
}
