static final Function < Integer , Integer > shift = new Function < Integer , Integer > ( ) {
  int shift = l . intValue ( ) ;
  @ Override public Integer apply ( Integer l , Integer n ) {
    return l . substring ( n ) + l . substring ( 0 , n ) ;
  }
}
