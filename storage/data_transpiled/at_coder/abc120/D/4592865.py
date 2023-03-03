def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( )
        m = sc.readline ( )
        a = [ sc.readline ( ) - 1 for i in range ( m ) ]
        b = [ sc.readline ( ) - 1 for i in range ( m ) ]
        answer = [ long ( n ) ] * ( n - 1 ) / 2
        uf = UnionFind ( n )
        for i in range ( m - 1 , 1 , - 1 ) :
            answer [ i - 1 ] = answer [ i ]
            if uf.root ( a [ i ] ) != uf.root ( b [ i ] ) :
                answer [ i - 1 ] -= long ( uf.size ( a [ i ] ) * uf.size ( b [ i ] ) )
                uf.connect ( a [ i ] , b [ i ] )
        for i in range ( m ) :
            print ( answer [ i ] )
    def UnionFind ( n ) :
        parents = [ - 1 ] * n
        def size ( node ) :
            return - parents [ root ( node ) ]
        def root ( node ) :
            if not parents [ node ] :
                return node
            else :
                return parents [ node ]
        def connect ( node1 , node2 ) :
            root1 = root ( node1 )
            root2 = root ( node2 )
            if root1 == root2 :
                return False
            else :
                if root1 < root2 :
                    temp = root1
                    root1 = root2
                    root2 = temp
                parents [ root1 ] += parents [ root2 ]
                parents [ root2 ] = root1
                return True
return Main
