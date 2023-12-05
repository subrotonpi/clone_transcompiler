static final class blank ( ) {
  private static final class blank {
    if ( dict != null ) {
      this . dict = dict ;
    }
  }
  public boolean solve ( int [ ] flavors , int [ ] customers ) {
    HashSet < Integer > unhappy = new HashSet < Integer > ( ) ;
    for ( int i = 0 ;
    i < customers . length ;
    i ++ ) {
      if ( customers [ i ] == null ) {
        return false ;
      }
      flavors [ i ] . val = 1 ;
      unhappy . removeAll ( flavors [ i ] . malt ) ;
      for ( int j = 0 ;
      j < flavors [ i ] . unmalt . size ( ) ;
      j ++ ) {
        customers [ i ] . unmalt . remove ( flavors [ j ] . malt ) ;
        int m = customers [ i ] . malt . size ( ) ;
        if ( ( customers [ i ] . unmalt . size ( ) == 0 ) && ( ! customers [ i ] . unmalt . isEmpty ( ) && ! ( m != 0 && flavors [ m ] . val . isEmpty ( ) ) ) ) {
          unhappy . add ( j ) ;
        }
      }
    }
    return true ;
  }
  public void run ( int irun ) {
    int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int m = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    flavors = new ArrayList < Integer > ( ) ;
    customers = new ArrayList < Integer > ( ) ;
    for ( int i = xrange ( n ) ;
    i < m ;
    i ++ ) {
      customers . add ( blank ( new Integer ( 0 ) ) ) ;
      customers . add ( blank ( new Integer ( i ) ) ) ;
    }
    for ( int i = 0 ;
    i < customers . length ;
    i ++ ) {
      customers . add ( blank ( new Integer ( i ) ) ) ;
      customers . add ( blank ( new Integer ( i ) ) ) ;
    }
    for ( int i = 0 ;
    i < customers . length ;
    i ++ ) {
      customers . add ( blank ( new Integer ( i ) ) ) ;
      customers . add ( blank ( new Integer ( i ) ) ) ;
    }
    int flav = Integer . parseInt ( System . console ( ) . readLine ( ) ) - 1 ;
    int sense = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    if ( sense > 0 ) {
      customers . add ( flav ) ;
      flavors [ flav ] . malt . add