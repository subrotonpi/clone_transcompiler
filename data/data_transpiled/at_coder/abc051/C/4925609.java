static final String getStdIn ( ) {
  final String ns = new String ( ) {
  }
  ;
  final Integer ni = new Integer ( ns ) ;
  final Function < String , Integer > nm = new Function < String , Integer > ( ) {
    @ Override public Integer apply ( String s ) {
      return Integer . parseInt ( s ) ;
    }
  }
  ;
  final Function < String , List < Integer >> nl = new Function < String , List < Integer >> ( ) {
    @ Override public List < Integer > apply ( String s ) {
      return Collections . singletonList ( n ) ;
    }
  }
  ;
  final Function < String , String > nsl = new Function < String , String > ( ) {
    @ Override public String apply ( String s ) {
      return s ;
    }
  }
  ;
  return nsl . apply ( ns ) ;
}
