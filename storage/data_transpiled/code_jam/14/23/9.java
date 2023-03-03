@ NonNull public static < T > List < T > toArrayList ( ) throws IOException {
  File fileIn = new File ( "c.in" ) ;
  File fileOut = new File ( "c.out" ) ;
  int nCase = Integer . parseInt ( fileIn . nextLine ( ) ) ;
  class X {
    Set < T > adj = new HashSet < T > ( ) ;
    public int i ;
    int j ;
    int i ;
    int j ;
  }
  X connect ( X x , T y ) {
    x . adj . add ( y ) ;
    y . adj . add ( x ) ;
  }
  def disconnect ( X x , y ) {
    x . adj . remove ( y ) ;
    y . adj . remove ( x ) ;
  }
  for ( int iCase = 0 ;
  iCase < nCase ;
  iCase ++ ) {
    print ( iCase ) ;
    X [ ] xs = new X [ N ] ;
    int N = ( Integer ) fileIn . nextLine ( ) ;
    int M = ( Integer ) fileIn . nextLine ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      xs [ i ] = X . get ( i + 1 , Integer . parseInt ( fileIn . nextLine ( ) ) ) ;
    }
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      int a = ( Integer ) fileIn . nextLine ( ) ;
      int b = ( Integer ) fileIn . nextLine ( ) ;
      connect ( xs [ a ] , xs [ b ] ) ;
    }
    X start = Collections . min ( xs , new Comparator < X > ( ) {
      public int compare ( X o1 , X o2 ) {
        Set < T > reachable = new HashSet < T > ( ) ;
        {
          Set < T > flood = new HashSet < T > ( ) ;
          {
            if ( reachable . contains ( o1 ) || retreated . contains ( o1 ) ) return 0 ;
            reachable . add ( o1 ) ;
            for ( T y : o1 . adj ) flood . add ( y ) ;
            flood . add ( start ) ;
            return reachable . size ( ) + retreated . size ( ) == N ;
          }
        }
      }
      ) ;
      System . out . println ( "start" + stack [ stack . length - 1 ] . num ) ;
    }
  }
  for ( int iStep : xrange ( N - 1 ) ) {
    List < T > options = new ArrayList < T > ( ) ;
    for ( X parent : Lists . reverse ( stack ) ) {
      options .