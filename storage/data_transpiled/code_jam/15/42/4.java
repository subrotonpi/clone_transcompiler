static final String print ( ) {
  final String [ ] words = System . in . split ( " " ) ;
  final String [ ] getInts = words ;
  assert false ;
  final int [ ] i = getInts . length ;
  assert i . length == 1 ;
  assert i [ 0 ] . equals ( "" ) ;
  final int T = getInt ( ) ;
  final double eps = 1e-12 ;
  for ( int caseNo = 1 ;
  caseNo <= T ;
  caseNo ++ ) {
    final String N = getWords [ caseNo ] ;
    final String V = getWords [ caseNo ] ;
    final String X = getWords [ caseNo ] ;
    final int N = Integer . parseInt ( N ) ;
    final double V = Double . parseDouble ( V ) ;
    final double X = Double . parseDouble ( X ) ;
    final TreeSet < Double > C_R_ordered = new TreeSet < Double > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      final double [ ] [ ] CR = getWords [ caseNo ] ;
      final double [ ] [ ] C = new double [ C . length ] [ C [ i ] . length ] ;
      for ( int j = 0 ;
      j < C . length ;
      j ++ ) C [ i ] [ j ] = CR [ 1 ] ;
      final double [ ] [ ] C = new double [ C . length ] [ C [ i ] . length ] ;
      for ( int j = 0 ;
      j < C . length ;
      j ++ ) C [ i ] [ j ] = C [ i ] [ j ] - X [ j ] ;
      if ( C . min ( ) > eps || C . max ( ) < - eps ) {
        print ( "Case #" + caseNo + ": IMPOSSIBLE" ) ;
        continue ;
      }
      final double qRate = C . mult ( R ) ;
      if ( qRate < 0 ) {
        C = - C . clone ( ) ;
        R = R . clone ( ) ;
        qRate = C . mult ( R ) ;
      }
      final int cold = ( C <= 0 ) ? C . length : C . length ;
      final int hot = ~ cold ;
      assert qRate > - eps ;
      double vRateSum = R [ cold ] . sum ( ) ;
      double qRateSum = qRate [ cold ] . sum ( ) ;
      for ( int hotIx = 0 ;
      hotIx < hot ;
      hotIx ++ ) {
        if ( qRateSum + qRate [