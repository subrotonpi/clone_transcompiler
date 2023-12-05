@ VisibleForTesting static int min ( Scanner in ) {
  final int N = Integer . parseInt ( in . nextLine ( ) . split ( " " ) [ 0 ] ) ;
  final String S = in . nextLine ( ) . split ( " " ) [ 0 ] ;
  final List < Boolean > isWList = new ArrayList < Boolean > ( ) ;
  for ( String s : S . split ( " " ) ) {
    isWList . add ( s . equals ( "W" ) ? 1 : 0 ) ;
  }
  final int cumsumW = Math . max ( 0 , ( int ) isWList . get ( 0 ) ) ;
  final int cumsumE = Math . max ( 0 , ( int ) isEList . get ( 0 ) ) ;
  return cumsumW + cumsumE ;
}
