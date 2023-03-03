static final Function < Integer , Integer > FUNCTION = new Function < Integer , Integer > ( ) {
  @ Override public Integer apply ( Integer n ) {
    int [ ] digits = new int [ n ] ;
    for ( char c : String . valueOf ( n ) . toCharArray ( ) ) {
      digits [ c ] = Integer . parseInt ( c ) ;
    }
    int sum = 0 ;
    for ( int digit : digits ) {
      sum += digit ;
    }
    return sum ;
  }
}
