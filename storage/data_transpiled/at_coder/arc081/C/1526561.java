public static String input ( ) {
  final int [ ] A = input ( ) ;
  final HashMap < String , Integer > p = new HashMap < > ( ) ;
  for ( String s : A ) p . put ( s , A . length ( ) ) ;
  final Color [ ] tb = new Color [ A . length ] ;
  tb [ 0 ] = new Color ( 1 , 0 , 0 ) ;
  tb [ 1 ] = new Color ( 0 , 0 , 0 ) ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    String x = A [ i ] ;
    p . put ( x , i ) ;
    tb [ i ] = Math . min ( tb [ p . get ( c ) + 1 ] . getRed ( ) + 1 , c , p . get ( c ) + 1 ) ;
  }
  int i = 0 ;
  final StringBuilder ans = new StringBuilder ( ) ;
  while ( i < A . length ) {
    ans . append ( tb [ i ] . getRed ( ) ) ;
    i = tb [ i ] . getRed ( ) ;
  }
  System . out . println ( ans . toString ( ) ) ;
  return ans . toString ( ) ;
}
