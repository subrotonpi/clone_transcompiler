static final void main ( String input , String output ) throws IOException {
  System . setProperty ( "DiamondInheritance" , "true" ) ;
  class DiamondInheritance implements DiamondInheritance {
    int N ;
    private boolean exists ( int N , int [ ] children , int K ) {
      int [ ] visited = new int [ N + 1 ] ;
      visited [ N ] = 0 ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        visited [ i ] = i ;
      }
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        if ( visited [ i ] == 1 ) {
          if ( i != K ) return true ;
          else return false ;
        }
        visited [ i ] = 1 ;
        for ( int j = 0 ;
        j < N ;
        j ++ ) {
          if ( exists ( N , children , i ) ) return true ;
        }
      }
      return false ;
    }
    private int sol ( int N , int [ ] children ) {
      for ( int i : xrange ( 1 , N + 1 ) ) {
        if ( exists ( N , children , i ) ) return 1 ;
      }
      return 0 ;
    }
    private List < Integer > testCases ( String input ) {
      Scanner fi = new Scanner ( input ) ;
      int T = Integer . parseInt ( fi . next ( ) ) ;
      for ( int i : xrange ( 1 , T + 1 ) ) {
        int N = Integer . parseInt ( fi . next ( ) ) ;
        List < Integer > [ ] children = new ArrayList [ N ] ;
        for ( int j : xrange ( N ) ) {
          List < Integer > row = new ArrayList < Integer > ( ) ;
          for ( String s : fi . next ( ) . split ( "\\s+" ) ) {
            row . add ( Integer . parseInt ( s ) ) ;
          }
          children [ i ] = row . toArray ( new Integer [ row . size ( ) ] ) ;
        }
        return children ;
      }
      fi . close ( ) ;
    }
    private void main ( String input , String output ) throws IOException {
      FileWriter fo = new FileWriter ( output ) ;
      DiamondInheritance problem = new DiamondInheritance ( ) ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        int N = Integer . parseInt ( fi . next ( ) ) ;
        List < Integer > children = new ArrayList < Integer > ( ) ;
        for ( int j = 0 ;
        j < N ;
        j ++ ) {
          children . add ( Integer . parseInt ( fi . next (