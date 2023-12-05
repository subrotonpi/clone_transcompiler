static final Function < Integer , Double > ip = new Function < Integer , Double > ( ) {
  @ Override public Double apply ( Integer input ) {
    return map ( input , Double :: parseDouble ) ;
  }
}
