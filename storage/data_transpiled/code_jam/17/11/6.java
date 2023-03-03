public static String process ( String input ) {
  Character first = null ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    if ( input . charAt ( i ) != '?' && first == null ) {
      first = input . charAt ( i ) ;
    }
  }
  if ( first == null ) {
    return null ;
  }
  char [ ] z = new char [ input . length ( ) ] ;
  Character last = first ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    if ( input . charAt ( i ) == '?' ) {
      z [ i ] = last ;
    }
    else {
      z [ i ] = input . charAt ( i ) ;
      last = input . charAt ( i ) ;
    }
  }
  return new String ( z ) ;
}
int tt = Integer . parseInt ( readLine ( ) ) ;
for ( int t : xrange ( 1 , tt + 1 ) ) {
  char [ ] y = new char [ t ] ;
  int n = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  int m = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  for ( int i : xrange ( n ) ) {
    y [ i ] = process ( readLine ( ) . trim ( ) ) ;
  }
  char [ ] u = new char [ n ] ;
  first = null ;
  for ( char c : y ) {
    if ( c != null && first == null ) {
      first = c ;
    }
  }
  char [ ] z = new char [ y . length ] ;
  last = first ;
  System . out . println ( "Case #" + t + ":" ) ;
  for ( char c : y ) {
    if ( c == null ) {
      System . out . println ( last ) ;
    }
    else {
      System . out . println ( c ) ;
      last = c ;
    }
  }
  return new String ( z ) ;
}
