public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] B = new int [ N + 1 ] ;
  Arrays . fill ( B , 0 ) ;
  Arrays . fill ( B , 0 ) ;
  Map < Integer , Integer > map = new HashMap < > ( ) ;
  int accum = 0 ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    B [ i ] = accum ;
    if ( i != N ) accum += A [ i ] ;
  }
  for ( int i = 0 ;
  i < B . length ;
  i ++ ) {
    int b = B [ i ] ;
    int x = b % M ;
    if ( map . keySet ( ) . contains ( x ) ) map . put ( x , 1 ) ;
    else map . put ( x , 1 ) ;
  }
  System . out . println ( Arrays . toString ( map . values ( ) ) ) ;
}
