def _import ( ) :
    from math import sin , cos , cos , log
    from itertools import chain , repeat
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            self.N = len ( sys.argv )
        def run ( self ) :
            sc = sys.stdin
            N = sc.recv_handle ( )
            l = [ ]
            r = [ ]
            len = [ ]
            ans = 0
            for i in range ( N ) :
                l.append ( sc.randint ( - 1 , 1 ) )
                r.append ( sc.randint ( - 1 , 1 ) )
                len.append ( r [ - 1 ] )
            pqL = chain ( ( l [ 0 ] , ) , ( l [ 0 ] , ) )
            pqR = chain ( ( l [ 0 ] , ) , ( l [ 0 ] , ) )
            for i in range ( 1 , N ) :
                slideL -= len [ i ]
                slideR += len [ i - 1 ]
                L = pqL [ - 1 ] + slideL
                R = pqR [ - 1 ] + slideR
                if L <= l [ i ] <= R :
                    pqL.append ( l [ i ] - slideL )
                    pqR.append ( l [ i ] - slideR )
                else :
                    if l [ i ] < L :
                        pqL.pop ( )
                        pqL.append ( l [ i ] - slideL )
                        pqL.append ( l [ i ] - slideL )
                        pqR.append ( L - slideR )
                        L = pqL [ - 1 ] + slideL
                        R = pqR [ - 1 ] + slideR
                        ans += ( R - l [ i ] )
                    else :
                        pqR.pop ( )
                        pqR.append ( l [ i ] - slideR )
                        pqR.append ( l [ - 1 ] - slideL )
                        pqL.append ( r [ - 1 ] - slideR )
                        pqR.append ( l [ - 1 ] - slideR )
                        ans += ( R - l [ i ] )
            print ( ans )
