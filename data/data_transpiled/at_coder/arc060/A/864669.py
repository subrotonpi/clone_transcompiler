def _import ( ) : return sys.stdin.read ( )
import io
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import sys
import sys
class FastPrinter ( io.TextIO ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.stream = sys.stdout
        self.stdin = FastScanner ( self.stream )
        self.stdout = FastPrinter ( self.stream )
        self.solver = Cards ( )
        self.solver.solve ( 1 , self.stdin , self.stdout )
        self.stdout.close ( )
class Cards ( ) :
    def solve ( self , test_number , stdin , stdout ) :
        n = stdin.read ( )
        x = stdin.read ( )
        sh = 50 * 50 + 1
        dp = [ 1 ] * 2 * sh
        for i in range ( n ) :
            y = stdin.read ( ) - x
            next = [ ]
            if y <= 0 :
                for j in range ( 2 * sh ) :
                    next.append ( dp [ j ] )
                    if j - y < 2 * sh :
                        next.append ( dp [ j - y ] )
            else :
                for j in range ( 2 * sh - 1 , - 1 , - 1 ) :
                    next.append ( dp [ j ] )
                    if j - y >= 0 :
                        next.append ( dp [ j - y ] )
            dp = next
        stdout.write ( dp [ sh ] - 1 )
class FastScanner ( io.TextIO ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.stdin = StringIO ( )
        self.stdout = StringIO ( )
        self.stdin.read ( )
        self.stdout.close ( )
    def isWhiteSpace ( self ) :
        return self.ch in '-'
    def read ( self ) :
        c = read ( )
        while isWhiteSpace ( c ) :
            c = read ( )
        sgn = 1
        if c == '-' :
            sgn = - 1
        return sgn
