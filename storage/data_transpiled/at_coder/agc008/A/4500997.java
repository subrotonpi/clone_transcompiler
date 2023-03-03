public static int solve ( ) {
  int x = ( Integer ) input . nextInt ( ) , y = ( Integer ) input . nextInt ( ) ;
  List < Integer > ans = new ArrayList < > ( ) ;
  if ( x <= y ) ans . add ( y - x ) ;
  if ( - x <= y ) ans . add ( y + x + 1 ) ;
  if ( x <= - y ) ans . add ( - y - x + 1 ) ;
  if ( - x <= - y ) ans . add ( x - y + 2 ) ;
  return ( Math . min ( ans . size ( ) , Integer . MAX_VALUE ) ) ;
}
