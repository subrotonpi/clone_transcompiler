def import _readline
import sys
import readline
import Queue
import sys
class Main ( object ) :
    def __init__ ( self , args ) :
        self.input = Input ( )
        import readline
        l = readline ( )
        q = self.col_queue
        readline ( )
        ans = 0
        while not q.empty ( ) :
            d = q.get ( )
            while d % 2 == 0 :
                ans += 1
                d /= 2
        print ( ans )
class Input ( object ) :
    def __init__ ( self , l ) :
        self.input = Input ( )
    def close ( self ) :
        self.input.close ( )
    def readline ( self ) :
        return Data ( self.input.readline ( ).split ( ) )
    def data_queue ( num ) :
        global q
        q = Queue.Queue ( )
        for i in range ( num ) :
            q.put ( readline ( ) )
        return q
    def col_queue ( ) :
        d = readline ( )
        global q
        q = Queue.Queue ( )
        for i in d.col :
            q.put ( d.col [ i ] )
        return q
class Data ( object ) :
    def __init__ ( self , values ) :
        self.col = [ int ( v ) for v in values.split ( ) ]
