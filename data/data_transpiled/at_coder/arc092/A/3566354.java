public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < List < Integer >> a = new ArrayList < > ( ) , b = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  a . forEach ( s -> b . add ( s ) ) ;
  b . sort ( Comparator . comparing ( s -> s . second ) ) ;
  int c = 0 ;
  for ( int i = a . size ( ) - 1 ;
  i >= 0 ;
  i -- ) {
    for ( List < Integer > t : a ) {
      for ( List < Integer > s : b ) {
        if ( t . first < s . first && t . second < s . second ) {
          c ++ ;
          b . remove ( s ) ;
          break ;
        }
      }
    }
  }
  System . out . println ( n - b . size ( ) ) ;
}
