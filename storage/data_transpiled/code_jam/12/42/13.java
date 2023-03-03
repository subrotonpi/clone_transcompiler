private static void f = new BufferedReader ( new FileReader ( "data.txt" ) ) ;
PrintWriter g = new PrintWriter ( new FileWriter ( "data1.txt" ) ) ;
String line = new String ( ) ;
int t = Integer . parseInt ( line ) ;
for ( int i = 1 ;
i <= t ;
i ++ ) {
  line = new String ( line ) ;
  final int n = ( Integer . parseInt ( line ) ) ;
  final int w = ( Integer . parseInt ( line ) ) ;
  final int l = ( Integer . parseInt ( line ) ) ;
  line = new String ( line ) ;
  final int [ ] [ ] radii = new int [ n ] [ l ] ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    radii [ j ] = Integer . parseInt ( line ) ;
  }
  final double [ ] [ ] points = new double [ n ] [ 2 ] ;
  int y = 0 ;
  int j = 0 ;
  int check = 0 ;
  while ( j < n ) {
    points [ j ] [ 0 ] = y ++ ;
    do {
      if ( radii [ j ] > w ) break ;
      if ( radii [ j ] [ 1 ] > w ) {
        y = y + Math . max ( radii [ j ] , j ) ;
        check = j ;
      }
    }
    while ( j < n ) ;
  }
  String result = "" ;
  for ( int u : points ) {
    result += String . valueOf ( u [ 0 ] ) ;
    result += " " ;
    result += String . valueOf ( u [ 1 ] ) ;
    result += '\n' ;
  }
  g . println ( string ) ;
}
}
