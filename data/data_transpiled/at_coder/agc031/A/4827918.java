@ VisibleForTesting static final Scanner getScanner ( ) {
  return new Scanner ( System . in ) {
    @ Override public String nextLine ( ) {
      return System . in . nextLine ( ) ;
    }
    @ Override public List < int [ ] > list2d ( int a , int b , int c ) {
      return Arrays . asList ( new int [ ] [ ] {
        c }
        , b ) ;
      }
      @ Override public List < int [ ] > list3d ( int a , int b , int c , int d ) {
        return Arrays . asList ( new int [ ] [ ] {
          d }
          , c ) ;
        }
        @ Override public int [ ] ceil ( int x , int y ) {
          return Integer . MAX_VALUE - ( - x / y ) ;
        }
        @ Override public int [ ] INT ( ) {
          return Integer . parseInt ( input ( ) ) ;
        }
        @ Override public int [ ] MAP ( ) {
          return Integer . parseInt ( input ( ) ) ;
        }
        @ Override public int [ ] LIST ( ) {
          return list ( Integer . parseInt ( input ( ) ) ) ;
        }
      }
      ;
    }
    