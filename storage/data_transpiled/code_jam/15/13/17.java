@ VisibleForTesting static Iterable < List < Integer >> loadFile ( String chemin ) {
  return new Iterable < List < Integer >> ( ) {
    @ Override public Iterator < List < Integer >> iterator ( ) {
      return new AbstractIterator < List < Integer >> ( ) {
        @ Override protected List < Integer > parseInput ( BufferedReader reader ) throws IOException {
          int n = Integer . parseInt ( reader . readLine ( ) ) ;
          List < Integer > forest = new ArrayList < > ( ) ;
          for ( int i = 0 ;
          i < n ;
          i ++ ) {
            Arrays . stream ( reader . readLine ( ) . split ( " " ) ) . forEach ( x -> {
              int y = Integer . parseInt ( reader . readLine ( ) ) ;
              forest . add ( new Integer ( x ) ) ;
            }
            ) ;
          }
          return forest ;
        }
        @ Override public List < Integer > getForest ( ) {
          return new ArrayList < > ( ) ;
        }
      }
      ;
    }
    @ Override public Iterator < List < Integer >> iterator ( ) {
      return new AbstractIterator < List < Integer >> ( ) {
        @ Override protected List < Integer > computeNext ( ) {
          return new ArrayList < > ( ) ;
        }
        @ Override public boolean hasNext ( ) {
          return true ;
        }
        @ Override public Integer next ( ) {
          return Integer . parseInt ( reader . readLine ( ) ) ;
        }
      }
      ;
    }
  }
  ;
}
