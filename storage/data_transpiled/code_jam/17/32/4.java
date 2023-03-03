static final String problem ( List < String > cameron , List < String > jamie ) {
  Collections . sort ( cameron , Collections . reverseOrder ( ) ) ;
  Collections . sort ( jamie , Collections . reverseOrder ( ) ) ;
  List < Integer > cbBlocks = new ArrayList < Integer > ( ) ;
  List < Integer > jbBlocks = new ArrayList < Integer > ( ) ;
  int cTime = 0 ;
  int jTime = 0 ;
  int jSwitchTime = 0 ;
  if ( ( jamie == null ) || ( cameron != null && cameron . get ( 0 ) . length ( ) > jamie . get ( 0 ) . length ( ) ) ) {
    String last = "c" ;
    lastEndTime = - 1440 + cameron . get ( 0 ) . length ( ) ;
    for ( int run = 0 ;
    run < number ;
    run ++ ) {
      int ac = nextLine ( in ) ;
      int aj = ac ;
      List < Integer > acs = new ArrayList < Integer > ( ) ;
      for ( ;
      ac < aj ;
      ac ++ ) {
        acs . add ( intSplit ( in ) ) ;
      }
      for ( ;
      aj < aj ;
      aj ++ ) {
        acs . add ( intSplit ( in ) ) ;
      }
      result += "Case #" + ( ++ run ) + ": " + problem ( ac , aj ) + "\n" ;
    }
  }
  else {
    last = "j" ;
    lastEndTime = - 1440 + jamie . get ( 0 ) . length ( ) ;
  }
  int switches = 0 ;
  while ( true ) {
    if ( cameron . isEmpty ( ) && jamie == null ) break ;
    if ( ( jamie == null ) || ( cameron != null && cameron . get ( cameron . size ( ) - 1 ) . length ( ) < jamie . get ( jamie . size ( ) - 1 ) . length ( ) ) ) {
      if ( last . equals ( "c" ) ) {
        cbBlocks . add ( cameron . get ( cameron . size ( ) - 1 ) - lastEndTime ) ;
      }
      else {
        cSwitchTime += cameron . get ( cameron . size ( ) - 1 ) - lastEndTime ;
        switches += 1 ;
      }
      jTime += jamie . get ( jamie . size ( ) - 1 ) - lastEndTime ;
      last = "j" ;
      lastEndTime = jamie . get ( jamie . size ( ) -