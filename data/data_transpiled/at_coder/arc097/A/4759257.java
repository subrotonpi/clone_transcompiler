@ VisibleForTesting static Iterable < String > iterable ( ) {
  final String s = input . nextLine ( ) ;
  final int k = Integer . parseInt ( input . nextLine ( ) ) ;
  return new Iterable < String > ( ) {
    @ Override public Iterator < String > iterator ( ) {
      return new Iterator < String > ( ) {
        @ Override public boolean hasNext ( ) {
          return s . length ( ) > 0 ;
        }
        @ Override public String next ( ) {
          final List < String > subs = new ArrayList < > ( s . subList ( 0 , s . length ( ) ) ) ;
          final Set < String > writed = new HashSet < > ( ) ;
          for ( final String sub : subs ) {
            for ( int i = 0 ;
            i < subs . size ( ) ;
            i ++ ) {
              final String w = sub . substring ( 0 , i + 1 ) ;
              if ( ! writed . contains ( w ) ) {
                yield ( ) ;
                writed . add ( w ) ;
              }
            }
          }
          return super . next ( ) ;
        }
        @ Override public void remove ( ) {
          throw new UnsupportedOperationException ( ) ;
        }
      }
      ;
    }
  }
  ;
}
