static void b ( ) {
  final int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int ix = 0 ;
  ix < t ;
  ix ++ ) {
    final String line = System . console ( ) . readLine ( ) ;
    final String [ ] row = line . trim ( ) . split ( " " ) ;
    final int c = Integer . parseInt ( row [ 0 ] ) ;
    final String [ ] mapstrs = Arrays . copyOfRange ( row , 1 , 1 + c ) ;
    final int d = Integer . parseInt ( row [ 1 + c ] ) ;
    final String [ ] oppstrs = Arrays . copyOfRange ( row , 2 + c , 2 + c + d ) ;
    final String [ ] start = Arrays . copyOfRange ( row , 3 + c + d , row . length ) ;
    final HashMap < String , List < String >> maps = new HashMap < String , List < String >> ( ) ;
    for ( final String m : mapstrs ) {
      maps . put ( m . substring ( 0 , 2 ) , m . substring ( 2 ) ) ;
      maps . put ( m . substring ( 1 + m . substring ( 0 , 2 ) ) , m . substring ( 2 + m . substring ( 0 , 2 ) ) ) ;
    }
    final Stack < String > opps = new Stack < String > ( ) ;
    for ( final String s : start ) {
      stack . push ( s ) ;
      if ( stack . size ( ) > 1 ) {
        final String key = Arrays . copyOfRange ( stack . peek ( ) , stack . peek ( ) ) ;
        if ( maps . containsKey ( key ) ) {
          stack . pop ( ) ;
        }
        else {
          boolean clear = false ;
          for ( final String ele : stack . peek ( ) ) {
            if ( opps . get ( s ) . contains ( ele ) ) {
              clear = true ;
              break ;
            }
          }
          if ( clear ) {
            stack . clear ( ) ;
          }
        }
      }
    }
    System . out . printf ( "Case #%d: [%s]%n" , ix + 1 , Arrays . toString ( stack ) ) ;
  }
}
