@ VisibleForTesting static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  List < int [ ] > xyList = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    xyList . add ( new int [ ] {
      Integer . parseInt ( input ) }
      ) ;
    }
    Map < String , Set < Integer >> xyMap = new HashMap < > ( ) ;
    for ( int [ ] xy : xyList ) {
      xyMap . get ( xy [ 0 ] ) . add ( xy [ 0 ] ) ;
      xyMap . get ( xy [ 1 ] ) . add ( xy [ 1 ] ) ;
      xyMap . get ( xy [ 0 ] ) . add ( xy [ 1 ] ) ;
      xyMap . get ( xy [ 1 ] ) . add ( xy [ 0 ] ) ;
    }
    int ans = 1 ;
    for ( int i = 0 ;
    i < 2 * N ;
    i ++ ) {
      String strBin = Integer . toBinaryString ( Integer . toBinaryString ( i ) ) . replaceAll ( " " , "" ) ;
      List < Integer > group = new ArrayList < > ( ) ;
      int index = - 1 ;
      while ( ( index = strBin . indexOf ( "1" , index + 1 ) ) != - 1 ) {
        if ( index == - 1 ) break ;
        group . add ( index + 1 ) ;
      }
      boolean ansFlag = true ;
      for ( Integer g : group ) {
        for ( Integer g1 : group ) {
          if ( ! g1 . equals ( xyMap . get ( g ) ) ) {
            ansFlag = false ;
            break ;
          }
        }
      }
      if ( ansFlag ) ans = Math . max ( group . size ( ) , ans ) ;
    }
    System . out . println ( ans ) ;
  }
  