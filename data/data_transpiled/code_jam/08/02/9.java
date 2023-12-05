static private int [ ] getline ( ) {
  final int nCases = Integer . parseInt ( getline ( ) ) ;
  trace ( nCases , "cases:" ) ;
  for ( int caseNum = 1 ;
  caseNum <= nCases ;
  caseNum ++ ) {
    trace ( "Case #" , caseNum ) ;
    int turnaroundTime = Integer . parseInt ( getline ( ) ) ;
    trace ( "turnaround_time:" , turnaroundTime ) ;
    int nTripsAToB = Integer . parseInt ( getline ( ) ) ;
    int [ ] aEvents = new int [ nTripsAToB ] ;
    trace ( aEvents , "trips A->B" ) ;
    for ( int i = 0 ;
    i < nTripsAToB ;
    i ++ ) {
      final int depTime = getline ( ) . split ( ":" ) ;
      assert Integer . parseInt ( depTime ) <= 23 ;
      assert Integer . parseInt ( mm ) <= 59 ;
      return new int [ ] {
        Integer . parseInt ( depTime ) * 60 + Integer . parseInt ( mm ) }
        ;
      }
      trace ( "aEvents:" , aEvents ) ;
      trace ( "bEvents:" , bEvents ) ;
      int nStartAtA = analyze_events ( aEvents , turnaroundTime ) ;
      int nStartAtB = analyze_events ( bEvents , turnaroundTime ) ;
      trace ( "Case #" + caseNum + ": " + nStartAtA + " " + nStartAtB ) ;
      for ( int i = 0 ;
      i < nTripsAToB ;
      i ++ ) {
        final int depTime = getline ( ) . split ( ":" ) ;
        assert Integer . parseInt ( depTime ) < arrTime ;
        aEvents [ i ] = convertTimeToMinutes ( depTime ) ;
        bEvents [ i ] = convertTimeToMinutes ( depTime ) ;
      }
      trace ( "trips B:" , aEvents ) ;
      trace ( "trips B:" , bEvents ) ;
      int nStartAtA = analyze_events ( aEvents , turnaroundTime ) ;
      int nStartAtB = analyze_events ( bEvents , turnaroundTime ) ;
      trace ( "trips B:" , aEvents ) ;
      int nTrainsWeNeedReadyAtStart = 0 ;
      int nTrainsReadycurrently = 0 ;
      for ( int i = 0 ;
      i