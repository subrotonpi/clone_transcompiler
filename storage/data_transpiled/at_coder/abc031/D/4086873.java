@ VisibleForTesting static Iterable < String > combinations ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> Codes = new ArrayList < > ( ) , Words = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String v = input . nextLine ( ) ;
    String w = input . nextLine ( ) ;
    Codes . add ( Lists . newArrayList ( Integer . parseInt ( v ) - 1 ) ) ;
    Words . add ( w ) ;
  }
  for ( int [ ] ptn : new int [ ] {
    1 , 4 }
    ) {
      List < String > ans = new ArrayList < > ( ) ;
      ans . add ( "" ) ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        List < Integer > code = Codes . get ( i ) ;
        List < String > word = Words . get ( i ) ;
        if ( word . size ( ) != Integer . parseInt ( ptn [ i ] ) ) {
          break ;
        }
      }
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        List < Integer > code = Codes . get ( i ) ;
        List < String > word = Words . get ( i ) ;
        int cnt = 0 ;
        for ( int c : code ) {
          ans . set ( c , word . subList ( cnt , cnt + ptn [ c ] ) ) ;
          cnt += ptn [ c ] ;
        }
      }
      System . out . println ( ans ) ;
      exit ( ) ;
    }
    return new Iterable < String > ( ) {
      @ Override public Iterator < String > iterator ( ) {
        return ans . iterator ( ) ;
      }
    }
    ;
  }
  