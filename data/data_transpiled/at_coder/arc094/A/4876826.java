public static void main ( String [ ] args ) {
  List < Integer > n = Lists . newArrayList ( ) ;
  for ( String s : input . split ( " " ) ) {
    n . add ( Integer . parseInt ( s ) ) ;
  }
  Collections . sort ( n ) ;
  int count = 0 ;
  do {
    if ( n . get ( 1 ) >= n . get ( 0 ) ) break ;
    n . get ( 1 ) + = 2 ;
    count ++ ;
  }
  while ( n . get ( 2 ) >= n . get ( 0 ) ) ;
  while ( n . get ( 2 ) >= n . get ( 0 ) ) break ;
  n . add ( n . get ( 0 ) ) ;
  Collections . sort ( n ) ;
  if ( Sets . newHashSet ( n ) . size ( ) == 1 ) {
    System . out . println ( count ) ;
  }
  else if ( n . stream ( ) . noneMatch ( n :: contains ) ) {
    System . out . println ( count - 1 ) ;
  }
  else {
    System . out . println ( count + 1 ) ;
  }
}
