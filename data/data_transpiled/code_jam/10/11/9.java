public static void for ( int i = 0 ;
i < xrange . length ;
i ++ ) {
  int n = Integer . parseInt ( readLine ( ) ) ;
  int K = Integer . parseInt ( readLine ( ) ) ;
  String [ ] l = new String [ xrange . length ] ;
  for ( int j = 0 ;
  j < xrange . length ;
  j ++ ) l [ j ] = readLine ( ) . substring ( 0 , n ) ;
  for ( int j = 0 ;
  j < xrange . length ;
  j ++ ) l [ j ] = l [ j ] . replace ( "." , "" ) . replaceAll ( "\\." , "" ) ;
  boolean blue = false ;
  boolean red = false ;
  for ( int j = 0 ;
  j < xrange . length ;
  j ++ ) {
    for ( int k = 0 ;
    k < xrange . length - K + 1 ;
    k ++ ) {
      if ( l [ j ] . substring ( k , k + K ) . equals ( "B" ) * K ) blue = true ;
      if ( l [ j ] . substring ( k , k + K ) . equals ( "R" ) * K ) red = true ;
      if ( StringUtils . isEmpty ( l [ j ] ) ) {
        blue = true ;
        if ( StringUtils . isEmpty ( l [ j ] ) ) red = true ;
      }
    }
  }
  for ( int j = 0 ;
  j < xrange . length - K + 1 ;
  j ++ ) {
    for ( int k = 0 ;
    k < xrange . length - K + 1 ;
    k ++ ) {
      if ( StringUtils . isEmpty ( l [ j + z ] ) ) {
        blue = true ;
        if ( StringUtils . isEmpty ( l [ j + z ] ) ) {
          red = true ;
        }
      }
    }
  }
  for ( int j = 0 ;
  j < xrange . length - K + 1 ;
  j ++ ) {
    for ( int k = 0 ;
    k < xrange . length - K ;
    k ++ ) {
      if ( StringUtils . isEmpty ( l [ j + z ] ) ) {
        blue = true ;
        if ( StringUtils . isEmpty ( l [ j + z ] ) ) {
          red = true ;
        }
      }
    }
  }
  if ( blue && red ) System . out . printf ( "Case #%i: Both" , i + 1 ) ;
  if ( blue && ! red ) System . out . printf ( "Case #%i: Blue" , i + 1 ) ;
  if ( ! blue && ! red ) System