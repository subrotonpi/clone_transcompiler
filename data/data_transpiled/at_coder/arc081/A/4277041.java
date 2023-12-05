public static int N = Integer . parseInt ( input ) {
  int [ ] l = ArrayUtil . parseInt ( input . nextLine ( ) ) . split ( " " ) ;
  Map < Integer , Integer > h = new HashMap < > ( ) ;
  int m1 = 0 ;
  int m2 = 0 ;
  for ( int i : l ) {
    if ( ( i < 0 ) || ( i < m1 ) ) {
      h . putAll ( i , 1 ) ;
    }
    else {
      h . remove ( i ) ;
      if ( ( i > m1 ) ) {
        m2 = m1 ;
        m1 = i ;
      }
      else {
        m2 = Math . max ( m2 , i ) ;
      }
    }
  }
  return m1 * m2 ;
}
