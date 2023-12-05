@ Sys . Sys public static boolean match ( String word , String pattern ) {
  for ( int i : xrange ( word . length ( ) ) ) {
    if ( ! pattern . substring ( i ) . contains ( word . charAt ( i ) ) ) {
      return false ;
    }
  }
  String line = in . readLine ( ) ;
  String [ ] parts = line . split ( " " ) ;
  int L = Integer . parseInt ( parts [ 0 ] ) ;
  int D = Integer . parseInt ( parts [ 1 ] ) ;
  int N = Integer . parseInt ( parts [ 2 ] ) ;
  List < String > dic = new ArrayList < String > ( ) ;
  for ( int i : xrange ( D ) ) {
    line = in . readLine ( ) ;
    String word = line . trim ( ) ;
    dic . add ( word ) ;
  }
  for ( int i : xrange ( 1 , N + 1 ) ) {
    line = in . readLine ( ) ;
    String pattern = line . trim ( ) ;
    List < Set < String >> ip = new ArrayList < Set < String >> ( ) ;
    int j = 0 ;
    Set < String > s ;
    while ( j < pattern . length ( ) ) {
      if ( pattern . charAt ( j ) == '(' ) {
        int p = pattern . indexOf ( ')' , j ) ;
        s = new LinkedHashSet < String > ( pattern . substring ( j + 1 , p ) ) ;
        j = p + 1 ;
      }
      else {
        s = new LinkedHashSet < String > ( pattern . substring ( j ++ ) ) ;
      }
      ip . add ( s ) ;
    }
    int c = 0 ;
    for ( String word : dic ) {
      if ( match ( word , ip ) ) {
        c ++ ;
      }
    }
    System . out . printf ( "Case #%d: %d%n" , i , c ) ;
  }
  return true ;
}
