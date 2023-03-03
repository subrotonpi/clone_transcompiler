static int getInt ( ) {
  return Integer . parseInt ( input . nextLine ( ) ) ;
}
public int [ ] getIntList ( ) {
  return Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
}
public int [ ] zeros ( int n ) {
  return new int [ n ] ;
}
public int [ ] getIntLines ( ) {
  return new int [ n ] ;
}
public int [ ] [ ] intMat ( int n ) {
  int [ ] [ ] mat = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) mat [ i ] = getIntList ( ) ;
  return mat ;
}
public int [ ] zeros2 ( int n , int m ) {
  return new int [ m ] [ n ] ;
}
private static char [ ] ALPHABET = new char [ 26 ] ;
private static final char [ ] DIGIT = new char [ 10 ] ;
private static final int N1097 = 10 * 9 + 7 ;
public static void dmp ( int x , String cmt ) {
  if ( debug ) {
    if ( cmt != null ) System . out . print ( cmt + ":  " ) ;
    System . out . println ( x ) ;
  }
}
public static int probC ( ) {
  int N = getInt ( ) ;
  int [ ] A = getIntList ( ) ;
  dmp ( ( N ) , A ) ;
  int sumFormer = A [ 0 ] ;
  int sumLatter = sum ( A , 1 ) ;
  int diff = Math . abs ( sumFormer - sumLatter ) ;
  dmp ( diff , "init" ) ;
  for ( int i = 1 ;
  i <= N - 1 ;
  i ++ ) {
    sumFormer += A [ i ] ;
    sumLatter -= A [ i ] ;
    diff = Math . min ( diff , Math . abs ( sumFormer - sumLatter ) ) ;
  }
}
public static int probC_v1 ( ) {
  int N = getInt ( ) ;
  int [ ] A = getIntList ( ) ;
  dmp ( ( N ) , A ) ;
  int diff = 10 * ( 9 + 6 ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    diff = Math . min ( diff , Math . abs ( sum ( A , 0 , i ) - sum ( A , i ) ) ) ;
  }
  return diff ;
}
}
