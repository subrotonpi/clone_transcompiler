public static void input ( ) {
  String s = input . nextLine ( ) ;
  String last = "zyxwvutsrqponmlkjihgfedcba" ;
  if ( s . equals ( last ) ) System . out . println ( - 1 ) ;
  exit ( ) ;
  Set < Character > map = new HashSet < Character > ( ) ;
  for ( char c : s . toCharArray ( ) ) map . add ( c ) ;
  Set < Character > lest = new HashSet < Character > ( ) ;
  for ( char c : last ) lest . add ( c ) ;
  if ( lest . size ( ) > 0 ) System . out . println ( s + new TreeSet < Character > ( lest ) . first ( ) ) ;
  exit ( ) ;
  List < Character > m = new ArrayList < Character > ( ) ;
  m . add ( s . charAt ( s . length ( ) - 1 ) ) ;
  for ( int i = 25 ;
  i >= 0 ;
  i -- ) {
    for ( int n = 0 ;
    n < m . size ( ) ;
    n ++ ) {
      if ( s . charAt ( i ) < n ) System . out . println ( s . substring ( 0 , i ) + n ) ;
      exit ( ) ;
    }
    m . add ( s . charAt ( i ) ) ;
  }
}
