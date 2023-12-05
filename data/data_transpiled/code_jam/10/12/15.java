@ GwtIncompatible ( "B-small-attempt0" ) private static int FILE_NAME_BASE = "B-small-attempt0" ;
final int NUM_PROCESSES = 0 ;
@ SuppressWarnings ( "resource" ) Scanner in = new Scanner ( System . in ) ;
int delCost , insCost , threshold , length ;
int [ ] pixels = new int [ 256 ] ;
while ( in . hasNextLine ( ) ) {
  pixels [ 0 ] = in . nextInt ( ) ;
  assert pixels . length == length ;
}
/* solve the pixels */
int infinity = delCost * pixels . length + 1 ;
int [ ] best = new int [ 256 ] ;
for ( int i = 0 ;
i < pixels . length ;
i ++ ) {
  int pixel = pixels [ i ] ;
  int [ ] delBest = new int [ 256 ] ;
  for ( int j = 0 ;
  j < best . length ;
  j ++ ) {
    delBest [ j ] = cost + delCost ;
  }
  int [ ] insBest = new int [ 256 ] ;
  int cost = infinity ;
  for ( int j = 0 ;
  j < insBest . length ;
  j ++ ) {
    insBest [ j ] = cost ;
    cost = infinity ;
    for ( int oldValue : xrange ( 256 ) ) {
      int delta = Math . abs ( pixel - oldValue ) ;
      if ( threshold == 0 ) {
        if ( delta == 0 ) {
          numInserts = 0 ;
        }
        else {
          continue ;
        }
      }
      else {
        numInserts = Math . max ( 0 , ( delta - 1 ) / threshold ) ;
      }
      cost = Math . min ( cost , best [ j ] + insCost * numInserts ) ;
    }
    insBest [ pixels [ i ] ] = cost ;
    int [ ] changeBest = new int [ 256 ] ;
    for ( int j = 0 ;
    j < insBest . length ;
    j ++ ) {
      int newValue = j ;
      cost = infinity ;
      for ( int oldValue : xrange ( 256 ) ) {
        if ( Math . abs ( oldValue - newValue ) <= threshold ) {
          cost = Math . min ( cost , best [ j ] + Math . abs ( newValue - pixel ) ) ;
        }
      }
      changeBest [ j ] = newValue ;
    }
    best = Arrays . copyOf ( costs , Math . min ( insBest . length , delBest . length ) ) ;
  }
  in . close ( ) ;
  FileWriter out = new FileWriter ( FILE_NAME_BASE + ".out" ) ;
  for ( int testCase = 0 ;
  testCase < NUM_PROCESSES