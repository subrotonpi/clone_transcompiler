public static int [ ] input ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) , b = Integer . parseInt ( input . nextLine ( ) ) ;
  int diff = Math . abs ( a - b ) ;
  int ans = diff / 10 ;
  diff -= 10 * ans ;
  int [ ] koho = {
    Math . abs ( diff - 10 ) + 1 , Math . abs ( diff - 5 ) + 1 , diff }
    ;
    ans += min ( koho ) ;
    return koho ;
  }
  