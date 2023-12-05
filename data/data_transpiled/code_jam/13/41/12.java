@ Sys public static void main ( String [ ] argv ) throws IOException {
  /* write out the message */
  stdout . write ( msg ) ;
  fo . write ( msg ) ;
  /* writeln out the message */
  write ( String . valueOf ( msg ) + '\n' ) ;
  /* readint #*/
  int testCase = Integer . parseInt ( fi . readLine ( ) ) ;
  /* readints #*/
  int [ ] ints = new int [ 4 ] ;
  for ( int X = 0 ;
  X < ints . length ;
  X ++ ) {
    ints [ X ] = Integer . parseInt ( fi . readLine ( ) ) ;
  }
  /* readstr */
  String fni = argv [ 0 ] + "-" + argv [ 1 ] + "-" + argv [ 2 ] + ".in" ;
  String fno = argv [ 0 ] + "-" + argv [ 2 ] + "-" + argv [ 3 ] + ".out" ;
  BufferedReader fi = new BufferedReader ( new FileReader ( fni ) ) ;
  BufferedWriter bw = new BufferedWriter ( new FileWriter ( fno ) ) ;
  /* cost */
  int N = fi . nextInt ( ) ;
  /* cost */
  int k = fi . nextInt ( ) ;
  /* cost */
  int numCases = fi . nextInt ( ) ;
  for ( int testCase = 1 ;
  testCase < 1 + numCases ;
  testCase ++ ) {
    final int N = fi . nextInt ( ) ;
    final int M = fi . nextInt ( ) ;
    Map < Integer , Integer > entry = new HashMap < Integer , Integer > ( ) ;
    Map < Integer , Integer > exit = new HashMap < Integer , Integer > ( ) ;
    Set < Integer > stops = new HashSet < Integer > ( ) ;
    int legit = 0 ;
    for ( int m = 0 ;
    m < M ;
    m ++ ) {
      final int o = fi . nextInt ( ) ;
      final int e = fi . nextInt ( ) ;
      int p = fi . nextInt ( ) ;
      if ( ! entry . containsKey ( o ) ) {
        entry . put ( o , p ) ;
      }
      else {
        entry . put ( o , p ) ;
      }
      if ( ! exit . containsKey ( e ) ) {
        exit . put ( e , p ) ;
      }
      else {
        exit . put ( e , p ) ;
      }
      stops . add ( e ) ;
      stops . add ( o ) ;
      legit += p * cost ( N , e - o )