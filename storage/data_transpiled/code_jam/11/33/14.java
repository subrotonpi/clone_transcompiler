public static final Scanner getScanner ( ) throws FileNotFoundException {
  final Scanner is = new Scanner ( System . getProperty ( "test.src" ) ) ;
  final int num_cases = Integer . parseInt ( is . nextLine ( ) ) ;
  for ( int i = 0 ;
  i <= num_cases ;
  i ++ ) {
    String [ ] words = is . nextLine ( ) . split ( " " ) ;
    final int N = Integer . parseInt ( words [ 0 ] ) ;
    final int L = Integer . parseInt ( words [ 1 ] ) ;
    final int H = Integer . parseInt ( words [ 2 ] ) ;
    words = is . nextLine ( ) . split ( " " ) ;
    final int [ ] nums = new int [ N ] ;
    for ( int w = 0 ;
    w < N ;
    w ++ ) nums [ w ] = Integer . parseInt ( words [ w ] ) ;
    boolean flag = false ;
    int ans = - 1 ;
    for ( int j = L ;
    j <= H ;
    j ++ ) {
      for ( int n : nums ) {
        if ( j % n != 0 && n % j != 0 ) {
          flag = true ;
          break ;
        }
      }
      if ( flag == false ) {
        ans = j ;
        break ;
      }
      else {
        flag = false ;
      }
    }
    if ( ans == - 1 ) {
      System . out . println ( "Case #" + ( i + 1 ) + ": NO" ) ;
    }
    else {
      System . out . println ( "Case #" + ( i + 1 ) + ": " + ans ) ;
    }
  }
  return is ;
}
