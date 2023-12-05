public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  final List < Integer > numbers = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    numbers . add ( Integer . parseInt ( input ) ) ;
  }
  final Map < Integer , Integer > reqs = new HashMap < > ( ) ;
  reqs . put ( 1 , 2 ) ;
  reqs . put ( 2 , 5 ) ;
  reqs . put ( 3 , 4 ) ;
  reqs . put ( 4 , 5 ) ;
  reqs . put ( 5 , 6 ) ;
  reqs . put ( 6 , 3 ) ;
  reqs . put ( 7 , 6 ) ;
  reqs . put ( 8 , 7 ) ;
  reqs . put ( 9 , 6 ) ;
  memo . put ( 0 , new int [ 10 ] ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( memo . containsKey ( i ) ) {
      for ( int num : numbers ) {
        int nextN = i + reqs . get ( num ) ;
        int nextCounts = memo . containsKey ( nextN ) ? memo . get ( nextN ) : 0 ;
        if ( nextN <= n ) {
          memo . put ( nextN , maxCounts ( nextCounts , memo . get ( i ) . substring ( 0 , num ) + memo . get ( i ) . substring ( num + 1 ) + memo . get ( i ) . substring ( num + 1 ) ) ) ;
        }
      }
    }
  }
  StringBuffer ans = new StringBuffer ( ) ;
  for ( int num = 9 ;
  num > 0 ;
  num -- ) {
    for ( int i = 0 ;
    i < memo . get ( n ) . get ( num ) ;
    i ++ ) {
      ans . append ( Integer . toString ( num ) ) ;
    }
  }
  System . out . println ( ans ) ;
}
