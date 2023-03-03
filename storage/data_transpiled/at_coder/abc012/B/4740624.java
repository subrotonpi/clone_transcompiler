public static void print ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int h = n / 3600 ;
  int m = n % 3600 / 60 ;
  int s = n % 3600 % 60 ;
  System . out . println ( '%02d' % h + ':' + '%02d' % m + ':' + '%02d' % s ) ;
}
