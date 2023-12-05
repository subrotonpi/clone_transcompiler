def import java.io
from java.io import StringIO
from java.util import Scanner , randint
from java.util import FastReader
from java.util import Scanner , get_scanner
class Main ( Scanner ) :
    def __init__ ( self ) :
        Scanner.__init__ ( self )
        self.n , self.a , self.b , self.c , self.d , self.e = Scanner.read ( )
    def run ( self ) :
        sc = FastReader ( )
        self.n , self.h , self.a , self.b , self.c , self.d , self.e = sc.read ( )
        self.solve ( )
    def solve ( self ) :
        b += self.e
        d += self.e
        diff = n * self.e - self.h
        ans = float ( 'inf' )
        for i in range ( 0 , self.n ) :
            temp_diff = diff - i * b
            min_j = temp_diff / d + 1
            if temp_diff < 0 :
                min_j = 0
            temp_ans = i * a + min_j * c
            if temp_ans < ans :
                ans = temp_ans
        print ( ans )
class FastReader ( Scanner ) :
    def readline ( self ) :
        while not isinstance ( self , Scanner ) or not self.hasNext :
            try :
                self.next = Scanner.readline ( self.n )
            except StopIteration :
                pass
        return None
    randint = randint ( 0 , min ( int ( x ) for x in range ( 0 , self.n ) ) )
    long = randint ( 0 , min ( int ( x ) for x in range ( 0 , self.a ) ) )
    double = uniform ( 0 , min ( float ( x ) for x in range ( 0 , self.b ) ) )
    def readline ( self ) :
        data = ''
        try :
            data = self.next ( )
        except StopIteration :
            pass
        return data
