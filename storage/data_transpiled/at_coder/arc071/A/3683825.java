static void addChar ( List < String > l , String [ ] string ) {
  for ( String s : string ) {
    l . add ( s ) ;
  }
  int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  List < String > commonList = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String s = System . console ( ) . readLine ( ) ;
    if ( i == 0 ) {
      addChar ( commonList , s ) ;
    }
    else {
      List < String > tmp = new ArrayList < String > ( ) ;
      addChar ( tmp , s ) ;
      List < String > tmpC = new LinkedList < String > ( ) ;
      for ( String c : commonList ) {
        tmpC . add ( c ) ;
      }
      for ( String c : tmpC ) {
        if ( tmp . contains ( c ) ) {
          tmp . remove ( c ) ;
        }
        else {
          commonList . remove ( c ) ;
        }
      }
    }
  }
  if ( commonList . size ( ) == 0 ) {
    System . out . println ( "" ) ;
  }
  else {
    List < String > sorted = new ArrayList < String > ( ) ;
    Collections . sort ( sorted ) ;
    String s = "" ;
    for ( String c : sorted ) {
      s += c ;
    }
    System . out . println ( s ) ;
  }
}
