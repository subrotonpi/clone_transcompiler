@ Test public static void test ( String filename ) throws IOException {
  String [ ] lines = new String [ ] {
    line . split ( "\\s+" ) [ 1 ] }
    ;
    Arrays . sort ( lines ) ;
    List < Integer > list = new ArrayList < > ( ) ;
    for ( String line : lines ) {
      list . add ( Integer . parseInt ( line ) ) ;
    }
    new MemoizingVisitor < Integer , Integer > ( ) {
      private final HashMap < Integer , Integer > memo = new HashMap < > ( ) ;
      @ Override public Integer visitInteger ( Integer integer , Integer value ) {
        if ( ! memo . containsKey ( integer ) ) {
          memo . put ( integer , value ) ;
        }
        return memo . get ( integer ) ;
      }
    }
    . visitIntInsn ( Opcodes . BIPUSH , 2 ) ;
    @ SuppressWarnings ( "unchecked" ) private boolean win ( int a , int b ) {
      if ( a == b ) return false ;
      if ( a < b ) {
        a = b ;
        b = a ;
      }
      if ( a % b == 0 ) return true ;
      if ( ! win ( a % b , b ) ) return true ;
      if ( a % b + b < a && ! win ( a % b + b , b ) ) return true ;
      return false ;
    }
    for ( int idx = 0 ;
    idx < list . size ( ) ;
    idx ++ ) {
      Integer [ ] line = list . get ( idx ) . split ( " " ) ;
      int a1 = line [ 0 ] ;
      int a2 = line [ 1 ] ;
      int b1 = line [ 2 ] ;
      int b2 = line [ 3 ] ;
      int ans = 0 ;
      for ( int x = a1 ;
      x <= a2 ;
      x ++ ) for ( int y = b1 ;
      y <= b2 ;
      y ++ ) {
        if ( win ( line [ 0 ] , y ) ) ans ++ ;
      }
      System . out . println ( "Case #" + ( idx + 1 ) + ": " + ans ) ;
    }
  }
  