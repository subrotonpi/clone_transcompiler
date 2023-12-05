public static final int [ ] [ ] getSteps ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < int [ ] > steps = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    steps . add ( new int [ ] {
      t , x , y }
      ) ;
    }
    int [ ] prev = {
      0 , 0 , 0 }
      ;
      for ( int [ ] step : steps ) {
        int t = step [ 0 ] ;
        int x = step [ 1 ] ;
        int y = step [ 2 ] ;
        int diff = Math . abs ( x - prev [ 0 ] ) + Math . abs ( y - prev [ 1 ] ) ;
        int time = t - prev [ 0 ] ;
        if ( diff > time || ( time - diff ) % 2 > 0 ) {
          System . out . println ( "No" ) ;
          System . exit ( 0 ) ;
        }
        prev = t ;
      }
      System . out . println ( "Yes" ) ;
    }
    