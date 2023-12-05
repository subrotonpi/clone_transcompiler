def main ( args ) :
    from io import StringIO
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            solver = Solver_agc007d ( )
            solver.input ( )
            solver.solve ( )
    class FastScanner ( Scanner ) :
        def readline ( self ) :
            while not self.eof or not self.eof :
                try :
                    self.readline ( )
                except IOError :
                    sys.stderr.write ( "Can't read more inputs." )
                    raise
            return self.readline ( )
        def __next__ ( self ) :
            return int ( self.__next__ )
        def __next__ ( self ) :
            return long ( self.__next__ )
        def __next__ ( self ) :
            return float ( self.__next__ )
        def readNextLine ( self ) :
            data = ""
            try :
                data = self.__next__ ( )
            except EOFError :
                pass
            return data
    class Solver_agc007d ( FastScanner ) :
        def readline ( self ) :
            return sys.stdin.readline ( )
    def write ( self , out ) :
        n , e , T , a = [ ] , [ ] , [ ] , [ ] , [ ]
        f = [ ]
        def input ( self ) :
            n , e , T , a = [ int ( i ) for i in self.readline ( ).split ( ) ]
            f.append ( min_py_ + 2 * a [ i ] )
            while self.pop ( ).val > self.pop ( ).pop ( ) :
                self.pop ( )
        class DequeItem ( DequeItem ) :
            def __init__ ( self , index_ , val_ ) :
                self.index = index_
                self.val = val_
            def index ( self ) :
                self.index = self.pop ( ).val
        def solve ( self ) :
            j_ = 1
            min_py_ = int ( self.pop ( ).val >> 1 )
            deque = deque.deque ( )
            deque.offer ( DequeItem ( 1 , self.pop ( ) ) )
            for i in range ( 1 , n + 1