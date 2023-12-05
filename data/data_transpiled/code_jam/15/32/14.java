public static String T = Integer . toString ( new Scanner ( System . in ) . nextInt ( ) ) {
  {
    int best = - 1 ;
    for ( int i : xrange ( 1 , word . length ( ) + 1 ) ) {
      if ( target . substring ( 0 , word . length ( ) - i ) . equals ( word . substring ( word . length ( ) - i ) ) ) best = i ;
    }
    if ( best == - 1 ) return "" ;
  }
  {
    HashMap < Pair , Integer > start = new HashMap < Pair , Integer > ( ) ;
    start . put ( new Pair ( "" , 0 ) , 1 ) ;
    for ( int i : xrange ( S ) ) {
      HashMap < Pair , Integer > newstart = new HashMap < Pair , Integer > ( ) ;
      for ( Pair pair : start . keySet ( ) ) {
        for ( String letter : prob . keySet ( ) ) {
          String out = pair . first + letter ;
          int val = parse ( out , word ) ;
          int locProb = ( prob . get ( letter ) ) * start . get ( pair ) ;
          if ( val == word ) {
            Pair locPair = new Pair ( parse ( out . substring ( 1 ) , word ) , pair . second + 1 ) ;
            if ( newstart . containsKey ( locPair ) ) newstart . put ( locPair , locProb ) ;
            else newstart . put ( locPair , locProb ) ;
          }
          else {
            Pair locPair = new Pair ( parse ( out , word ) , pair . second ) ;
            if ( newstart . containsKey ( locPair ) ) newstart . put ( locPair , locProb ) ;
            else newstart . put ( locPair , locProb ) ;
          }
        }
      }
      start = newstart ;
    }
    int count = 0 ;
    int mymax = 0 ;
    for ( Pair < Integer , Integer > thing : newstart . keySet ( ) ) {
      prob = newstart . get ( thing ) ;
      count += prob * thing . second ;
      mymax = Math . max ( mymax , thing . second ) ;
    }
    return mymax - count ;
  }
  private static final double doprob ( ) {
    int [ ] read = new int [ S ] ;
    for ( int k = 0 ;
    k < S ;
    k ++ ) {
      read [ k ] = Integer . parseInt ( new String ( read [ k ] ) ) ;
    }
    int K = read [ 0 ] ;
    int L = read [ 1 ] ;
    int S = read [ 2 ]