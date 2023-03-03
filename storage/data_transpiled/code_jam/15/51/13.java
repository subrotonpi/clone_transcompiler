public static Pair < Integer , Set < Integer >> parse ( String line1 , String line2 , String line3 ) {
  int n = Integer . parseInt ( line1 ) ;
  int d = Integer . parseInt ( line1 ) ;
  int s = Integer . parseInt ( line2 ) ;
  int aS = Integer . parseInt ( line1 ) ;
  int cS = Integer . parseInt ( line2 ) ;
  int rS = Integer . parseInt ( line3 ) ;
  int m = Integer . parseInt ( line1 ) ;
  int aM = Integer . parseInt ( line1 ) ;
  int cM = Integer . parseInt ( line1 ) ;
  int rM = Integer . parseInt ( line3 ) ;
  Map < Integer , Integer > salaries = new HashMap < > ( ) ;
  Map < Integer , Set < Integer >> managees = new HashMap < > ( ) ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    s = ( s * aS + cS ) % rS ;
    m = ( m * aM + cM ) % rM ;
    salaries . put ( i , s ) ;
    managees . put ( i , new HashSet < > ( ) ) ;
    managees . get ( m % i ) . add ( i ) ;
  }
  return new Pair < > ( d , salaries , managees ) ;
}
