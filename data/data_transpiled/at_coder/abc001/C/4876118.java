public static String fuko ( double deg ) {
  double d = deg / 10 ;
  if ( d < 11.25 || d >= 348.75 ) return "N" ;
  for ( int i = 0 ;
  i < ( int ) ( d >> 0 ? 1 : "NNE" ) ;
  i ++ ) {
    if ( d < ( int ) ( d >> 0 ? 1 : "NE" ) ) return "N" ;
  }
  for ( int i = 0 ;
  i < ( int ) ( d >> 0 ? 1 : "ENE" ) ) {
    if ( d < ( int ) ( d >> 0 ? 1 : "E" ) ) return "E" ;
  }
  for ( int i = 0 ;
  i < ( int ) ( d >> 0 ? 1 : "SE" ) ) {
    if ( d < ( int ) ( d >> 0 ? 1 : "SE" ) ) return "E" ;
  }
  for ( int i = 0 ;
  i < ( int ) ( d >> 0 ? 1 : "SSE" ) ) {
    if ( d < ( int ) ( d >> 0 ? 1 : "S" ) ) return "S" ;
    if ( d < ( int ) ( d >> 0 ? 1 : "SW" ) ) return "SW" ;
    if ( d < ( int ) ( d >> 0 ? 1 : "WSW" ) ) return "W" ;
    if ( d < ( int ) ( d >> 0 ? 1 : "W" ) ) return "W" ;
  }
  /* furyoku */
  for ( int i = 0 ;
  i < ( int ) ( d >> 0 ? 1 : "NW" ) ) {
    if ( d <= ( int ) ( d >> 0 ? 1 : "W" ) ) return "N" ;
  }
  for ( int i = 0 ;
  i < ( int ) ( d >> 0 ? 1 : "NW" ) ) {
    if ( d <= ( int ) ( d >> 0 ? 1 : "W" ) ) return "N" ;
  }
  deg = ( int ) ( d >> 0 ? 1 : "N" ) ;
  dis = ( int ) ( d >> 0 ? 1 : "S" ) ;
  dis = Math . round ( dis / 60 + 1e-7 ) ;
  String fk = fuko ( deg ) ;
  String fr = furyoku ( dis ) ;
  if (