def _import ( ) :
    import sys
    import os
    import os
    import sys
    import io
    import io
    import codecs
    import codecs
    import codecs
    import codecs
    import codecs
    import codecs
    import codecs
    import codecs
    import codecs
    class Main :
        def __init__ ( self ) :
            self.inputStream = sys.stdin
            self.outputStream = sys.stdout
            self.inputreader = io.BufferedReader ( self.inputStream )
            self.outputwriter = io.BufferedWriter ( self.outputStream )
            self.writer = io.BufferedWriter ( self.outputStream )
            self.writer.write ( self.inputStream )
        def write ( self , * args ) :
            for i in range ( self.inputreader.read ( ) ) :
                self.writer.write ( ' ' )
            self.writer.write ( self.inputStream )
            self.writer.write ( self.outputStream )
            self.writer.close ( )
    class TaskC :
        def solve ( self , test_number , self , stream ) :
            a , b , c , d , e , f = stream.read ( )
            can = [ True ] * ( f // 100 + 1 )
            can [ 0 ] = True
            for i in range ( 1 , len ( can ) ) :
                can [ i ] = ( i >= a and can [ i - a ] ) or ( i >= b and can [ i - b ] )
            can2 = [ True ] * ( e * len ( can ) + 1 )
            bestn , beste = a , 0
            for i in can :
                for j in range ( 0 , e * i ) :
                    if i * 100 + j <= f and i <= can2 [ j ] :
                        if j * ( bestn * 100 + beste ) > beste * ( i * 100 + j ) :
                            bestn = i
                            beste = j
            stream.write ( ( bestn * 100 + beste ) + ' ' + '\n' )
            stream.flush ( )
            return stream
    return Main ( )
