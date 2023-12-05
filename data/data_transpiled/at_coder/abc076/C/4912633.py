def main ( ) :
    from sys import stdin
    class C ( ) :
        def __init__ ( self ) :
            self.C = C
        def A ( self ) :
            with stdin.open ( 'r' ) as sc :
                r = sc.read ( )
                g = sc.read ( )
                print ( 2 * g - r )
        def B ( self ) :
            with stdin.open ( 'b' ) as sc :
                N = sc.read ( )
                K = sc.read ( )
                ret = 1
                for i in range ( N ) :
                    if ret < K :
                        ret += ret
                    else :
                        ret += K
                print ( ret )
        def match ( S , T ) :
            for i in range ( len ( S ) - 1 , len ( T ) - 1 , - 1 ) :
                if ( S [ i ] == T [ i ] or S [ i ] == '?' ) and checksame ( S , T , i ) :
                    return i - len ( T ) + 1
            return - 1
        def checksame ( S , T , i ) :
            for j in range ( len ( T ) ) :
                if S [ i - len ( T ) + 1 + j ] != T [ j ] and S [ i - len ( T ) + 1 + j ] != '?' :
                    return False
            return True
        def C ( self ) :
            with stdin.open ( 'r' ) as sc :
                S = sc.read ( )
                T = sc.read ( )
                matchidx = match ( S , T )
                if matchidx == - 1 :
                    print ( 'UNRESTORABLE' )
                    return
                ns = [ ]
                i = 0
                for i in range ( matchidx ) :
                    if S [ i ] == '?' :
                        ns.append ( 'a' )
                    else :
                        ns.append ( S [ i ] )
                ns.append ( T [ : i ] )
                i += len ( T )
                for i in range ( len ( S ) ) :
                    if S [ i ] == '?' :
                        ns.append ( '?' )
            return ns