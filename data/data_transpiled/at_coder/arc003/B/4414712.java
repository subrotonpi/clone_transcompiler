public static void print ( int a = Integer . parseInt ( input ) ) {
  List < String [ ] > l = new ArrayList < String [ ] > ( ) ;
  for ( int i = 0 ;
  i < a ;
  i ++ ) {
    String t = input . next ( ) ;
    String s = t . substring ( 0 , t . length ( ) - 1 ) ;
    l . add ( new String [ ] {
      s , t }
      ) ;
    }
    String [ ] k = new String [ a ] ;
    for ( int i = 0 ;
    i < a ;
    i ++ ) {
      k [ i ] = l . get ( i ) [ 1 ] ;
    }
    for ( int i = 0 ;
    i < a ;
    i ++ ) {
      System . out . println ( k [ i ] [ 0 ] ) ;
    }
  }
  