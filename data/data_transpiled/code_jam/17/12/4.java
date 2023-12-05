static final Comparator < Integer > numServings = new Comparator < Integer > ( ) {
  @ Override public int compare ( Integer amount , Integer recipe ) {
    int upperBound = amount * 10 / ( recipe * 9 ) ;
    int lowerBound = ( amount * 10 + recipe * 11 - 1 ) / ( recipe * 11 ) ;
    return lowerBound + upperBound ;
  }
}
