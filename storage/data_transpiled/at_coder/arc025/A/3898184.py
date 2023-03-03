def import java.io.BufferedReader , os , sys , errno , * , args , ** kwargs ) :
    from java.io import BufferedReader , InputStreamReader , PIPE , CalledProcessError
    from java.lang import Enum , String
    class Main ( object ) :
        sc = SC ( sys.stdin )
        sum = 0
        j = [ ]
        m = [ ]
        for i in range ( 7 ) :
            j.append ( sc.nextInt ( ) )
        for i in range ( 7 ) :
            m.append ( sc.nextInt ( ) )
        for i in range ( 7 ) :
            sum += max ( m [ i ] , j [ i ] )
        pl ( sum )
    class SC ( object ) :
        def __init__ ( self , stream = None ) :
            self.stream = stream
            self.tokens = None
        def readline ( self ) :
            if not self.tokens or not self.tokens [ 0 ] :
                try :
                    self.tokens = iter ( self.stream.readline ( ) )
                except StopIteration :
                    raise OSError ( )
            return self.tokens [ 0 ]
        def __next__ ( self ) :
            return int ( self.next ( ) )
        def __next__ ( self ) :
            return long ( self.next ( ) )
        def nextDouble ( self ) :
            return float ( self.next ( ) )
        def readline ( self ) :
            try :
                return self.stream.readline ( )
            except StopIteration :
                raise OSError ( )
    pl ( )
    pl ( )
    pl ( )
    p ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
    pl ( )
