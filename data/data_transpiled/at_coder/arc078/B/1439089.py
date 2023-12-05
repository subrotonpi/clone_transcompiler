def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.adj = [ ]
    def add_edge ( self , u ) :
        self.adj [ u ].append ( v )
        self.adj [ v ].append ( u )
    class pair :
        def __init__ ( self , i , j ) :
            self.i , self.j = i , j
    def VertexColoring ( self , N ) :
        q = Queue ( )
        q.put ( pair ( 0 , 0 ) )
        q.put ( pair ( self , N - 1 , 1 ) )
        color = [ - 1 ] * N
        color.append ( - 1 )
        while not q.empty ( ) :
            p = q.get ( )
            if color [ p.i ] == - 1 :
                color [ p.i ] = p.j
                for ( i , j ) in enumerate ( self.adj [ p.i ] ) :
                    q.put ( pair ( i , j ) )
        s = [ 0 ] * 2
        for i in range ( self.N ) :
            s [ color [ i ] ] += 1
        return s [ 0 ] > s [ 1 ] and 'Fennec' or 'Snuke'
    def main ( self ) :
        with open ( self.path , 'r' ) as sc :
            V = sc.read ( )
            self.adj = [ ]
            for i in range ( V ) :
                u , v = sc.read ( )
                u -= 1
                v -= 1
                add_edge ( u , v )
            print ( VertexColoring ( V ) )
    Note :./ Main.py.uses.unchecked or unsafe.operations.Note : Recompile.with - Xlint : unchecked for details in Main.details
