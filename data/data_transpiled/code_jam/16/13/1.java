public static final PrintStream out = new PrintStream ( new File ( args . getProperty ( "p3.out" ) ) ) ;
final BufferedReader fin = new BufferedReader ( new FileReader ( args . getProperty ( "p3.out" ) ) ) ;
final PrintStream fout = new PrintStream ( new FileOutputStream ( "p3.out" ) ) ;
final int T = Integer . parseInt ( fin . readLine ( ) ) ;
for ( int tt = 0 ;
tt < T ;
tt ++ ) {
  final int N = Integer . parseInt ( fin . readLine ( ) ) ;
  final int [ ] out = ArrayUtil . split ( fin . readLine ( ) . split ( " " ) ) ;
  final int len = out . length ;
  int ans = 0 ;
  final int [ ] best = new int [ len ] ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    best [ j ] = 0 ;
  }
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    int cur = i ;
    final int [ ] vis = new int [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      vis [ cur ] = 0 ;
    }
    vis [ cur ] = 1 ;
    while ( vis [ out [ cur ] ] == 0 ) {
      vis [ out [ cur ] ] = 1 ;
      cur = out [ cur ] ;
    }
    if ( out [ cur ] == i ) {
      ans = Math . max ( ans , Arrays . copyOf ( vis , vis . length ) ) ;
    }
    if ( out [ out [ cur ] ] == cur ) {
      best [ cur ] = Math . max ( best [ cur ] , Arrays . copyOf ( vis , vis . length ) ) ;
    }
  }
  int tot = 0 ;
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    if ( out [ out [ i ] ] == i ) {
      tot += best [ i ] + best [ out [ i ] ] - 2 ;
    }
  }
  tot /= 2 ;
  ans = Math . max ( ans , tot ) ;
  fout . println ( "Case #" + ( tt + 1 ) + ": " + ans ) ;
}
