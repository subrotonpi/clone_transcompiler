def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.readline ( ).strip ( )
        self.Q = sys.stdin.readline ( ).strip ( )
        S = self.S
        S2 = S.replace ( 'AC' , '10' )
        AC = [ ]
        if S2 [ 0 ] == '1' : AC.append ( 1 )
        for i in range ( 1 , N ) :
            if S2 [ i ] == '1' : AC [ i ] = AC [ i - 1 ] + 1
            else : AC [ i ] = AC [ i - 1 ]
    def run ( self ) :
        for i in range ( self.Q ) :
            l = sys.stdin.readline ( ).strip ( )
            r = sys.stdin.readline ( ).strip ( )
            if l == 1 :
                print ( AC [ r - 2 ] )
            else :
                print ( AC [ r - 2 ] - AC [ l - 2 ] )
