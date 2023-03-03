public static final String getStdOut ( ) {
  if ( StdIn . available ( ) == 0 ) {
    final String A = input ( ) ;
    final Map < String , Integer > p = new HashMap < > ( ) ;
    for ( String s : A . split ( " " ) ) {
      p . put ( s , s . length ( ) ) ;
    }
    final Tuple < Integer , Integer > [ ] tb = new Tuple [ A . length ( ) ] ;
    tb [ 0 ] = new Tuple < > ( 1 , 0 , 0 ) ;
    tb [ 1 ] = new Tuple < > ( 0 , 0 , 0 ) ;
    for ( int i = 0 ;
    i < A . length ( ) ;
    i ++ ) {
      final String s = A . substring ( i , i + 1 ) ;
      p . put ( s , i ) ;
      tb [ i ] = Math . min ( tb [ p . get ( s ) + 1 ] . x + 1 , c , p . get ( s ) + 1 ) ;
    }
    int i = 0 ;
    final StringBuilder ans = new StringBuilder ( ) ;
    while ( i < A . length ( ) ) {
      ans . append ( tb [ i ] . y ) ;
      i = tb [ i ] . z ;
    }
    System . out . println ( ans . toString ( ) ) ;
  }
  return null ;
}
