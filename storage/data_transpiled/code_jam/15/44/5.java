private static Map < Integer , List < Integer >> st3 = Maps . newHashMap ( ) ;
Map < Integer , List < Integer >> no3 = Maps . newHashMap ( ) ;
{
  for ( int i = 1 ;
  i <= 3 ;
  i ++ ) {
    st3 . put ( i , new ArrayList < Integer > ( 8 ) ) ;
    no3 . put ( i , new ArrayList < Integer > ( 8 ) ) ;
  }
  st3 . get ( 1 ) . set ( - 1 ) ;
  no3 . get ( 1 ) . set ( - 1 ) ;
  for ( int i = 1 ;
  i <= 100 ;
  i ++ ) {
    for ( int j = 1 ;
    j <= 3 ;
    j ++ ) {
      st3 . get ( j ) . add ( no3 . get ( j ) . get ( - 2 ) ) ;
      no3 . get ( j ) . add ( 0 ) ;
    }
  }
  String s = "\n" ;
  if ( s == null ) s = "" ;
  if ( s . length ( ) == 0 ) return Collections . emptyList ( ) ;
  s = s . replaceAll ( " " , "" ) ;
  if ( tfile != null ) tfile . print ( s ) ;
  else {
    System . out . println ( s ) ;
  }
  if ( outputFormat == 0 ) {
    solve ( ) ;
  }
  else {
    initialize ( ) ;
    int totalCases = Integer . parseInt ( read ( 0 ) ) ;
    for ( int caseNumber = 1 ;
    caseNumber <= totalCases ;
    caseNumber ++ ) {
      write ( outputFormat . replace ( "%d" , Integer . toString ( caseNumber ) ) ) ;
      solve ( ) ;
    }
  }
  no3 . get ( 1 ) . set ( st3 . get ( 1 ) . get ( - 2 ) ) ;
  no3 . get ( 3 ) . set ( ( st3 . get ( 1 ) . get ( - 3 ) + st3 . get ( 3 ) . get ( - 3 ) ) * 3 + st3 . get ( 3 ) . get ( - 2 ) ) ;
  no3 . get ( 4 ) . set ( ( st3 . get ( 1 ) . get ( - 4 ) + st3 . get ( - 4 ) . get ( - 2 ) ) * 4 + st3 . get ( 4 ) . get ( - 2 ) ) ;
  no3 . get ( 12 ) . set ( ( st3 . get ( 1 ) . get ( - 3 ) + st3