public static void main ( String input ) {
  for ( int case = 0 ;
  case <= input . length ( ) ;
  case ++ ) {
    int A = Integer . parseInt ( input . substring ( 0 , input . length ( ) - 1 ) ) ;
    int B = Integer . parseInt ( input . substring ( 0 , input . length ( ) - 1 ) ) ;
    int C = Integer . parseInt ( input . substring ( 1 , input . length ( ) - 1 ) ) ;
    int K = Integer . parseInt ( input . substring ( 2 , input . length ( ) - 1 ) ) ;
    System . out . println ( "Case #" + testCase + ": " + A * B * Math . min ( K , C ) ) ;
    Set < Integer > ans = new HashSet < Integer > ( ) ;
    for ( int i = 0 ;
    i < Math . min ( K , C ) ;
    i ++ ) {
      for ( int j = 1 ;
      j <= A ;
      j ++ ) {
        for ( int k = 1 ;
        k <= B ;
        k ++ ) {
          int a = j , b = k , c = k + ( i + j ) ;
          while ( c > C ) c -= C ;
          System . out . println ( a + " " + b + " " + c ) ;
        }
      }
    }
  }
}
