def _import ( ) :
    import sys
    import os
    import sys
    import os
    import sys
    class C ( ) :
        def read ( ) :
            N , M = sc.regs [ 1 ]
            codes = [ ]
            for i in range ( N ) :
                codes.append ( sc.regs [ i ] )
        def debug ( * os ) :
            print ( deeprepr ( os ) )
        def main ( ) :
            try :
                sys.stdin = open ( sys.argv [ 1 ] if sys.argv [ 1 ] else ( sys.stdin ) , "r" )
            except :
                pass
            else :
                for i in range ( M ) :
                    u , v = sc.regs [ i ]
                    g [ u ] [ v ] = g [ v ] [ u ] = True
        def ok ( used ) :
            que = [ ]
            for i in range ( N ) :
                if used [ i ] == 1 :
                    que.append ( i )
                    used [ i ] = 2
            while not que.empty ( ) :
                v = que.pop ( )
                for u in range ( N ) :
                    if g [ v ] [ u ] and used [ u ] == 0 :
                        used [ u ] = 2
                        que.append ( u )
            for i in range ( N ) :
                if used [ i ] != 2 :
                    return False
            return True
        def solve ( ) :
            r = 0
            for i in range ( N ) :
                if codes [ r ] > codes [ i ] :
                    r = i
                used = [ ]
                res = [ codes [ r ] ]
                list = [ ]
                n = 0
                list.append ( r )
                used.append ( 1 )
                for k in range ( 1 , N ) :
                    p , q = - 1
                    for i in range ( n ) :
                        for v in range ( v ) :
                            if used [ v ] == 0 and g [ list [ i ] ] [ v ] :
                                if used [ v ] == 1 :
                                    p = i
                                    q = v
                return res
    return C
