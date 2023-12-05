static final void domap ( int t ) {
  final List < String > letters = Collections . singletonList ( "" ) ;
  final int H = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  final int W = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  final int [ ] [ ] G = Arrays . stream ( Range . repeat ( H , W ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  final Map < Integer , Integer > L = new HashMap < Integer , Integer > ( ) , B = new HashMap < Integer , Integer > ( ) ;
  {
    if ( ( h < 0 ) || ( w < 0 ) ) return B . get ( h , w ) ;
    int e = G [ h ] [ w ] ;
    int d = ( h < 0 ) ? - 1 : 0 ;
    for ( int dh = - 1 , dw = 0 ;
    dh < H ;
    dh ++ , dw ++ ) {
      int dh = ( h < 0 ) ? - 1 : 0 ;
      int dw = ( w < 0 ) ? - 1 : 0 ;
      if ( ! ( dh <= w ) && ! ( dw <= h ) ) continue ;
      int de = G [ h + dh ] [ w ] ;
      if ( de < e ) B . put ( h , d ) ;
    }
  }
}
