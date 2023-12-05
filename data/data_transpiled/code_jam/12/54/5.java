@ GwtIncompatible ( "oieastbg" ) private static String ORG = "oieastbg" ;
final String CHG = "01345789" ;
{
  int T = input . nextInt ( ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    int k = input . nextInt ( ) ;
    String s = scanner . nextLine ( ) ;
    assert k == 2 ;
    int n = s . length ( ) ;
    List < List < String >> ps = new ArrayList < > ( n ) ;
    for ( int i = 0 ;
    i < n - 1 ;
    i ++ ) {
      List < String > p = s . subList ( i , i + 2 ) ;
      ps . add ( p ) ;
      if ( p . contains ( ORG ) ) {
        int j = ORG . indexOf ( p . get ( 0 ) ) ;
        String q = CHG . substring ( j , j ) + p . get ( 1 ) ;
        ps . add ( q ) ;
      }
      if ( p . contains ( ORG ) ) {
        int j = ORG . indexOf ( p . get ( 1 ) ) ;
        String q = p . get ( 0 ) + CHG . substring ( j , k ) ;
        ps . add ( q ) ;
      }
      if ( p . contains ( ORG ) && p . contains ( ORG ) ) {
        int j = ORG . indexOf ( p . get ( 0 ) ) ;
        int k = ORG . indexOf ( p . get ( 1 ) ) ;
        String q = CHG . substring ( j , k ) + CHG . substring ( k , k ) ;
        ps . add ( q ) ;
      }
    }
    List < String > list = new LinkedList < > ( ps ) ;
    int ans = list . size ( ) + 1 ;
    while ( list . size ( ) > 0 ) {
      Set < String > mark = new HashSet < > ( ) ;
      mark . add ( list . get ( list . get ( 0 ) ) . toString ( ) ) ;
      do {
        boolean flag = false ;
        Set < String > mark2 = new HashSet < > ( ) ;
        for ( String s : mark ) {
          for ( List < String > p : list ) {
            if ( p . contains ( s ) ) {
              int i = p . indexOf ( s ) ;
              String y = i == 0 ? s . substring ( 1 , i ) : 0 ;
              if ( ! mark . contains ( y ) ) {
                mark2 . add ( y ) ;
                flag = true ;
              }
            }
          }
        }
        if (