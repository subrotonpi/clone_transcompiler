def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        a = [ 0 ] * 100001
        b = [ - 1 ] * 100001
        for i in range ( 2 , 100001 ) :
            a [ i ] += a [ i - 1 ]
            if b [ i ] != - 1 :
                k = i
                k += i
                while k < 100001 :
                    b [ k ] = - 1
                    k += i
                if b [ ( i + 1 ) / 2 ] != - 1 :
                    a [ i ] += 1
    q = sys.stdin.read ( )
    ans = [ ]
    for l , r in sys.stdin.read ( ).split ( '\n' ) :
        ans.append ( a [ r ] - a [ l - 1 ] )
    for i in range ( q ) :
        print ( ans [ i ] )
