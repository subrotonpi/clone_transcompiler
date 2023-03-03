static final int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
for ( int testCase = 0 ;
testCase < T ;
testCase ++ ) {
  int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  int [ ] fsp = ArrayUtil . split ( System . console ( ) . readLine ( ) . split ( " " ) ) ;
  int [ ] tright = fs [ tleft ] ;
  for ( int j = 0 ;
  j < tright . length ;
  j ++ ) {
    if ( fsp [ j ] > right [ j ] ) {
      -- j ;
    }
  }
  tc . remove ( tright ) ;
  sumTwoCycles += left + right + 2 ;
  System . out . println ( "Case #" + ( testCase + 1 ) + ": " + Math . max ( bestCycle , sumTwoCycles ) ) ;
  continue ;
}
Set < Integer > tc = new HashSet < Integer > ( ) ;
Map < Integer , List < Integer >> tcEntries = new HashMap < Integer , List < Integer >> ( ) ;
for ( int i = 0 ;
i < fs . length ;
i ++ ) {
  if ( fs [ i ] == fs [ i ] ) {
    tc . add ( i ) ;
    tcEntries . put ( i , new ArrayList < Integer > ( ) ) ;
  }
}
Map < Integer , Integer > cycles = new HashMap < Integer , Integer > ( ) ;
Map < Integer , Integer > heights = new HashMap < Integer , Integer > ( ) ;
for ( int i = 0 ;
i < fs . length ;
i ++ ) {
  if ( hits [ i ] == 0 ) {
    int cur = i ;
    Set < Integer > set = new HashSet < Integer > ( ) ;
    set . add ( cur ) ;
    heights . put ( cur , 1 ) ;
    int height = 1 ;
    while ( true ) {
      int n = fs [ cur ] ;
      if ( cycles . containsKey ( n ) ) break ;
      if ( tc . containsKey ( n ) ) {
        tcEntries . get ( n ) . add ( new Integer ( height ) ) ;
        break ;
      }
      if ( set . contains ( n ) ) {
        int cyc = heights . get ( cur ) - heights . get ( n ) + 1 ;
        cycles . put ( n , cyc ) ;
        for ( int j = 0 ;
        j < cyc ;
        j ++ ) {
          n = fs [ cur ] ;
          cycles . put ( n , cyc )