static final private long timeToMinutes ( String s ) {
  return Long . parseLong ( s . substring ( 0 , 2 ) ) * 60 + Long . parseLong ( s . substring ( 3 ) ) ;
  /* fetch lines */
  /* parse trip */
  long dep , arr ;
  /* parse trip */
  dep = Long . parseLong ( s . substring ( 2 , 4 ) ) ;
  arr = Long . parseLong ( s . substring ( 4 , 6 ) ) ;
  /* assert dep < arr */
  return dep ;
  /* procCase */
}
