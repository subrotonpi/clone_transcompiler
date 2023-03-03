@ VisibleForTesting static Map < Pair < Integer , Integer > , Integer > Pures = new HashMap < Pair < Integer , Integer > , Integer > ( ) {
  private final Map < Pair < Integer , Integer > , Integer > Factorials = new HashMap < Pair < Integer , Integer > , Integer > ( ) ;
  {
    File fin = new File ( inpfile ) ;
    File fout = new File ( inpfile + ".out" ) ;
    int CNT = Integer . parseInt ( fin . getAbsolutePath ( ) ) ;
    for ( int iCNT = 0 ;
    iCNT < CNT ;
    iCNT ++ ) {
      int N = Integer . parseInt ( fin . getAbsolutePath ( ) ) ;
      int NPures = 0 ;
      for ( int iN : xrange ( 1 , N ) ) {
        NPures += FindPures ( N , iN ) ;
      }
      String text = "Case #" + ( iCNT + 1 ) + ": " + ( NPures % 100003 ) ;
      System . out . println ( text ) ;
      fout . createNewFile ( ) ;
    }
  }
  private int FindPures ( int N , int I ) {
    if ( Pures . containsKey ( new Pair < Integer , Integer > ( N , I ) ) ) return Pures . get ( new Pair < Integer , Integer > ( N , I ) ) ;
    if ( I == 1 ) NPures = 1 ;
    else {
      NPures = 0 ;
      for ( int iI : xrange ( 1 , I ) ) {
        int n = N - I - 1 ;
        int k = I - iI - 1 ;
        if ( ( n >= k ) && ( k >= n ) ) {
          int combinations ;
          if ( Factorials . containsKey ( new Pair < Integer , Integer > ( n , k ) ) ) combinations = Factorials . get ( new Pair < Integer , Integer > ( n , k ) ) ;
          else combinations = ( Factorials . get ( new Pair < Integer , Integer > ( n , k ) ) ) ;
          Factorials . put ( new Pair < Integer , Integer > ( n , k ) , combinations ) ;
          NPures += FindPures ( I , iI ) * combinations ;
        }
      }
    }
    Pures . put ( new Pair < Integer , Integer > ( N , I ) , NPures ) ;
    return NPures ;
  }
}
