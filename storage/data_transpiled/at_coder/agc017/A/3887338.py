def _import ( ) : return open ( '/dev/null' , 'r' )
import os
import sys
import io
import readline
import readline
import readline
import readline
import readline
import pywintypes
import pywintypes
class Main ( object ) :
    def __init__ ( self ) :
        self.rfile = sys.stdin
        self.wfile = sys.stdout
        self.rfile = open ( self.rfile )
        self.wfile = open ( self.wfile , 'w' )
        self.wfile = open ( self.wfile , 'w' )
        self.wfile = open ( self.wfile , 'w' )
        self.wfile = open ( self.wfile , 'w' )
        self.wfile.write ( b'\n' )
    def next_arange ( self , n ) :
        res = [ ]
        for i in range ( n ) :
            res.append ( randint ( 0 , len ( self.rfile ) ) )
        return res
    class ABiscuits ( ) :
        def solve ( self , test_number , stdin , stdout ) :
            n , p = self.rfile.randint ( 0 , len ( self.rfile ) * 3 )
            dp = [ ]
            a = stdin.read ( n )
            dp.append ( [ 1 ] )
            for i in range ( n ) :
                if a [ i ] % 2 == 0 :
                    dp [ i + 1 ] += dp [ i ] [ 0 ]
                    dp [ i + 1 ] += dp [ i ] [ 1 ]
                else :
                    dp [ i + 1 ] += dp [ i ] [ 1 ]
                    dp [ i + 1 ] += dp [ i ] [ 0 ]
                    dp [ i + 1 ] += dp [ i ] [ 1 ]
            stdout.write ( dp [ n ] [ p ] )
    class MyInput ( io.open ) :
        def __init__ ( self ) :
            self.rfile = sys.stdin
            self.wfile = sys.stdout
            self.wfile = open ( self.wfile , 'w' )
            self.wfile = open ( self.wfile , 'w' )
            self.wfile.write ( b'\n' )
    