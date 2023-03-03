public static void input ( ) {
  int q = Integer . parseInt ( input . readLine ( ) ) ;
  int h = Integer . parseInt ( input . readLine ( ) ) ;
  int s = Integer . parseInt ( input . readLine ( ) ) ;
  int d = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] a = {
    q * 8 , h * 4 , s * 2 , d }
    ;
    int min_s = Math . min ( a , 3 ) ;
    int min_d = Math . min ( a , 3 ) ;
    int b = n / 2 ;
    int c = n % 2 ;
    System . out . println ( b * min_d + c * min_s ) ;
  }
  