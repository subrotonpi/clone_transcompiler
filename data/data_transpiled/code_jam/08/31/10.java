private static int solve ( ) {
  int lpk = Integer . parseInt ( readLine ( ) ) ;
  int keys = Integer . parseInt ( readLine ( ) ) ;
  int alph = Integer . parseInt ( readLine ( ) ) ;
  List < Integer > freq = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < freq . size ( ) ;
  i ++ ) {
    freq . add ( Integer . parseInt ( readLine ( ) ) ) ;
  }
  assert freq . size ( ) == alph ;
  assert lpk * keys >= alph ;
  Collections . sort ( freq ) ;
  Collections . reverse ( freq ) ;
  int presses = 0 ;
  for ( int repeat = 0 , index = lpk * keys ;
  index < keys ;
  index += keys ) {
    presses += Integer . bitCount ( freq . get ( index ) ) * ( repeat + 1 ) ;
  }
  return presses ;
}
