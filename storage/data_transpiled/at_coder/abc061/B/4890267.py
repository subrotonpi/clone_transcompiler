def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.M = sys.stdin.read ( )
        a = [ ]
        b = [ ]
        for i in range ( M ) :
            a.append ( sys.stdin.read ( ) )
            b.append ( sys.stdin.read ( ) )
        cnt = { }
        for i in range ( 1 , N + 1 ) :
            cnt [ i ] = 0
        for i in range ( M ) :
            cnt [ a [ i ] ] = cnt [ a [ i ] ] + 1
            cnt [ b [ i ] ] = cnt [ b [ i ] ] + 1
        for key in range ( 1 , N + 1 ) :
            sum = cnt [ key ]
            print ( sum )
