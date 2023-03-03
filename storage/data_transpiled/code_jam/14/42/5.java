static final int [ ] solve ( int T ) {
  return Lists . transform ( Arrays . asList ( input ( ) . split ( " " ) ) , new Function < Integer , Integer > ( ) {
    @ Override public Integer apply ( Integer input ) {
      return Lists . transform ( input , new Function < Integer , Integer > ( ) {
        @ Override public Integer apply ( Integer input ) {
          return input . intValue ( ) ;
        }
      }
      ) ;
    }
  }
  ) . toArray ( new Integer [ 0 ] ) ;
}
