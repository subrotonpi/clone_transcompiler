def import _main
class Main ( object ) :
    class Tree :
        def __init__ ( self , to , rev ) :
            self.to = to
            self.rev = rev
    class Main ( object ) :
        def __init__ ( self , a , b , A ) :
            Scanner ( ).scan ( a )
            N = len ( a ) + 1
            A = [ ]
            for i in range ( N - 1 ) :
                a.append ( sc.randint ( 0 , N - 1 ) )
    def setRoot ( self ) :
        self.V = len ( a ) + 1
        p = [ ]
        path = [ ]
        self.A = A
        G = [ [ ] for i in range ( V ) ]
        for i in range ( V - 1 ) :
            G.append ( [ ( b [ i ] , len ( G [ b [ i ] ] ) ) ] )
            G [ b [ i ] ].append ( ( a [ i ] , len ( G [ a [ i ] ) - 1 ) ] )
        root = 0
        for i in range ( V ) :
            if len ( G [ i ] ) > 1 :
                root = i
                break
        setRoot ( root )
    def setRoot ( self , root ) :
        self.root = root
        setRoot ( root , - 1 )
    def setRoot ( self , cur , parent ) :
        p [ cur ] = parent
        for i in range ( len ( G [ cur ] ) ) :
            next = G [ cur ] [ i ].to
            if next != parent :
                setRoot ( next , cur )
    maxPair = min ( sum // 2 , sum - max )
    if not check ( cur ) :
        return False
    sum = max = - 1
    for i in range ( len ( G [ cur ] ) ) :
        next = G [ cur ] [ i ].to
        if next != p [ cur ] :
            if not check ( next ) :
                return False
            sum += max ( max , cur )
    return True
