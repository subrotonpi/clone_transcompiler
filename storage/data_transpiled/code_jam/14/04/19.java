public static final String getDoubleByDouble ( ) throws Exception {
  final String inputFileName = "./D-large.in" ;
  final String outputFileName = "./D-large.out" ;
  if ( className . equals ( "org.apache.hadoop.util.StringUtils.fastmath" ) ) {
    BufferedReader bufferedReader = new BufferedReader ( new FileReader ( inputFileName ) ) ;
    BufferedWriter bufferedWriter = new BufferedWriter ( new FileWriter ( outputFileName ) ) ;
    String fileLine = bufferedReader . readLine ( ) ;
    fileLine = fileLine . replace ( "\n" , "" ) ;
    int numCases = Integer . parseInt ( fileLine ) ;
    int caseNum = 1 ;
    while ( true ) {
      fileLine = bufferedReader . readLine ( ) ;
      if ( fileLine == null || fileLine . equals ( "\n" ) ) {
        bufferedReader . close ( ) ;
        break ;
      }
      fileLine = fileLine . replace ( "\n" , "" ) ;
      int N = Integer . parseInt ( fileLine ) ;
      fileLine = bufferedReader . readLine ( ) ;
      List < Double > N_list = CollectionUtils . map ( Double . parseDouble , fileLine ) ;
      fileLine = bufferedReader . readLine ( ) ;
      List < Double > K_list = CollectionUtils . map ( Double . parseDouble , fileLine ) ;
      Collections . sort ( N_list ) ;
      Collections . sort ( K_list ) ;
      int N_index = 0 ;
      int K_index = 0 ;
      int kenWins = 0 ;
      do {
        if ( N_index == N || K_index == N ) break ;
        if ( K_list . get ( K_index ) > N_list . get ( N_index ) ) kenWins ++ ;
        N_index ++ ;
        K_index ++ ;
      }
      while ( true ) ;
      int fair_wins = N - kenWins ;
      N_index = 0 ;
      K_index = 0 ;
      int cheat_wins = 0 ;
      do {
        if ( N_index == N || K_index == N ) break ;
        if ( N_list . get ( N_index ) > K_list . get ( K_index ) ) cheat_wins ++ ;
        N_index ++ ;
        K_index ++ ;
      }
      while ( true ) ;
      bufferedWriter . write ( "Case #" + caseNum + ": " + cheat_wins + " " + fair_wins + "\n" ) ;
      System . out . println ( caseNum ) ;
      caseNum ++ ;
    }
    bufferedWriter . close ( ) ;
  }
  return inputFileName ;
}
