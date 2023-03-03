static void print ( String s ) {
  s = new String ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = s . length ( ) ;
  List < String > s1 = new LinkedList < > ( ) ;
  s1 . addAll ( Arrays . asList ( s . split ( " " ) ) ) ;
  Collections . sort ( s1 ) ;
  for ( int i = 0 ;
  i < 5 ;
  i ++ ) {
    s . add ( "" ) ;
  }
  int n1 ;
  if ( ( s1 . size ( ) >= 3 ) && ( s1 . size ( ) <= 3 ) ) n1 = 3 ;
  else n1 = s1 . size ( ) ;
  String [ ] first = new String [ n1 ] ;
  for ( int i = 0 ;
  i < n1 ;
  i ++ ) {
    first [ i ] = s1 . get ( i ) ;
  }
  String [ ] s2 = new String [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < first . length ;
    j ++ ) {
      if ( ( s . charAt ( i ) == first [ j ] ) ) {
        s2 [ i ] = s . charAt ( i ) ;
        s2 [ i ] = s . charAt ( i ) + s . charAt ( i + 1 ) + s . charAt ( i + 2 ) + s . charAt ( i + 3 ) + s . charAt ( i + 4 ) ;
        s2 [ i ] = s . charAt ( i ) ;
      }
    }
  }
  s2 = new String [ s2 . size ( ) ] ;
  s2 [ K ] = s2 . toArray ( ) ;
  Arrays . sort ( s2 ) ;
  String ans = s2 [ K - 1 ] ;
  System . out . println ( ans ) ;
}
