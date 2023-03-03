@ Produces @ ApplicationScoped public static void increment ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = 0 ;
  for ( int i : c . accumulate ( n , m ) . values ( ) ) {
    a += i * ( i - 1 ) / 2 ;
  }
  System . out . println ( a ) ;
}
