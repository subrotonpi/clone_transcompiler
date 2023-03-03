public static Function < String , Integer [ ] > f = new Function < String , Integer [ ] > ( ) {
  @ Override public Integer [ ] apply ( String input ) {
    return map ( input . split ( " " ) ) ;
  }
}
