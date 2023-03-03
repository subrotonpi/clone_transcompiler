public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < List < Integer >> a = new ArrayList < > ( ) ;
  List < List < Integer >> b = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  a . sort ( Comparator . comparing ( t -> - t . x ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    b . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  b . sort ( Comparator . comparing ( s -> s ) ) ;
  int c = 0 ;
  for ( List < Integer > t : a ) {
    for ( List < Integer > s : b ) {
      if ( t . x < s . x && t . y < s . y ) {
        c ++ ;
        b . remove ( s ) ;
        break ;
      }
    }
  }
  System . out . println ( n - b . size ( ) ) ;
}
