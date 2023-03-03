static final String input ( ) {
  Scanner fin = new Scanner ( System . in ) ;
  PrintWriter fout = new PrintWriter ( new BufferedWriter ( new OutputStreamWriter ( System . out ) ) ) ;
  int numcases = Integer . parseInt ( fin . nextLine ( ) ) ;
  for ( int casenum = 1 ;
  casenum <= numcases ;
  casenum ++ ) {
    System . out . println ( casenum ) ;
    int [ ] info = new int [ 3 ] ;
    int [ ] lower = new int [ 3 ] ;
    int [ ] upper = new int [ 3 ] ;
    int start = upper [ 0 ] - lower [ 0 ] ;
    int lowi = 1 ;
    int uppi = 1 ;
    float lowslope = ( float ) ( lower [ 1 ] - lower [ 0 ] ) / ( lower [ 1 ] - lower [ 0 ] ) ;
    float uppslope = ( float ) ( upper [ 1 ] - upper [ 0 ] ) / ( upper [ 1 ] - upper [ 0 ] ) ;
    float area = 0 ;
    float height = ( float ) start ;
    int i = 0 ;
    while ( ( i < info [ 0 ] ) && ( i < lowi ) ) {
      slope = uppslope - lowslope ;
      area += ( height + slope / 2 ) ;
      height += slope ;
      if ( ( i < info [ 0 ] - 1 ) && ( i < lowi ) ) {
        lowi ++ ;
        lowslope = ( float ) ( lower [ 1 ] - lower [ lowi - 1 ] ) / ( lower [ lowi ] - lower [ lowi - 1 ] ) ;
      }
      if ( ( i < upper [ uppi ] - 1 ) && ( i < uppslope ) ) {
        uppi ++ ;
        uppslope = ( float ) ( upper [ uppi ] - upper [ upi - 1 ] ) / ( upper [ uppi - 1 ] - upper [ upi - 1 ] ) ;
      }
    }
    i ++ ;
  }
  fout . println ( "Case #" + casenum + ": " + solnstr ) ;
  return fout . toString ( ) ;
}
