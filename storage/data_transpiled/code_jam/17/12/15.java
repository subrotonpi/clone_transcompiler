private static boolean CheckServings ( float [ ] s ) {
  float mins = min ( s ) ;
  float maxs = max ( s ) ;
  if ( maxs / mins > 1.1 / 0.89 ) return false ;
  int v = ( int ) ( ( mins * maxs ) * 0.5 ) ;
  while ( ( v * 0.9 <= mins ) && ( v * 1.1 >= maxs ) ) return true ;
  v ++ ;
  return false ;
}
