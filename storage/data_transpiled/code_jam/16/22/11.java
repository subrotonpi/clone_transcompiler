static final Scanner getScanner ( ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  final int l = scanner . nextInt ( ) ;
  assert scanner . hasNext ( ) ;
  String a = scanner . next ( ) ;
  final String b = scanner . next ( ) ;
  final int l = scanner . nextInt ( ) ;
  assert scanner . hasNext ( ) ;
  String besta = null ;
  String bestb = null ;
  int weight = ( l * ( l + 2 ) ) ;
  final char [ ] aa = new char [ l ] ;
  final char [ ] bb = new char [ l ] ;
  for ( int i = 0 ;
  i < l ;
  i ++ ) {
    System . out . println ( "Case #" + ( i + 1 ) + ":" ) ;
    scanner . next ( ) ;
  }
  for ( int i = 0 ;
  i < l ;
  i ++ ) {
    System . out . println ( "Case #" + ( i + 1 ) + ":" ) ;
    scanner . next ( ) ;
  }
  final char [ ] aa = new char [ l ] ;
  final char [ ] bb = new char [ l ] ;
  for ( int i = 0 ;
  i < l ;
  i ++ ) {
    System . out . println ( "Case #" + ( i + 1 ) + ":" ) ;
    scanner . next ( ) ;
  }
  final int [ ] besta = new char [ l ] ;
  final int [ ] bestb = new int [ l ] ;
  for ( int i = 0 ;
  i < l ;
  i ++ ) {
    for ( int j = 0 ;
    j < range1 ( i ) ;
    j ++ ) {
      if ( a [ j ] == b [ j ] != '?' ) {
      }
      else if ( a [ j ] == '?' ) {
        aa [ j ] = '0' ;
        bb [ j ] = '0' ;
      }
      else if ( a [ j ] == '?' ) {
        aa [ j ] = bb [ j ] ;
      }
      else if ( b [ j ] == '?' ) {
        bb [ j ] = aa [ j ] ;
      }
      else {
        System . out . println ( besta + " " + bestb ) ;
        return null ;
      }
    }
    if ( i == l ) {
      final int aaa = Integer . parseInt ( new String ( aa ) ) ;
      final int bbb = Integer . parseInt ( new String ( bb ) ) ;
      final int w = ( aaa - bbb ) ;
      if ( w <