public static int [ ] [ ] parse ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int [ ] [ ] L = new int [ 8 ] [ 8 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input ) ;
    int y = Integer . parseInt ( input ) ;
    int z = Integer . parseInt ( input ) ;
    L [ i ] = new int [ ] {
      x , y , z }
      ;
    }
    List < Integer > L1 = new ArrayList < > ( L ) ;
    List < Integer > L2 = new ArrayList < > ( L ) ;
    List < Integer > L3 = new ArrayList < > ( L ) ;
    List < Integer > L4 = new ArrayList < > ( L ) ;
    List < Integer > ans = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < 8 ;
    i ++ ) {
      ans . add ( Math . max ( x , y ) ) ;
    }
    int [ ] X = new int [ 8 ] ;
    int [ ] Y = new int [ 8 ] ;
    int [ ] Z = new int [ 8 ] ;
    for ( int i = 0 ;
    i < 8 ;
    i ++ ) {
      X [ 0 ] += L1 [ i ] [ 0 ] ;
      X [ 1 ] += L1 [ - i - 1 ] [ 0 ] ;
      X [ 2 ] += L2 [ i ] [ 0 ] ;
      X [ 3 ] += L2 [ - i - 1 ] [ 0 ] ;
      X [ 4 ] += L3 [ i ] [ 0 ] ;
      X [ 5 ] += L3 [ - i - 1 ] [ 0 ] ;
      X [ 6 ] += L4 [ i ] [ 0 ] ;
      X [ 7 ] += L4 [ - i - 1 ] [ 0 ] ;
      Y [ 0 ] += L1 [ i ] [ 1 ] ;
      Y [ 1 ] += L1 [ - i - 1 ] [ 1 ] ;
      Y [ 2 ] += L2 [ i ] [ 1 ] ;
      Y [ 3 ] += L2 [ - i - 1 ] [ 1 ] ;
      Z [ 4 ] += L3 [ i ] [ 2 ] ;
      Z [ 5 ] += L3 [ - i - 1 ] [ 1 ] ;
      Z [ 6 ] += L4 [ i ] [ 2 ] ;
      Z [ 7 ] += L4 [ - i - 1 ] [ 2 ] ;
    }
    return ans . toArray ( ) ;
  }
  