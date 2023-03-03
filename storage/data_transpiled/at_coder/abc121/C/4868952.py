def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        M = sys.stdin.read ( )
        A , B = [ ] , [ ]
        al = [ ]
        for i in range ( N ) :
            A.append ( sys.stdin.read ( ) )
            B.append ( sys.stdin.read ( ) )
            al.append ( ( A [ i ] , B [ i ] ) )
        al.sort ( key = lambda x : x [ 0 ] )
        shop = 0
        money = 0
        while True :
            stock , price = al [ shop ] [ 1 ] , al [ shop ] [ 0 ]
            if stock < M :
                money += price * stock
                M -= stock
                shop += 1
            else :
                money += price * M
                break
        print ( money )
