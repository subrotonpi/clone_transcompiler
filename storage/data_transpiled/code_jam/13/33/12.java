static final int [ ] [ ] getAttacksByTime ( ) throws IOException {
  class Wall {
    int [ ] [ ] W = new int [ 4 ] [ 4 ] ;
    int [ ] [ ] E = new int [ 4 ] [ 4 ] ;
    int T = Integer . parseInt ( IN . readLine ( ) ) ;
    for ( int i = 1 ;
    i <= T ;
    i ++ ) {
      OUT . println ( "Case #" + i + ": " + singleTest ( IN , OUT ) ) ;
    }
    int i ;
    int j ;
    boolean success ;
    if ( className . equals ( "java.util.concurrent.ForkJoinPool.ForkJoinPool$Queue" ) ) {
      assert args . length == 2 ;
      IN = new FileInputStream ( args [ 0 ] , "rt" ) ;
      OUT = new FileOutputStream ( args [ 1 ] + ".out" ) ;
      main ( IN , OUT ) ;
      OUT . close ( ) ;
    }
    else {
      if ( i >= E . length ) return 0 ;
      else return E [ i ] ;
    }
  }
  int T = Integer . parseInt ( IN . readLine ( ) ) ;
  if ( args . length == 2 ) {
    assert args [ 0 ] . equals ( "java.util.concurrent.ForkJoinPool$Queue" ) ;
    IN = new FileInputStream ( args [ 0 ] + ".out" ) ;
    OUT = new FileOutputStream ( args [ 1 ] + ".out" ) ;
    main ( IN , OUT ) ;
    IN . close ( ) ;
  }
  else {
    if ( i >= E . length ) return 0 ;
    else return E [ i ] ;
  }
  int i ;
  boolean success ;
  int N = Integer . parseInt ( IN . readLine ( ) ) ;
  AttacksByTime [ ] attacksByTime = new AttacksByTime [ N ] ;
  for ( i = 0 ;
  i < N ;
  i ++ ) {
    int d = Integer . parseInt ( IN . readLine ( ) ) ;
    int n = Integer . parseInt ( IN . readLine ( ) ) ;
    int w = Integer . parseInt ( IN . readLine ( ) ) ;
    int e = Integer . parseInt ( IN . readLine ( ) ) ;
    int s = Integer . parseInt ( IN . readLine ( ) ) ;
    int dd = Integer . parseInt ( IN . readLine ( ) ) ;
    int dp = Integer . parseInt ( IN . readLine ( ) ) ;
    int ds = Integer . parseInt ( IN . readLine ( ) ) ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      attacksByTime [ j ]