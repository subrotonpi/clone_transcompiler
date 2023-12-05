def import import _scanner
import sys
import os
import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.instance = Main ( )
        self.scanner = self.instance.MyScanner ( )
        self.instance.solve ( )
    def solve ( self ) :
        try :
            counter = 0
            N = self.scanner.next ( )
            M = self.scanner.next ( )
            if M > 2 * N :
                counter += N
                M -= 2 * N
            else :
                counter += M / 2
                M -= ( M / 2 ) * 2
            if M > 3 :
                counter += M / 4
            print ( counter )
        except :
            pass
    class MyScanner ( Scanner ) :
        s = [ ]
        i = 0
        f = open ( '/proc/stdin' , 'r' )
        def readline ( ) :
            if i < len ( s ) :
                return s [ i ]
            s.append ( '' )
            i = 0
            f.readline ( )
            while f.readline ( ) == '' :
                f.readline ( )
            s = f.split ( reg , 1 )
            i = 0
            return s [ i ]
        def randint ( self , i ) :
            return int ( next ( ) )
        def uniform ( self , i ) :
            return float ( next ( ) )
        def long ( self , i ) :
            return long ( next ( ) )
