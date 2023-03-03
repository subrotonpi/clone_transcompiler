def import readline
import sys
import random
class Main ( object ) :
    def __next__ ( self ) :
        sc = MyScanner ( )
        out = open ( '/dev/tty' , 'w' )
        n , m , k = sc.__next__ ( )
        g = [ 0 ] * n
        for i in range ( m ) :
            a , b = sc.__next__ ( )
            g [ a ] |= 1 << b
            g [ b ] |= 1 << a
    I = 1000000
    iter = I
    seat = [ ]
    p = 0
    rnd = random.Random ( 'taplis'.encode ( 'hex' ) )
    while iter :
        for i in range ( n ) :
            seat.append ( i )
        for i in range ( k ) :
            x = - 1
            y = - 1
            if n == 2 :
                x = 0
                y = 1
            else :
                while True :
                    x , y = rnd.randint ( 0 , n )
                t = seat [ x ]
                seat [ x ] = seat [ y ]
                seat [ y ] = t
            ok = True
            for i in range ( n ) :
                x , y = seat [ ( i + 1 ) % n ]
                if ( g [ x ] & 1 << y ) != 0 :
                    ok = False
                    break
            if ok :
                p += 1
        out.write ( p / I )
        out.close ( )
class Main ( object ) :
    def __init__ ( self , out = sys.stdout ) :
        self.out = out
    def __next__ ( self ) :
        while self.out is None or not self.out.startswith ( '/' ) :
            try :
                self.out = raw_input ( )
            except EOFError :
                pass
        return self.out
    def __next__ ( self ) :
        return int ( next ( self ) )
    def __next__ ( self ) :
        return int ( next ( self ) )
