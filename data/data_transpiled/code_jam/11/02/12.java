static final int T = Integer . parseInt ( System . console ( ) . readLine ( ) . trim ( ) ) ;
for ( int x = 1 ;
x <= T ;
x ++ ) {
  String [ ] tokens = System . console ( ) . readLine ( ) . split ( " " ) ;
  int index = 0 ;
  int C = Integer . parseInt ( tokens [ index ++ ] ) ;
  Map < Character , Set < String >> combine = new HashMap < Character , Set < String >> ( ) ;
  for ( int i = index ;
  i < index + C ;
  i ++ ) {
    char base1 = tokens [ i ] . charAt ( 0 ) ;
    char base2 = tokens [ i ] . charAt ( 1 ) ;
    String nonBase = tokens [ i ] . substring ( 2 ) ;
    if ( ! combine . containsKey ( base1 ) ) combine . put ( base1 , new HashSet < String > ( ) ) ;
    combine . get ( base1 ) . add ( base2 ) ;
    if ( ! combine . containsKey ( base2 ) ) combine . put ( base2 , new HashSet < String > ( ) ) ;
    combine . get ( base2 ) . add ( base1 ) ;
  }
  index += C ;
  int D = Integer . parseInt ( tokens [ index ++ ] ) ;
  Set < Character > oppose = new HashMap < Character , Set < String >> ( ) ;
  for ( int i = index ;
  i < index + D ;
  i ++ ) {
    char base1 = tokens [ i ] . charAt ( 0 ) ;
    char base2 = tokens [ i ] . charAt ( 1 ) ;
    if ( ! oppose . containsKey ( base1 ) ) oppose . put ( base1 , new HashSet < String > ( ) ) ;
    oppose . get ( base1 ) . add ( base2 ) ;
    if ( ! oppose . containsKey ( base2 ) ) oppose . put ( base2 , new HashSet < String > ( ) ) ;
    oppose . get ( base2 ) . add ( base1 ) ;
  }
  index += D ;
  int N = Integer . parseInt ( tokens [ index ++ ] ) ;
  String toInvoke = tokens [ index ++ ] ;
  List < String > elementList = new ArrayList < String > ( ) ;
  for ( int i = 0 ;
  i < toInvoke . length ( ) ;
  i ++ ) {
    String base = toInvoke . substring ( i , i + N ) ;
    if ( elementList . size ( ) > 0 && ( base =