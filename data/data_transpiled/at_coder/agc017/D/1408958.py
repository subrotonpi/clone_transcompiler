def import import sys , stdin , stdout , stderr , n , head , nx , dst , dfs , count , line , count , verbose , verbose , args , verbose , filename , line , verbose , filename , count , verbose , filename , * args , ** kwargs ) :
    n = randint ( 1 , n )
    init ( n )
    for i in range ( n - 1 ) :
        add_edge ( randint ( - 1 , n - 1 ) , randint ( - 1 , n - 1 ) )
    if dfs ( 0 , - 1 ) > 0 :
        stdout.write ( "Alice\n" )
    else :
        stdout.write ( "Bob\n" )
    def init ( n ) :
        self.n = n
        self.m = ( n - 1 ) * 2
        self.last = 0
        head = [ ]
        self.nx = [ ]
        self.dst = [ ]
        [ x , y ] = head [ x ]
    def addEdge ( x , y ) :
        self.nx.append ( head [ x ] )
        self.dst.append ( y )
        head [ x ] = self.last
        self.last += 1
        self.nx.append ( head [ y ] )
        self.dst.append ( x )
        self.head [ y ] = self.last
        self.last += 1
    def dfs ( x , p ) :
        j = self.head [ x ]
        res = 0
        while j >= 0 :
            y = self.dst [ j ]
            if y != p :
                res ^= dfs ( y , x ) + 1
            j = self.nx [ j ]
        return res
    n , m = len ( head ) , len ( head )
    head = [ ]
    self.nx = [ ]
    self.dst = [ ]
    self.last = 0
    f = stdin.readline ( )
    while f is not None or not f.readline ( ) :
        f = f.readline ( )
    next = f.readline ( )
    while f is not None :
        f = next ( f )
    return next , next
