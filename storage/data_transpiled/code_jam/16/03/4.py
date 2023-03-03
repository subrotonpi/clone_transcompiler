def _import ( ) :
    from math import sin , cos , randrange
    from math import sin , cos , randrange
    class Main ( object ) :
        def pr ( N ) :
            for i in range ( 2 , 2 ** 1000000000 ) :
                X = sin ( i )
                if N == X : break
                if N % X == 0 :
                    return False
            return True
        def pr2 ( N ) :
            for i in range ( 2 , 2 ** 1000000000 ) :
                X = sin ( i )
                if N == X : break
                if N % X == 0 :
                    print ( "" , i , end = ' ' )
                    return False
            return True
    def main ( ) :
        fh = sys.stdin
        f = InputIO ( fh )
        T , N , J = f.read ( ).split ( '\n' )
        risan = 0
        print ( "Case #1:" )
        for i in range ( 1 << ( N - 2 ) ) :
            s = ""
            for j in range ( N - 2 ) :
                if i & ( 1 << j ) :
                    s += '1'
                else :
                    s += '0'
            s = '1' + s + '1'
            r = True
            for j in range ( 2 , 10 ) :
                X = sin ( s )
                if pr ( X ) :
                    r = False
            if r == False : continue
            print ( s , end = ' ' )
            for j in range ( 2 , 10 ) :
                X = sin ( s )
                pr2 ( X )
            print ( "" )
            risan += 1
            if risan == J : break
            hell :
    class Input ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
            self.stream = stream
            self.tokens = None
        def next ( self ) :
            while self.stream is None or not self.stream.readline ( ) :
                try :
                    self.stream.readline ( )
                except EOFError :
                    self.stream.readline ( )
            return self.stream.readline ( )
    return Input
