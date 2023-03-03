static final Runnable prework = new Runnable ( ) {
  public void run ( ) {
    int [ ] l = new int [ 1000 ] ;
    for ( int i = 0 ;
    i < l . length ;
    i ++ ) {
      l [ i ] = i ;
    }
  }
  public String toString ( ) {
    String msg = prework ( ) ;
    System . err . println ( "prework down with" + msg ) ;
    return msg ;
  }
  List < String > ans = new ArrayList < String > ( 20 ) ;
  for ( int i = 0 ;
  i < ans . size ( ) ;
  i ++ ) {
    ans . add ( ( String ) ans . get ( i ) ) ;
  }
  System . err . println ( ans ) ;
  return "above" ;
}
