def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main.sc
        mod = 1000000007
    def main ( self ) :
        a = sc.next ( )
        b = sc.next ( )
        ans = "EQUAL"
        if len ( a ) > len ( b ) :
            ans = "GREATER"
        elif len ( a ) < len ( b ) :
            ans = "LESS"
        else :
            for i in range ( len ( a ) ) :
                if a [ i ] - '0' > b [ i ] - '0' :
                    ans = "GREATER"
                    break
                elif a [ i ] - '0' < b [ i ] - '0' :
                    ans = "LESS"
                    break
        print ( ans )
