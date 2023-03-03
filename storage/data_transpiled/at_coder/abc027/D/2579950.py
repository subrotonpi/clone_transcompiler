def import java.io
from java.io import StringIO
from java.util import FastReader
from java.util import Vector
from java.util import Vector
from java.util import Vector
from java.util import Vector
class Main ( ) :
    def __init__ ( self , sc ) :
        FastReader ( )
        cs = sc.next ( ).split ( '' )
        self.solve ( )
    def solve ( self ) :
        list = [ ]
        plus = minus = 0
        for i in range ( len ( cs ) - 1 , - 1 , - 1 ) :
            if cs [ i ] == '+' :
                plus += 1
            elif cs [ i ] == '-' :
                minus += 1
            else :
                list.append ( plus - minus )
        list.sort ( )
        ans = 0
        for i in range ( len ( list ) ) :
            if i * 2 < len ( list ) :
                ans -= list [ i ]
            else :
                ans += list [ i ]
        print ( ans )
    class FastReader ( StringIO ) :
        def readline ( self ) :
            while not isinstance ( self , java.io.BufferedReader ) or not isinstance ( self , java.io.Vector ) :
                try :
                    s = FastReader ( self.read ( ) )
                except java.io.EOFException :
                    pass
                else :
                    return s
            return None
        def randint ( self ) :
            return int ( self.read ( ) )
        def long ( self ) :
            return long ( self.read ( ) )
        def double ( self ) :
            return double ( self.read ( ) )
        def readline ( self ) :
            data = ''
            try :
                data = sc.next ( ).split ( '' )
            except java.io.EOFException :
                pass
            return data
    return Main ( )
