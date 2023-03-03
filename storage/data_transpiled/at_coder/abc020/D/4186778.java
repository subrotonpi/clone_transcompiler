@ VisibleForTesting static Iterable < Integer > factorize ( int n ) {
  final int mod = ( int ) ( 1e9 + 7 ) ;
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final int k = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Integer > ps = new ArrayList < > ( ) ;
  final int _ = k ;
  for ( int i = 2 ;
  i <= ( int ) ( k * 0.5 ) ;
  i ++ ) {
    if ( _ % i == 0 ) ps . add ( i ) ;
    while ( _ % i == 0 ) _ /= i ;
  }
  if ( 1 < _ ) ps . add ( _ ) ;
  return new Iterable < Integer > ( ) {
    @ Override public Iterator < Integer > iterator ( ) {
      return new Iterator < Integer > ( ) {
        private final List < Integer > r = new ArrayList < > ( ) ;
        @ Override public boolean hasNext ( ) {
          return r . size ( ) > 0 ;
        }
        @ Override public Integer next ( ) {
          return r . get ( ) ;
        }
        @ Override public Integer next ( ) {
          return i ;
        }
      }
      ;
    }
    @ Override public Integer [ ] next ( ) {
      final List < Integer > pes = factorize ( x ) ;
      final List < Integer > pfs = Lists . transform ( pes , new Function < Integer , Integer > ( ) {
        @ Override public Integer apply ( Integer pe ) {
          return pe . intValue ( ) * pe . intValue ( ) ;
        }
      }
      ) ;
      final List < Integer > pds = Lists . transform ( pfs , new Function < Integer , Integer > ( ) {
        @ Override public Integer apply ( Integer u ) {
          return i ;
        }
      }
      ) ;
      final List < Integer > fcs = Lists . transform ( pds , new Function < Integer , Integer > ( ) {
        @ Override public Integer apply ( Integer u ) {
          return Math . min ( u . intValue ( ) , 1 ) ;
        }
      }
      ) ;
      return fcs ;
    }
  }
  ;
}
