static final Function < String , Integer > ni = new Function < String , Integer > ( ) {
  @ Override public Integer apply ( String input ) {
    return Integer . parseInt ( input ) ;
  }
}
;
Function < String , Integer > nm = new Function < String , Integer > ( ) {
  @ Override public Integer apply ( String input ) {
    return Integer . parseInt ( input ) ;
  }
}
;
Function < String , List < Integer >> nl = new Function < String , List < Integer >> ( ) {
  @ Override public List < Integer > apply ( String input ) {
    return Collections . singletonList ( input ) ;
  }
}
;
Function < String , String > ns = new Function < String , String > ( ) {
  @ Override public String apply ( String input ) {
    return input ;
  }
}
;
List < Integer > o = Collections . singletonList ( nl ) ;
List < Integer > e = Collections . singletonList ( o ) ;
String ans = "" ;
for ( int i = 0 ;
i < e . size ( ) ;
i ++ ) {
  ans += o . get ( i ) + e . get ( i ) ;
}
if ( o . size ( ) > e . size ( ) ) {
  ans += e . get ( o . size ( ) - e . size ( ) ) ;
}
return ans ;
}
