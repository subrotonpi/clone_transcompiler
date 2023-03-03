def gcj2009 ( qual = 'A' ) :
    import sys
    import os
    import sys
    import os
    import math
    class A ( object ) :
        INF = 1 << 20
        def __init__ ( self ) :
            key = sc.next ( ).split ( )
            b = [ [ False ] * [ 127 ] for i , j in enumerate ( key ) if i == '(' ]
            while key [ j ] != ')' :
                b [ j ] [ key [ j ] ] = True
            else :
                b [ j ] [ key [ i ] ] = True
        ans = 0
        loop : for cs in self.css :
            for i in range ( L ) :
                if not b [ i ] [ cs [ i ] ] : continue loop
                ans += 1
        print ( ans )
    def main ( * args ) :
        try :
            sys.stdin = open ( 'A-large.in' , 'r' )
            sys.stdout = open ( 'A-large.out' , 'w' )
        except :
            pass
        sc = sys.stdin
        L , D , N = sc.regs [ 0 ]
        css = [ [ sc.regs [ 0 ] [ i ] for i in range ( D ) ] for i in range ( N ) ]
        for n in range ( 1 , N + 1 ) :
            print ( 'Case #%d: ' % n )
            yield A ( )
    L , D = 0 , 0
