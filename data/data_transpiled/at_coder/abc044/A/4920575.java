public static int [ ] getOne ( int n , int k , int x , int y ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( n <= k ) {
    System . out . println ( x * n ) ;
  }
  else {
    System . out . println ( x * k + y * ( n - k ) ) ;
  }
  return new int [ ] {
    n , k , x , y }
    ;
  }
  