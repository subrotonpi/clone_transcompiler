static final int [ ] [ ] getSortedList ( ) {
  int K = Integer . parseInt ( input . readLine ( ) ) ;
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  List < String [ ] > VW = new ArrayList < String [ ] > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) VW . add ( input . readLine ( ) ) ;
  final List < String [ ] > ITE = Lists . newArrayList ( ) ;
  for ( String [ ] ite : ITE ) {
    final List < String [ ] > SLIST = new ArrayList < String [ ] > ( K + 1 ) ;
    int flag = 1 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      final String [ ] v = VW . get ( i ) ;
      final String [ ] w = VW . get ( i ) ;
      int LE = 0 ;
      for ( final String vw : v ) LE += ite [ Integer . parseInt ( vw ) - 1 ] ;
      if ( LE != w . length ) {
        flag = 0 ;
        break ;
      }
      int now = 0 ;
      for ( int j = 0 ;
      j < v . length ;
      j ++ ) {
        if ( now >= w . length ) {
          flag = 0 ;
          break ;
        }
        if ( SLIST . get ( Integer . parseInt ( v [ j ] ) ) != null && w . substring ( now , now + ite [ Integer . parseInt ( v [ j ] ) - 1 ] ) != SLIST . get ( Integer . parseInt ( v [ j ] ) ) ) {
          flag = 0 ;
          break ;
        }
        SLIST . set ( Integer . parseInt ( v [ j ] ) , w . substring ( now , now + ite [ Integer . parseInt ( v [ j ] ) - 1 ] ) ) ;
        now += ite [ Integer . parseInt ( v [ j ] ) - 1 ] ;
      }
      if ( flag == 0 ) break ;
    }
    if ( flag == 1 ) {
      for ( int s : SLIST . subList ( 1 , SLIST . size ( ) ) ) System . out . println ( s ) ;
      System . exit ( 0 ) ;
    }
  }
  return null ;
}
