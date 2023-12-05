public static int [ ] [ ] getUpperCases ( ) throws IOException {
  final BufferedReader br = new BufferedReader ( new FileReader ( "B-large.in" ) ) ;
  final int N_cases = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int testCase = 0 ;
  testCase < N_cases ;
  testCase ++ ) {
    final int T = Integer . parseInt ( br . readLine ( ) ) ;
    final String [ ] aux = br . readLine ( ) . split ( "\\s+" ) ;
    final int NA = Integer . parseInt ( aux [ 0 ] ) ;
    final int NB = Integer . parseInt ( aux [ 1 ] ) ;
    final List < Pair < Integer , Integer >> atobd = new ArrayList < > ( ) ;
    final List < Pair < Integer , Integer >> atoba = new ArrayList < > ( ) ;
    for ( int t = 0 ;
    t < NA ;
    t ++ ) {
      aux = br . readLine ( ) . split ( "\\s+" ) ;
      final int dh = Integer . parseInt ( aux [ 0 ] ) ;
      final int dm = Integer . parseInt ( aux [ 1 ] ) ;
      final int d = dh * 60 + dm ;
      final int ah = Integer . parseInt ( aux [ 2 ] ) ;
      final int am = Integer . parseInt ( aux [ 3 ] ) ;
      final int a = ah * 60 + am + T ;
      atobd . add ( new Pair < > ( d , 1 ) ) ;
      atoba . add ( new Pair < > ( a , - 1 ) ) ;
    }
    final List < Pair < Integer , Integer >> btoad = new ArrayList < > ( ) ;
    final List < Pair < Integer , Integer >> btoaa = new ArrayList < > ( ) ;
    for ( int t = 0 ;
    t < NB ;
    t ++ ) {
      aux = br . readLine ( ) . split ( "\\s+" ) ;
      final int dh = Integer . parseInt ( aux [ 0 ] ) ;
      final int dm = Integer . parseInt ( aux [ 1 ] ) ;
      final int d = dh * 60 + dm ;
      final int ah = Integer . parseInt ( aux [ 2 ] ) ;
      final int am = Integer . parseInt ( aux [ 3 ] ) ;
      final int a = ah * 60 + am + T ;
      btoad . add ( new Pair < > ( d , 1 ) ) ;
      btoaa . add ( new Pair < > ( a , - 1 ) ) ;
    }
    final List < Pair < Integer