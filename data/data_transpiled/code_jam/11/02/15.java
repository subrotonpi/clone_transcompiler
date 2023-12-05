@ Function public static Function < String , String > transform = new Function < String , String > ( ) {
  @ Override public String apply ( String s ) {
    return map ( s , "" ) ;
  }
}
;
for ( int testCase : xrange ( input ) ) {
  String [ ] inputStream = readLine ( ) . split ( " " ) ;
  int [ ] [ ] combine = new int [ 26 ] [ 26 ] ;
  for ( int i = 0 ;
  i < range ( Integer . parseInt ( inputStream . pop ( ) ) ) ;
  i ++ ) {
    int a = transform . apply ( inputStream . pop ( ) ) ;
    int b = transform . apply ( inputStream . pop ( ) ) ;
    int c = transform . apply ( inputStream . pop ( ) ) ;
    combine [ a ] [ b ] = combine [ b ] [ a ] = c ;
  }
  int [ ] [ ] opposed = new int [ 26 ] [ 26 ] ;
  for ( int i = 0 ;
  i < range ( Integer . parseInt ( inputStream . pop ( ) ) ) ;
  i ++ ) {
    int a = transform . apply ( inputStream . pop ( ) ) ;
    int b = transform . apply ( inputStream . pop ( ) ) ;
    opposed [ a ] [ b ] = combine [ b ] [ a ] ;
  }
  List < Integer > stack = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < range ( Integer . parseInt ( inputStream . pop ( ) ) ) ;
  i ++ ) {
    int newElement = transform . apply ( inputStream . peek ( ) ) ;
    stack . add ( newElement ) ;
    if ( stack . size ( ) >= 2 && combine [ stack . get ( stack . size ( ) - 2 ) ] [ stack . get ( stack . size ( ) - 1 ) ] != 26 ) {
      int combineElement = combine [ stack . get ( stack . size ( ) - 2 ) ] [ stack . get ( stack . size ( ) - 1 ) ] ;
      stack . remove ( stack . size ( ) - 2 ) ;
      stack . remove ( stack . size ( ) - 1 ) ;
      stack . add ( combineElement ) ;
      continue ;
    }
    for ( int opposedElement : opposed [ newElement ] ) {
      if ( stack . contains ( opposedElement ) ) {
        stack = new ArrayList < > ( ) ;
      }
    }
  }
  System . out . println ( StreamSupport . stream ( stack ) . filter ( x -> x != "'" ) . map ( x -> x + ": "