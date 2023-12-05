public static String solve ( String s , int k ) {
  StringBuilder buff = new StringBuilder ( ) ;
  for ( int start = 0 ;
  start < s . length ( ) ;
  start ++ ) {
    for ( int end = 1 ;
    end <= k ;
    end ++ ) {
      if ( start + end > s . length ( ) ) {
        continue ;
      }
      buff . append ( s . substring ( start , start + end ) ) ;
    }
  }
  int len = buff . length ( ) ;
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    buff . append ( buff . charAt ( i ) ) ;
  }
  Collections . sort ( buff ) ;
  return buff . toString ( ) ;
}
