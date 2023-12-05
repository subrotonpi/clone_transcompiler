public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  List < Integer > shops = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    shops . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  int buyDrinks = 0 ;
  int cost = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    cost += shops . get ( i ) * shops . get ( i ) ;
    buyDrinks += shops . get ( i ) ;
    if ( buyDrinks >= m ) {
      cost -= ( buyDrinks - m ) * shops . get ( i ) ;
      break ;
    }
  }
  System . out . println ( cost ) ;
}
