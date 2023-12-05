public static void main ( Scanner input ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int num = 1 ;
  num <= N ;
  num ++ ) {
    int X = Integer . parseInt ( input . nextLine ( ) ) ;
    int S = Integer . parseInt ( input . nextLine ( ) ) ;
    int R = Integer . parseInt ( input . nextLine ( ) ) ;
    int T = Integer . parseInt ( input . nextLine ( ) ) ;
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    HashMap < Integer , Integer > L = new HashMap < Integer , Integer > ( ) ;
    HashMap < Integer , Integer > W = new HashMap < Integer , Integer > ( ) ;
    L . put ( 0 , X ) ;
    W . put ( 0 , 0 ) ;
    for ( int i = 1 ;
    i <= n ;
    i ++ ) {
      int b = Integer . parseInt ( input . nextLine ( ) ) ;
      int e = Integer . parseInt ( input . nextLine ( ) ) ;
      int w = Integer . parseInt ( input . nextLine ( ) ) ;
      L . put ( i , ( e - b ) ) ;
      W . put ( i , w ) ;
      L . put ( 0 , ( e - b ) ) ;
    }
    List < Integer > Idx = new LinkedList < Integer > ( ) ;
    for ( int i = 0 ;
    i < n + 1 ;
    i ++ ) {
      int b = Integer . parseInt ( input . nextLine ( ) ) ;
      int e = Integer . parseInt ( input . nextLine ( ) ) ;
      int w = Integer . parseInt ( input . nextLine ( ) ) ;
      L . put ( i , ( e - b ) ) ;
      W . put ( i , w ) ;
      L . put ( 0 , ( e - b ) ) ;
    }
    List < Integer > Idx = new ArrayList < Integer > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      Idx . add ( i ) ;
    }
    Collections . sort ( Idx , W . get ( i ) ) ;
    int Answer = 0 ;
    for ( int i = 0 ;
    i < Idx . size ( ) ;
    i ++ ) {
      if ( T == 0 ) {
        Answer += L . get ( i ) / ( W . get ( i ) + S ) ;
      }
      else if ( ( W . get ( i ) + R ) * T >= L . get ( i ) ) {
        Answer += L . get ( i ) / ( W . get ( i ) + R ) ;
        