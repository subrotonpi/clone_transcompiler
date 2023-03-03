static final String getSolutionName ( ) {
  final String problemName = "counting_sheep" ;
  runOnRealData = false ;
  final Set < Integer > digits = new HashSet < Integer > ( ) {
    {
      add ( Integer . valueOf ( N ) ) ;
    }
  }
  ;
  final Set < Integer > solution = new HashSet < Integer > ( ) {
    {
      add ( Integer . valueOf ( N ) ) ;
    }
  }
  ;
  @ Override public String toString ( ) {
    return "INSOMNIA" ;
  }
  ;
  @ Override public Integer getResult ( ) {
    if ( N == 0 ) {
      return "INSOMNIA" ;
    }
    Set < Integer > allDigits = new HashSet < Integer > ( ) {
      {
        add ( 10 ) ;
      }
    }
    ;
    int multiple = 0 ;
    while ( allDigits . size ( ) > 0 ) {
      multiple += N ;
      allDigits . clear ( ) ;
      allDigits . addAll ( digits ) ;
    }
    return multiple ;
  }
}
