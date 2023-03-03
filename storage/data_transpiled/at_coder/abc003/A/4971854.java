public static void print ( int N ) {
  int i = Integer . parseInt ( input . nextLine ( ) ) ;
  double ave = 0 ;
  for ( i = 0 ;
  i < N ;
  i ++ ) {
    ave = ave + ( i + 1 ) * 10000 / N ;
  }
  System . out . println ( round ( ave ) ) ;
}
