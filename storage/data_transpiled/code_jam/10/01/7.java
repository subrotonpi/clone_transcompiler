@ GwtIncompatible ( "java.util.regex.Pattern" ) public static Pattern . Capture < Integer > readLine ( ) {
  return new Pattern . Capture < Integer > ( new InitialPatternCondition < Integer > ( Integer . class ) {
    @ Override public Integer valueOf ( String s ) {
      return Integer . parseInt ( s ) ;
    }
    @ Override public Float valueOf ( String s ) {
      return Float . parseFloat ( s ) ;
    }
    @ Override public Integer [ ] valueOf ( Integer n ) {
      return Integer . parseInt ( s . toString ( ) ) ;
    }
    @ Override public Integer [ ] valueOf ( String s ) {
      return Integer . parseInt ( s . substring ( 0 , s . indexOf ( ' ' ) ) ) ;
    }
    @ Override public Integer [ ] valueOf ( Integer foo ) {
      return Integer . parseInt ( s . substring ( 0 , s . indexOf ( ' ' ) ) ) ;
    }
    @ Override public Integer [ ] valueOf ( Integer foo ) {
      return Integer . parseInt ( s . substring ( 0 , s . indexOf ( ' ' ) ) ) ;
    }
    @ Override public Integer [ ] valueOf ( Integer foo ) {
      return Integer . parseInt ( s . substring ( 0 , s . indexOf ( ' ' ) ) ) ;
    }
    @ Override public Integer [ ] valueOf ( Integer foo ) {
      return Integer . parseInt ( s . substring ( 0 , s . indexOf ( ' ' ) ) ) ;
    }
    @ Override public Integer [ ] valueOf ( Integer foo ) {
      return Integer . parseInt ( s . substring ( 0 , s . indexOf ( ' ' ) ) ) ;
    }
  }
  ) ;
}
