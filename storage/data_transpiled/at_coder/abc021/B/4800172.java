public static String enter ( ) {
  int n = input . nextInt ( ) ;
  int org = list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int k = input . nextInt ( ) ;
  int arr = list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int t_arr = list ( arr + org ) ;
  return arr + org == t_arr ? "YES" : "NO" ;
}
