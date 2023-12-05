def import java.io.InputStream , java.io.OutputStream , * args , ** kwargs ) :
    from java.io import InputStream , OutputStream , IntStream
    from java.io import InputStream , OutputStream , IntStream
    from java.lang import Integer
    from java.lang import System
    from java.lang import System
    from java.lang import System
    from java.util import Deque , StringStream
    from java.lang import Integer
    from java.lang import System
    from java.util import Scanner , Text , StringStream
    from java.lang import Integer
    from java.util import Token
    Scanner = Scanner ( )
    try :
        t = Scanner ( )
        n = Scanner ( )
        q = deque ( )
        for i in range ( n ) :
            q.append ( Scanner ( ) )
        m = Scanner ( )
        for i in range ( m ) :
            x = Scanner ( )
            while True :
                h = q.popleft ( )
                if h is None or h > x :
                    print ( 'no' )
                    return
                if h + t >= x :
                    break
        print ( 'yes' )
    finally :
        Scanner.close ( )
