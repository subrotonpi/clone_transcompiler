private static void f = new BufferedReader ( new FileReader ( "data.txt" ) ) ;
PrintWriter g = new PrintWriter ( new FileWriter ( "data1.txt" ) ) ;
String line = new String ( ) ;
int t = Integer . parseInt ( line ) ;
for ( int i = 1 ;
i <= t ;
i ++ ) {
  line = new String ( ) ;
  int n = Integer . parseInt ( line ) ;
  List < List < Integer >> vines = new ArrayList < > ( ) ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    line = new String ( ) ;
    List < Integer > integers = new ArrayList < > ( ) ;
    for ( String s : line . split ( " " ) ) {
      integers . add ( Integer . parseInt ( s ) ) ;
    }
    vines . add ( integers ) ;
  }
  line = new String ( ) ;
  int d = Integer . parseInt ( line ) ;
  vines . add ( d ) ;
  Map < Integer , Integer > reachable = new HashMap < > ( ) ;
  reachable . put ( 0 , vines . get ( 0 ) ) ;
  for ( int j = 1 ;
  j <= n ;
  j ++ ) {
    reachable . put ( j , - 1 ) ;
  }
  for ( int j = 1 ;
  j <= n ;
  j ++ ) {
    int hook = vines . get ( j ) ;
    int hang = reachable . get ( j ) ;
    int hang = hang ;
    if ( ( vines . get ( k ) - hook > hang ) ) break ;
    reachable . put ( k , hang ) ;
  }
  String result ;
}
