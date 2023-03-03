public static void main ( List < Integer > l ) {
  Map < Integer , Integer > counts = new HashMap < > ( ) ;
  int answer = 0 ;
  for ( Integer nb : l ) {
    counts . put ( nb , counts . get ( nb ) + 1 ) ;
  }
  for ( Integer a : new ArrayList < > ( counts . keySet ( ) ) ) {
    int b = ( 1 << a . intValue ( ) ) - a ;
    Integer cA = counts . get ( a ) ;
    Integer cB = counts . get ( b ) ;
    if ( cB != null ) {
      if ( a == b ) {
        answer += cA / 2 ;
      }
      else {
        int increment = cA < cB ? cA : cB ;
        counts . put ( a , increment ) ;
        counts . put ( b , increment ) ;
        answer += increment ;
      }
    }
  }
  if ( Class . isEnum ( Integer . class ) ) {
    input . close ( ) ;
    System . out . println ( Main . main ( map ( Integer :: parseInt , input . split ( " " ) ) ) ) ;
  }
}
