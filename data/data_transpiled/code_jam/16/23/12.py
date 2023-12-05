def _import ( ) : return _import ( )
class FlowGraph :
    def __init__ ( self , fr , to ) :
        self.xor = fr ^ to
    def other ( self , i ) :
        return i ^ xor
    def res ( self , j ) :
        return i < j
    def run ( self , args ) :
        try :
            f = open ( args [ 0 ] )
            out = open ( args [ 0 ] + ".out" , "w" )
            T = self.get_int ( f )
            for t in range ( 1 , T ) :
                A = { }
                B = { }
                N = self.get_int ( f )
        except IOError :
            return int ( f.readline ( ) )
    def getInts ( self ) :
        words = self.split ( " " )
        for i in range ( len ( words ) ) :
            w = words [ i ]
        return [ ]
    def compute ( self , A , B ) :
        N = self.N + 2
        s = self.N - 1
        t = self.N - 2
        G = FlowGraph ( N )
        for i in range ( len ( words ) ) :
            w = words [ i ]
            if not w in A :
                A [ w [ 0 ] ] = A [ i ]
            if not w in B :
                B [ w [ 1 ] ] = B [ i ]
            D [ i ] [ 0 ] = e
            D [ i ] [ 1 ] = B [ w [ 1 ] ]
        out.write ( "Case #%d: %s\n" % ( t , self.N , compute ( self , A [ i ] , B [ i ] ) ) )
    def main ( self ) :
        return self.N
    def flow ( self , * args ) :
        return self.N
    def cap ( self , i , j , cap ) :
        e = get ( self , i , j )
        if i < j :
            e.hi = cap
        else :
            e.lo = - cap
    def add ( self , i , j , d ) :
        self.add ( i , j , d )
