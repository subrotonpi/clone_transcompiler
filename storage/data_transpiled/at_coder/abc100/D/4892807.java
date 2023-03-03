@ VisibleForTesting static void reduce ( Operator operator ) {
  final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  System . setIn ( stdin ) ;
  li = new StringTokenizer ( stdin . readLine ( ) ) ;
  int N = Integer . parseInt ( li . nextToken ( ) ) ;
  int M = Integer . parseInt ( li . nextToken ( ) ) ;
  List < Integer > Cs = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Integer n = Integer . parseInt ( li . nextToken ( ) ) ;
    Cs . add ( n ) ;
  }
  int [ ] state = {
    0 , 0 , 0 , 0 }
    ;
    int maximum = 0 ;
    List < List < Integer >> trans = new ArrayList < > ( ) ;
    for ( int per = 0 ;
    per < 8 ;
    per ++ ) {
      int [ ] ops = {
        ( per & 4 ) >> 2 ? 1 : - 1 , ( per & 2 ) > 1 ? 1 : - 1 , ( per & 1 ) }
        ;
        trans . clear ( ) ;
        for ( int i = 0 ;
        i < N ;
        i ++ ) {
          trans . add ( Collections . unmodifiableList ( new ArrayList < > ( ops ) ) ) ;
        }
      }
      Collections . sort ( trans , new Comparator < Integer > ( ) {
        @ Override public int compare ( Integer o1 , Integer o2 ) {
          return - Math . max ( o1 , o2 ) ;
        }
      }
      ) ;
      maximum = Math . max ( maximum , Math . min ( max ( trans . get ( 0 ) , M ) , trans . get ( 0 ) ) ) ;
      System . out . println ( maximum ) ;
    }
    