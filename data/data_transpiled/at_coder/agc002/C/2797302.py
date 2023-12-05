def _import ( ) : return [ int ( x ) for x in range ( 1 , N ) ]
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.L = 0
        self.A = [ ]
        f = sys.stdout.fileno ( )
        answer = self.solve ( )
        if answer is not None :
            f.write ( "Possible\n" )
            for each in answer.values :
                f.write ( each )
        else :
            f.write ( "Impossible\n" )
        f.flush ( )
    def solve ( self ) :
        safe = - 1
        for i in range ( 1 , N - 1 ) :
            if self.A [ i - 1 ] + self.A [ i ] >= L :
                safe = i
                break
        if safe == - 1 : return None
        values = [ i for i in range ( 1 , safe ) if self.A [ i ] == A [ i ] ]
        values.append ( safe )
        return Answer ( values )
    class Answer ( object ) :
        def __init__ ( self , values ) :
            self.values = values
class FastScanner ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.stream = stream
    def readline ( self ) :
        if self.stream is None or not self.stream.readline ( ) :
            try :
                self.stream = sys.stdin.readline ( )
            except EOFError :
                pass
        return self.stream.readline ( )
    def readline ( self ) :
        if self.stream is None or not self.stream.readline ( ) :
            try :
                return self.stream.readline ( )
            except EOFError :
                pass
        return self.stream.readline ( )
    def readline ( self ) :
        return int ( self.stream.readline ( ) )
    def readline ( self ) :
        return int ( self.stream.readline ( ) )
return Main
