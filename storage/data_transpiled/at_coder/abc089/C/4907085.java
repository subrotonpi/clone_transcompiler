public static int N = Integer . parseInt ( input ) {
  HashMap < String , Integer > dic = new HashMap < String , Integer > ( ) ;
  char [ ] list1 = {
    'M' , 'A' , 'R' , 'C' , 'H' }
    ;
    int [ ] list2 = {
      0 , 0 , 0 , 0 , 0 }
      ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        String s = new String ( input ) ;
        s = s . charAt ( 0 ) ;
        for ( int j = 0 ;
        j < 5 ;
        j ++ ) {
          if ( ( s . equals ( list1 [ j ] ) ) && ( dic . containsKey ( s ) ) ) {
            list2 [ j ] ++ ;
          }
        }
      }
      int a = list2 [ 0 ] , b = list2 [ 1 ] , c = list2 [ 2 ] , d = list2 [ 3 ] , e = list2 [ 4 ] ;
      int ans = a * b * c + a * b * d + a * b * e + a * c * d + a * c * e + a * d * e ;
      ans += b * c * d + b * c * e + b * c * e ;
      ans += c * d * e ;
      return ans ;
    }
    