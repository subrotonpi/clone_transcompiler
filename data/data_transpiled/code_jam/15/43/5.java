@ BeforeClass public static int solve ( ) {
  final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final String line = stdin . readLine ( ) ;
  final int N = Integer . parseInt ( line ) ;
  final Map < String , List < Integer >> data = new LinkedHashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final String sentence = stdin . readLine ( ) ;
    for ( String word : sentence . split ( "\\s+" ) ) {
      data . put ( word , i ) ;
    }
  }
  final Numberjack . Model < Integer > model = new Numberjack . Model < > ( ) ;
  final Numberjack . VarArray < Integer > isEnglish = new Numberjack . VarArray < > ( N , 0 , 1 ) ;
  model . add ( isEnglish . get ( 0 ) == 1 ) ;
  model . add ( isEnglish . get ( 1 ) == 0 ) ;
  final Numberjack . Variable < Integer > common = new Numberjack . Variable < > ( 0 , 1000000 ) ;
  final Numberjack . Variable < Integer > zero = new Numberjack . Variable < > ( 0 , 0 ) ;
  final List < Integer > total = new ArrayList < > ( ) ;
  for ( final Map . Entry < String , List < Integer >> entry : data . entrySet ( ) ) {
    final Numberjack . Variable < Integer > haveChinese = new Numberjack . Variable < > ( 0 , 1 ) ;
    for ( final Integer i : entry . getValue ( ) ) {
      model . add ( haveChinese . get ( i ) <= isEnglish . get ( i ) ) ;
    }
    final Numberjack . Variable < Integer > haveEnglish = new Numberjack . Variable < > ( 0 , 1 ) ;
    for ( final Integer i : entry . getValue ( ) ) {
      model . add ( haveEnglish . get ( i ) >= isEnglish . get ( i ) ) ;
    }
    final Numberjack . Variable < Integer > haveBoth = new Numberjack . Variable < > ( 0 , 1 ) ;
    model . add ( haveBoth . get ( 0 ) >= haveEnglish . get ( 0 ) - haveFrenChinese . get ( 0 ) ) ;
    total . add ( haveBoth ) ;
  }
  model . add ( new Numberjack . Sum ( total ) <= common ) ;
  model . add ( new Numberjack . Minimize ( common ) ) ;
  final Numberjack solver = model . load ( "SCIP" ) ;
  solver . solve ( )