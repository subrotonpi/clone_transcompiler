def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        S = sc.next ( )
        N = int ( S )
        ans = 0
        for i in range ( 3 , len ( S ) - 1 ) :
            ans += int ( pow ( 3 , i ) - 3 * int ( pow ( 2 , i ) ) + 3 )
        ans += f ( 3 * int ( pow ( 10 , len ( S ) - 1 ) ) , S [ - 2 ] )
        ans += f ( 5 * int ( pow ( 10 , len ( S ) - 1 ) ) , S [ - 2 ] )
        ans += f ( 7 * int ( pow ( 10 , len ( S ) - 1 ) ) , S [ - 2 ] )
        print ( ans )
    def f ( self , a , m ) :
        if m >= 0 :
            return f ( self , a + 3 * int ( pow ( 10 , m ) ) , m - 1 ) + f ( self , a + 5 * int ( pow ( 10 , m ) ) , m - 1 ) + f ( self , a + 7 * int ( pow ( 10 , m ) ) , m - 1 )
        else :
            s = str ( a )
            if s.find ( "3" ) != - 1 and s.find ( "5" ) != - 1 and s.find ( "7" ) != - 1 and a <= N :
                return 1
            else :
                return 0
return Main
