public static void input ( ) {
  String s = input . nextLine ( ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  Set < String > a = new TreeSet < > ( new HashSet < > ( s ) ) . subList ( 0 , 5 ) ;
  for ( int num = 2 ;
  num < 6 ;
  num ++ ) {
    if ( s . length ( ) >= num ) {
      Set < String > b = new TreeSet < > ( new HashSet < > ( s ) ) ;
      for ( int i = 0 ;
      i < s . length ( ) ;
      i ++ ) {
        b . add ( s . substring ( i , i + num ) ) ;
      }
      a . addAll ( b ) ;
    }
    else break ;
  }
  System . out . println ( new ArrayList < > ( a ) . get ( k - 1 ) ) ;
}
