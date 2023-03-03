public static void print ( ) {
  int s = Integer . parseInt ( input . readLine ( ) ) ;
  int h = s / 3600 ;
  int m = ( s - h * 3600 ) / 60 ;
  int se = ( s - h * 3600 - m * 60 ) ;
  System . out . println ( String . format ( "%02d:%02d:%02d" , h , m , se ) ) ;
}
