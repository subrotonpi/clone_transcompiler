def _import ( ) :
    import sys
    import io
    import io
    import os
    import io
    import io
    import io
    import codecs
    import codecs
    import struct
    import termios
    import struct
    import sys
    def read ( ) :
        c = read ( )
        while isSpaceChar ( c ) :
            c = read ( )
        if c == '' or c > '9' :
            raise InputError ( )
        res *= 10
        c = read ( )
        return res * sgn
    def isSpaceChar ( ch ) :
        if filter :
            return filter ( ch )
        return isWhitespace ( ch )
    def isWhitespace ( ch ) :
        return ch == '' or ch == '\n' or ch == '\r' or ch == '\t'
    def interface ( ch ) :
        return ch in isWhitespace
    def solve ( test_number , stream , out ) :
        n = struct.unpack ( '<H' , stream.read ( 1 ) ) [ 0 ]
        xs = [ ]
        for i in range ( n ) :
            xs.append ( i )
        bitcount = [ 0 ] * 20
        ans = 0
        for from_number , to_number in enumerate ( range ( 0 , n ) ) :
            if to_number < n :
                while True :
                    end = False
                    for bit in bitcount :
                        if bit == 2 :
                            end = True
                    if end :
                        break
                    to_number += 1
                if to_number == n :
                    break
                for bit in bitcount :
                    bitcount [ bit ] += xs [ to_number ] >> bit & 1
        out.print_ ( ans )
    class Writer :
        def __init__ ( self ) :
            self.stream = stream
        def __init__ ( self ) :
            self.stream = io.StringIO ( )
            self.stream.seek ( 0 )
            self.buf = [ ]
            self.curChar = ''
            self.numChars = 0
    return Writer ( )
