static String parent ( String path ) {
  final Scanner fin = new Scanner ( System . in ) ;
  final int T = Integer . parseInt ( fin . nextLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    final int N = Integer . parseInt ( fin . nextLine ( ) ) ;
    final int M = Integer . parseInt ( fin . nextLine ( ) ) ;
    final Set < String > current = new HashSet < String > ( ) ;
    current . add ( "" ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      path = fin . nextLine ( ) ;
      while ( ! path . equals ( "" ) ) {
        current . add ( path ) ;
        path = parent ( path ) ;
      }
    }
    int count = 0 ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      path = fin . nextLine ( ) ;
      while ( ! path . equals ( "" ) ) {
        current . add ( path ) ;
        path = parent ( path ) ;
        count ++ ;
      }
    }
    System . out . println ( "Case #" + testCase + ": " + count ) ;
  }
  return path . substring ( 0 , path . lastIndexOf ( "/" ) ) ;
}
