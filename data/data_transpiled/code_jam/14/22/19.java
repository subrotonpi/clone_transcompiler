static final String [ ] getSolutionNames ( ) throws Exception {
  final String outDirName = "test_" ;
  final File out = new File ( outDirName ) ;
  final CountDownLatch latch = new CountDownLatch ( 1 ) ;
  solveSingleTest ( latch , t , data , out ) ;
  final File IN = new File ( out ) ;
  OUT . getParentFile ( ) . mkdirs ( ) ;
  final File out = new File ( out , "out" ) ;
  OUT . createNewFile ( ) ;
  OUT . createNewFile ( ) ;
  OUT . write ( "Case #" + ( t + 1 ) + ": " ) ;
  final int A = data . length ;
  final int B = data . length ;
  final int K = data . length ;
  int result = 0 ;
  System . out . println ( "TEST" + ( t ) ) ;
  for ( int a = 0 ;
  a < A ;
  a ++ ) {
    for ( int b = 0 ;
    b < B ;
    b ++ ) {
      if ( ( a & b ) < K ) {
        result ++ ;
      }
    }
  }
  OUT . write ( "" + result ) ;
  OUT . close ( ) ;
  latch . countDown ( ) ;
}
final String [ ] singleTestData = new String [ ] {
  "test" }
  ;
  final String [ ] data = new String [ T ] ;
  final CountDownLatch latch = new CountDownLatch ( T ) ;
  assertTrue ( latch . await ( ) ) ;
  final String in = in . toString ( ) ;
  assert in . endsWith ( ".in" ) ;
  final File IN = new File ( in ) ;
  in . getParentFile ( ) . mkdirs ( ) ;
  final int T = Integer . parseInt ( IN . toString ( ) ) ;
  final List < File > list = new ArrayList < File > ( ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    list . add ( getSingleTestData ( in ) ) ;
    IN . delete ( ) ;
  }
  final File outDir = new File ( in . getParentFile ( ) , "test" + ( t + 1 ) + ".out" ) ;
  final CountDownLatch LOCK = new CountDownLatch ( 5 ) ;
  final List < CountDownLatch > processes = new ArrayList < CountDownLatch > ( T ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    processes . add ( new CountDownLatch ( 1 ) ) ;
  }
  for ( CountDownLatch p = new CountDownLatch ( 1 ) ;
  t < T ;
  t ++ ) {
    TEST_RESULT . await ( ) ;
  }
  TEST_RESULT . close ( ) ;
  