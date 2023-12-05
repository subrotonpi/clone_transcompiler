public static void initializeSolver ( ) {
}
{
  {
    int d = read ( ) ;
    int n = read ( ) ;
    int mx = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int k = read ( ) ;
      int s = read ( ) ;
      mx = Math . max ( ( d - k ) / s , mx ) ;
    }
    return Integer . toString ( d / mx ) ;
  }
  {
    int i ;
    String inputLine ;
    sReader . readInputBuffer ( ) ;
    sReader . readInputBuffer ( ) ;
    sReader . readInputBuffer ( ) ;
    sReader . readInputBuffer ( ) ;
    sReader . readInputBuffer ( ) ;
    tReader . readInputBuffer ( ) ;
    tWriter . writeInputBuffer ( ) ;
    tWriter . writeInputBuffer ( ) ;
  }
  {
    String outputFormat = "Case #%d: " ;
    String filename = input ( ) ;
    sReader = null ;
    tReader = null ;
    if ( filename != null ) {
      sReader = new BufferedReader ( new FileReader ( filename + ".in" ) ) ;
      sReader . close ( ) ;
      tWriter = new BufferedWriter ( new FileWriter ( filename + ".out" ) ) ;
    }
  }
}
