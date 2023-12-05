input . stream ( ) . map ( input -> input . split ( " " ) ) . collect ( Collectors . toList ( ) ) ;
int n = input . nextInt ( ) ;
int a = input . nextInt ( ) ;
int b = input . nextInt ( ) ;
int count = 0 ;
for ( int num = 0 ;
num < n + 1 ;
num ++ ) {
  String num_str = String . valueOf ( num ) ;
  int all = 0 ;
  for ( int i = 0 ;
  i < num_str . length ( ) ;
  i ++ ) {
    all += Integer . parseInt ( num_str . substring ( i , i + 1 ) ) ;
  }
  if ( a <= all && all <= b ) {
    count += num ;
  }
}
System . out . println ( count ) ;
}
