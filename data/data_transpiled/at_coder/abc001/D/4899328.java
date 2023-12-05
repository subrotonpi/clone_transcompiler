static final int [ ] getStdin ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] [ ] se = new String [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    se [ i ] = input . nextLine ( ) . split ( "-" ) ;
  }
  int [ ] time = new int [ ( 24 + 1 ) * 12 + 1 ] ;
  for ( String [ ] sei : se ) {
    int start = Integer . parseInt ( sei [ 0 ] . substring ( 0 , 2 ) ) * 12 + Integer . parseInt ( sei [ 0 ] . substring ( 2 , 4 ) ) / 5 ;
    int end = Integer . parseInt ( sei [ 1 ] . substring ( 0 , 2 ) ) * 12 + Math . ceil ( Integer . parseInt ( sei [ 1 ] . substring ( 2 , 4 ) ) / 5 ) ;
    for ( int t = start ;
    t < end ;
    t ++ ) {
      time [ t ] = 1 ;
    }
  }
  boolean isRain = false ;
  for ( int i = 0 ;
  i < time . length ;
  i ++ ) {
    if ( time [ i ] == 1 && ! isRain ) {
      isRain = true ;
      start = i ;
    }
    if ( time [ i ] == 0 && isRain ) {
      isRain = false ;
      end = i ;
      String hStart = Integer . toString ( start / 12 ) . replaceAll ( "-" , "" ) ;
      String m_start = Integer . toString ( start % 12 * 5 ) . replaceAll ( "-" , "" ) ;
      String hEnd = Integer . toString ( end / 12 ) . replaceAll ( "-" , "" ) ;
      String m_end = Integer . toString ( end % 12 * 5 ) . replaceAll ( "-" , "" ) ;
      System . out . println ( hStart + m_start + "-" + hEnd + m_end ) ;
    }
  }
  return time ;
}
