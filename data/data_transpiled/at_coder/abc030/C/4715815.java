static final void bisect_left ( int t , boolean airport ) {
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final int m = Integer . parseInt ( input . nextLine ( ) ) ;
  final int x = Integer . parseInt ( input . nextLine ( ) ) ;
  final int y = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] a = new int [ n ] ;
  final int [ ] b = new int [ n ] ;
  final Map < Integer , Integer > cache = new HashMap < > ( ) ;
  BiFunction < Integer , Integer , Boolean > f = ( t , airport ) -> {
    Integer key = new Integer ( t ) ;
    if ( cache . containsKey ( key ) ) {
      return cache . get ( key ) ;
    }
    int val = 0 ;
    if ( airport ) {
      int u = Arrays . binarySearch ( a , t ) ;
      if ( u < n ) {
        val = Math . max ( val , f . apply ( a [ u ] + x , ! airport ) ) ;
      }
    }
    else {
      int u = Arrays . binarySearch ( b , t ) ;
      if ( u < m ) {
        val = Math . max ( val , f . apply ( b [ u ] + y , ! airport ) + 1 ) ;
      }
    }
    cache . put ( key , val ) ;
    return val ;
  }
  ;
  System . out . println ( f . apply ( 0 , true ) ) ;
}
