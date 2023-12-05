public static int N = Integer . parseInt ( input ) {
  String S = input . nextLine ( ) ;
  int beamWidth = 3 * 10 * 4 ;
  Set < String > nextSet = new HashSet < String > ( ) ;
  nextSet . add ( "" ) ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    String [ ] a = new String [ beamWidth ] ;
    nextSet . add ( a [ 0 ] ) ;
    nextSet . add ( a [ 1 ] ) ;
    for ( String s : a ) {
      add ( c != s . charAt ( 0 ) ? s + s : s . substring ( 1 ) ) ;
      add ( s + c != s . charAt ( s . length ( ) - 1 ) ? s : s . substring ( 0 , s . length ( ) - 1 ) ) ;
    }
  }
  Set < String > ss = new TreeSet < String > ( nextSet ) ;
  return ss . size ( ) ;
}
