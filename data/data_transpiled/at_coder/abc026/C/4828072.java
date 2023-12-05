static final Scanner input = new Scanner ( System . in ) {
  private int [ ] par = new int [ n ] ;
  public Tree ( int n ) {
    this . par = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) par [ i ] = i ;
  }
  public void unite ( int par , int chi ) {
    par [ chi ] = par ;
  }
  public Set < Integer > getChild ( int par ) {
    Set < Integer > child = new HashSet < Integer > ( ) ;
    for ( int i = 0 ;
    i < par . length ;
    i ++ ) {
      if ( i != par && par [ i ] == par ) child . add ( i ) ;
    }
    return child ;
  }
  public int salary ( int x ) {
    if ( money [ x ] != - 1 ) return money [ x ] ;
    else {
      Set < Integer > chilist = member . getChild ( x ) ;
      if ( chilist . size ( ) == 0 ) {
        money [ x ] = 1 ;
        return money [ x ] ;
      }
      else {
        Set < Integer > sub = new HashSet < Integer > ( ) ;
        for ( int i = 0 ;
        i < chilist . size ( ) ;
        i ++ ) sub . add ( chilist . get ( i ) ) ;
        money [ x ] = - 1 ;
      }
    }
  }
}
