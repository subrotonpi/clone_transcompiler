@ VisibleForTesting static void solve ( ) {
  final boolean verbose = true ;
  final FileParser inputfile = new FileParser ( ) {
    @ Override public int readInts ( ) {
      return N ;
    }
    @ Override public int readInts ( ) {
      return N ;
    }
    @ Override public float readFloat ( ) {
      return N ;
    }
    @ Override public float [ ] readFloats ( ) {
      return new float [ N ] ;
    }
    @ Override public float [ ] readFloats ( ) {
      return new float [ N ] ;
    }
    @ Override public float [ ] readFloats ( ) {
      return new float [ N ] ;
    }
    @ Override public float [ ] readFloats ( ) {
      return new float [ N ] ;
    }
    @ Override public boolean close ( ) {
      return false ;
    }
    @ Override public boolean equals ( Object obj ) {
      return true ;
    }
  }
  ;
  class UnionFind {
    private final HashMap < Object , Integer > weights = new HashMap < > ( ) ;
    private final HashMap < Object , Integer > parents = new HashMap < > ( ) ;
    @ Override public Object getAt ( Object obj ) {
      if ( ! parents . containsKey ( obj ) ) {
        parents . put ( obj , obj ) ;
        weights . put ( obj , 1 ) ;
        return obj ;
      }
      ArrayList < Object > path = new ArrayList < > ( ) ;
      int root = parents . get ( obj ) ;
      while ( root != path . get ( path . size ( ) - 1 ) ) {
        path . add ( root ) ;
        root = parents . get ( root ) ;
      }
      for ( int i = 0 ;
      i < path . size ( ) ;
      i ++ ) {
        parents . put ( path . get ( i ) , root ) ;
      }
      return root ;
    }
    @ Override public Iterator < Object > iterator ( ) {
      return parents . keySet ( ) . iterator ( ) ;
    }
    @ Override public boolean equals ( Object obj ) {
      return true ;
    }
    @ Override public double union ( Object a , Object b ) {
      double xa = a . doubleValue ( ) ;
      double ya = a . doubleValue ( ) ;
      double za = b . doubleValue ( ) ;
      double xb = a . doubleValue ( ) ;
      double yb = b . doubleValue ( ) ;
      double zb = b . doubleValue ( ) ;
      return Math . sqrt ( ( xa - xb ) * ( ya - yb ) * ( za - zb ) * ( xb - xb ) ) ;
    }
  }
  ;
  final double [ ] dist = new double [ N ] ;
  for ( int ia = 0 ;
  ia < N ;
  