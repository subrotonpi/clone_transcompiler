public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  ArrayList < Integer > shops = new ArrayList < > ( ) ;
  Collections . sort ( shops ) ;
  int drink = 0 ;
  int cost = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    cost += shops . get ( i ) . intValue ( ) * shops . get ( i ) . intValue ( ) ;
    drink += shops . get ( i ) . intValue ( ) ;
    if ( drink >= M ) {
      cost -= ( drink - M ) * shops . get ( i ) . intValue ( ) ;
      break ;
    }
  }
  System . out . println ( cost ) ;
}
