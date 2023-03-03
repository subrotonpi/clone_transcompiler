static final String input = "Enter the ROAD list for the input in question" ;
final int N = Integer . parseInt ( input ) ;
final int M = Integer . parseInt ( input ) ;
final List < List < Integer >> ROAD = new ArrayList < > ( ) ;
for ( int i = 0 ;
i < M ;
i ++ ) {
  ROAD . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
}
final int Q = Integer . parseInt ( input ) ;
final List < List < Integer >> Query = new ArrayList < > ( ) ;
for ( int i = 0 ;
i < Q ;
i ++ ) {
  Query . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
}
ROAD . sort ( Comparator . comparing ( List :: get ) ) ;
Query . sort ( Comparator . comparing ( List :: get ) ) ;
ROAD . add ( new Integer [ ] {
  0 , 0 , 0 }
  ) ;
  final List < Integer > [ ] Group = new ArrayList [ N + 1 ] ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    Group [ i ] = new ArrayList < > ( ) ;
    for ( int j = 0 ;
    j < Q ;
    j ++ ) {
      Group [ j ] . add ( i ) ;
    }
  }
  {
    while ( Group [ j ] . get ( 0 ) != Group [ j ] ) {
      Group [ j ] . set ( 1 , Group [ j ] . get ( 1 ) + Group [ j ] . get ( 1 ) ) ;
      Group [ j ] . set ( 0 , Group [ j ] . get ( 0 ) ) ;
    }
  }
  int ry = 0 ;
  int qy = 0 ;
  final List < Integer > ANSLIST = new ArrayList < > ( ) ;
  ANSLIST . add ( null ) ;
  while ( qy < Q ) {
    final int v = Query [ qy ] . get ( 0 ) ;
    final int w = Query [ qy ] . get ( 1 ) ;
    int ind = Query [ qy ] . get ( 2 ) ;
    while ( w < ROAD [ ry ] . get ( ) && ry < M ) {
      Union ( ROAD [ ry ] . get ( ) , ROAD [ ry ] . get ( ) ) ;
      ry ++ ;
    }
    ANSLIST . set ( ind , Group [ q ] . get ( ) ) ;
    qy ++ ;
  }
  for