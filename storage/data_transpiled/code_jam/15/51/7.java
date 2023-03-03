@ org . python . Method ( __doc__ = "division.html" ) public static org . python . Object division ( ) {
  org . python . Object mem = new org . python . Object ( ) {
    public org . python . Object run ( ) {
      if ( ! mem . contains ( args ) ) {
        mem . add ( args ) ;
      }
      return mem ;
    }
  }
  ;
  org . python . Object readint = new org . python . Object ( ) {
    public int asInt ( ) {
      return Integer . parseInt ( args . nextLine ( ) ) ;
    }
  }
  ;
  org . python . Object [ ] edges = new org . python . Object [ N ] ;
  int count = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    edges [ i ] = Integer . parseInt ( args . nextLine ( ) ) ;
  }
  List < Integer > starts = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    starts . add ( Integer . parseInt ( args . nextLine ( ) ) ) ;
  }
  List < Integer > ends = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ends . add ( Integer . parseInt ( args . nextLine ( ) ) ) ;
  }
  List < Integer > edges = new ArrayList < > ( ) ;
  edges . addAll ( ends ) ;
  int eCounts = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( args . length > 1 ) {
      eCounts ++ ;
    }
    else {
      eCounts -- ;
    }
  }
  System . out . println ( eCounts ) ;
  class ProblemSolver {
    @ org . python . Object {
      public void precalculate ( ) {
      }
    }
    public void process ( org . python . Object infile , org . python . Object ncase ) {
      throw new org . python . exceptions . NotImplementedError ( ) ;
    }
    public void run ( org . python . Object infile , org . python . Object outfile ) {
      int cases = Integer . parseInt ( args . nextLine ( ) ) ;
      for ( int i = 0 ;
      i < cases ;
      i ++ ) {
        System . out . println ( "Case #" + ( i + 1 ) ) ;
        int data = process ( infile , ncase ) ;
        outfile . write ( "Case #" + ( i + 1 ) + ": " + data ) ;
      }
    }
  }
  {
    List < Integer > list = new ArrayList < > ( ) ;
    for ( int i